package com.example.gestionstages.services;

import com.example.gestionstages.entities.Stage;
import com.example.gestionstages.repositories.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStage implements IServiceStage {

    @Autowired
    private StageRepository stageRepository;




    @Override
    public List<Stage> getAllStages() {
        return stageRepository.findAll();
    }
}
