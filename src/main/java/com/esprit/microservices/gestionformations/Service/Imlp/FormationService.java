package com.esprit.microservices.gestionformations.Service.Imlp;


import com.esprit.microservices.gestionformations.Repository.*;
import com.esprit.microservices.gestionformations.Entity.*;
import com.esprit.microservices.gestionformations.Service.Imlp.*;
import com.esprit.microservices.gestionformations.Service.Interface.*;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class FormationService implements FormationInterface {

    FormationRepository formationRepository;
//    SupportRepository supportRepository;
//    VideoRepository videoRepository;
//    QuizzRepository quizzRepository;
//    QuestionRepository questionRepository;


    @Override
    public Formation addFormation(Formation f) {
        return formationRepository.save(f);
    }

    @Override
    public Formation updateFormation(Formation f) {
        return formationRepository.save(f);
    }


    @Override
    public void deleteFormation(Long id) {
        formationRepository.deleteById(id);
    }

    @Override
    public Formation retrieveFormationByID(Long id) {
        return formationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Formation> retrieveAllFormation() {
        return formationRepository.findAll();
    }

//*******************AVANCEES*****************//





}


