package com.hariom.rolldecoder;

import com.hariom.rolldecoder.exception.InvalidRollNumberException;
import com.hariom.rolldecoder.model.dto.DecodedRollNumberDto;
import com.hariom.rolldecoder.repository.RollNumberSearchLogRepository;
import com.hariom.rolldecoder.service.impl.RollNumberDecoderServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RollNumberDecoderServiceImplTest {

    private RollNumberDecoderServiceImpl service;

    @BeforeEach
    void setUp() {
        RollNumberSearchLogRepository repository = Mockito.mock(RollNumberSearchLogRepository.class);
        service = new RollNumberDecoderServiceImpl(repository);
    }

    @Test
    void decodesValidRegularRollNumber() {
        DecodedRollNumberDto dto = service.decode("2402920100075");

        assertEquals(2024, dto.getFullYear());
        assertEquals(292, dto.getCollegeCode());
        assertEquals("MIT Meerut", dto.getCollegeName());
        assertEquals(10, dto.getBranchCode());
        assertEquals(75, dto.getSerialNumber());
        assertEquals("Regular", dto.getAdmissionType());
    }

    @Test
    void decodesLateralEntryRollNumber() {
        DecodedRollNumberDto dto = service.decode("2402920109005");

        assertEquals("Lateral", dto.getAdmissionType());
    }

    @Test
    void rejectsWrongLength() {
        assertThrows(InvalidRollNumberException.class, () -> service.decode("12345"));
    }

    @Test
    void rejectsNonNumeric() {
        assertThrows(InvalidRollNumberException.class, () -> service.decode("24A2920100075"));
    }

    @Test
    void rejectsEmptyInput() {
        assertThrows(InvalidRollNumberException.class, () -> service.decode(""));
    }

    @Test
    void unknownCollegeAndBranchDegradeGracefully() {
        DecodedRollNumberDto dto = service.decode("2499999999999");

        assertEquals("Unknown College", dto.getCollegeName());
        assertEquals("Unknown Branch", dto.getBranchName());
    }
}
