package com.esprit.microservise.reclamationgestions.chat2Service;

import com.esprit.microservise.reclamationgestions.model.Reclamation;
import com.esprit.microservise.reclamationgestions.repositories.ReclamationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReclamationService {

    private final ReclamationRepository reclamationRepository;

    @Autowired
    public ReclamationService(ReclamationRepository reclamationRepository) {
        this.reclamationRepository = reclamationRepository;
    }

    public List<Reclamation> getAllReclamations() {
        return reclamationRepository.findAll();
    }

    public Reclamation getReclamationById(Long id) {
        return reclamationRepository.findById(id).orElse(null);
    }

    public Reclamation createReclamation(Reclamation reclamation) {
        reclamation.setDateSubmitted(LocalDate.now());
        reclamation.setStatus("Pending");
        return reclamationRepository.save(reclamation);
    }

    public Reclamation updateReclamationStatus(Long id, String status) {
        Reclamation reclamation = getReclamationById(id);
        if (reclamation != null) {
            reclamation.setStatus(status);
            if ("Resolved".equalsIgnoreCase(status)) {
                reclamation.setDateResolved(LocalDate.now());
            }
            return reclamationRepository.save(reclamation);
        }
        return null;
    }

    public void deleteReclamation(Long id) {
        reclamationRepository.deleteById(id);
    }
}

