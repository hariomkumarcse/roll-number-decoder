package com.hariom.rolldecoder.service.impl;

import com.hariom.rolldecoder.exception.InvalidRollNumberException;
import com.hariom.rolldecoder.model.constants.BranchCodes;
import com.hariom.rolldecoder.model.constants.CollegeCodes;
import com.hariom.rolldecoder.model.dto.DecodedRollNumberDto;
import com.hariom.rolldecoder.model.entity.RollNumberSearchLog;
import com.hariom.rolldecoder.repository.RollNumberSearchLogRepository;
import com.hariom.rolldecoder.service.RollNumberDecoderService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Ports the decoding logic from the legacy Core Java Student.java class.
 *
 * Roll number layout (13 digits total):
 *   positions 0-2  -> year of admission     (2 digits)
 *   positions 2-6  -> college code           (4 digits)
 *   positions 6-9  -> branch code            (3 digits)
 *   positions 9-13 -> serial number          (4 digits)
 */
@Service
public class RollNumberDecoderServiceImpl implements RollNumberDecoderService {

    private static final int EXPECTED_LENGTH = 13;
    private static final int LATERAL_ENTRY_THRESHOLD = 9001;

    private final RollNumberSearchLogRepository searchLogRepository;

    public RollNumberDecoderServiceImpl(RollNumberSearchLogRepository searchLogRepository) {
        this.searchLogRepository = searchLogRepository;
    }

    @Override
    public DecodedRollNumberDto decode(String rollNumber) {
        try {
            DecodedRollNumberDto dto = doDecode(rollNumber);
            logAttempt(rollNumber, true, null);
            return dto;
        } catch (InvalidRollNumberException ex) {
            logAttempt(rollNumber, false, ex.getMessage());
            throw ex;
        }
    }

    private DecodedRollNumberDto doDecode(String rollNumber) {
        if (rollNumber == null || rollNumber.isBlank()) {
            throw new InvalidRollNumberException("Roll number must not be empty.");
        }

        String trimmed = rollNumber.trim();

        if (!trimmed.chars().allMatch(Character::isDigit)) {
            throw new InvalidRollNumberException("Roll number must contain digits only.");
        }

        if (trimmed.length() != EXPECTED_LENGTH) {
            throw new InvalidRollNumberException(
                    "Roll number must be exactly " + EXPECTED_LENGTH + " digits long (got " + trimmed.length() + ").");
        }

        int yearOfAdmission = Integer.parseInt(trimmed.substring(0, 2));
        int collegeCode = Integer.parseInt(trimmed.substring(2, 6));
        int branchCode = Integer.parseInt(trimmed.substring(6, 9));
        int serialNumber = Integer.parseInt(trimmed.substring(9, 13));

        String admissionType = serialNumber >= LATERAL_ENTRY_THRESHOLD ? "Lateral" : "Regular";

        String collegeName = CollegeCodes.nameFor(collegeCode);
        String branchName = BranchCodes.nameFor(branchCode);

        return new DecodedRollNumberDto(
                trimmed, yearOfAdmission, collegeCode, collegeName,
                branchCode, branchName, serialNumber, admissionType
        );
    }

    private void logAttempt(String rollNumber, boolean successful, String failureReason) {
        searchLogRepository.save(
                new RollNumberSearchLog(rollNumber, LocalDateTime.now(), successful, failureReason)
        );
    }
}
