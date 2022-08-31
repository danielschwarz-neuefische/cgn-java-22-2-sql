package com.example.javazugriff;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tierheim")
public class TierheimController {

    private final TierheimService tierheimService;

    public TierheimController(TierheimService tierheimService) {
        this.tierheimService = tierheimService;
    }

    @GetMapping
    Iterable<Tierheim> getTierheime() {
        return tierheimService.getTierheime();
    }
}
