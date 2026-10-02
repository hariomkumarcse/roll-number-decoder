package com.hariom.rolldecoder.controller;

import com.hariom.rolldecoder.model.dto.DecodedRollNumberDto;
import com.hariom.rolldecoder.service.RollNumberDecoderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/roll")
public class RollNumberApiController {

    private final RollNumberDecoderService decoderService;

    public RollNumberApiController(RollNumberDecoderService decoderService) {
        this.decoderService = decoderService;
    }

    // GET /api/roll/2402920100075
    @GetMapping("/{rollNumber}")
    public DecodedRollNumberDto decode(@PathVariable String rollNumber) {
        return decoderService.decode(rollNumber);
    }
}
