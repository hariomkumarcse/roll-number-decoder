package com.hariom.rolldecoder.controller;

import com.hariom.rolldecoder.exception.InvalidRollNumberException;
import com.hariom.rolldecoder.model.dto.DecodedRollNumberDto;
import com.hariom.rolldecoder.repository.RollNumberSearchLogRepository;
import com.hariom.rolldecoder.service.RollNumberDecoderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RollNumberViewController {

    private final RollNumberDecoderService decoderService;
    private final RollNumberSearchLogRepository searchLogRepository;

    public RollNumberViewController(RollNumberDecoderService decoderService,
                                     RollNumberSearchLogRepository searchLogRepository) {
        this.decoderService = decoderService;
        this.searchLogRepository = searchLogRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("activePage", "home");
        model.addAttribute("recentSearches", searchLogRepository.findTop10ByOrderBySearchedAtDesc());
        return "index";
    }

    @PostMapping("/decode")
    public String decode(@RequestParam("rollNumber") String rollNumber, Model model) {
        try {
            DecodedRollNumberDto decoded = decoderService.decode(rollNumber);
            model.addAttribute("activePage", "home");
            model.addAttribute("decoded", decoded);
            return "result";
        } catch (InvalidRollNumberException ex) {
            model.addAttribute("activePage", "home");
            model.addAttribute("errorMessage", ex.getMessage());
            model.addAttribute("submittedValue", rollNumber);
            model.addAttribute("recentSearches", searchLogRepository.findTop10ByOrderBySearchedAtDesc());
            return "index";
        }
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("activePage", "about");
        return "about";
    }
}
