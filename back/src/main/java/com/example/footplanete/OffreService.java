package com.example.footplanete;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OffreService {

    OffreRepository offreRepository;
    public OffreService(OffreRepository offreRepository) {
        this.offreRepository = offreRepository;
    }

    public List<Offre> getAllServices() {
        return offreRepository.findAll();
    }

    @Transactional
    public void saveOffre(Offre offre) {
        offreRepository.save(offre);
    }
}
