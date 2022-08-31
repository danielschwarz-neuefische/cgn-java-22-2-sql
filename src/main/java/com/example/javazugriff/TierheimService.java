package com.example.javazugriff;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TierheimService {

    private final TierheimRepository tierheimRepository;

    public TierheimService(TierheimRepository tierheimRepository) {
        this.tierheimRepository = tierheimRepository;
    }

    public Iterable<Tierheim> getTierheime() {
        return tierheimRepository.findAll();
    }
}
