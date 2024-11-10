package com.esprit.evenementproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EvenementService  implements  IEvenementService {
   @Autowired
   private EvenementRepository evenementRepository;


    @Override
    public Evenement addEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    @Override
    public List<Evenement> getAllEvenement() {
        return evenementRepository.findAll();
    }


    @Override
    public Evenement updateEvenementWithId(int id, Evenement evenement) {
        Optional<Evenement> existingEvenement = evenementRepository.findById(id);
        if (existingEvenement.isPresent()) {
            Evenement t = existingEvenement.get();
            t.setImage(evenement.getImage());
            t.setTitre(evenement.getTitre());
            t.setDescription(evenement.getDescription());
            t.setLieu(evenement.getLieu());
            t.setPrix(evenement.getPrix());
            t.setDatedebut(evenement.getDatedebut());
            t.setDatefin(evenement.getDatefin());
            return evenementRepository.save(t);
        }
        return null; // ou lancer une exception
    }

    @Override
    public String deleteEvenement(int id) {
            evenementRepository.deleteById(id);
            return "Événement supprimé avec succès.";
        }
}
