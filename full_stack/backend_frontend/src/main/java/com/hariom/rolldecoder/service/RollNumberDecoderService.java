package com.hariom.rolldecoder.service;

import com.hariom.rolldecoder.model.dto.DecodedRollNumberDto;

public interface RollNumberDecoderService {

    /**
     * Validates and decodes a roll number, logging the attempt to the database.
     *
     * @throws com.hariom.rolldecoder.exception.InvalidRollNumberException if the format is invalid
     */
    DecodedRollNumberDto decode(String rollNumber);
}
