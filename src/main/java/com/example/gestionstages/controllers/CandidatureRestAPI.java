package com.example.gestionstages.controllers;

import com.example.gestionstages.entities.Stage;
import com.example.gestionstages.services.IServiceStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidatureRestAPI {
    private String title="hello, im the candidature MicroService";
    @Autowired
    private IServiceStage serviceStage;



    @GetMapping("/all")
    public List<Stage> getAllStages() {

        return serviceStage.getAllStages();
    }



}



