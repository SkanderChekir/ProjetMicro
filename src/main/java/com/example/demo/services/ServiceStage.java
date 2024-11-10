package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Stage;
import com.example.demo.repositories.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStage implements IServiceStage {

    @Autowired
    private StageRepository stageRepository;

    @Override
    public Stage addStage(Stage stage) {
        return stageRepository.save(stage);
    }

}
