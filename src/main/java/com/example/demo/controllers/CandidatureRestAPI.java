package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Stage;
import com.example.demo.services.IServiceStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class CandidatureRestAPI {
    private String title="hello, im the candidature MicroService";
    @Autowired
    private IServiceStage serviceStage;

    @PostMapping("/add")
    public Stage addStage(@RequestBody Stage C) {

        return serviceStage.addStage(C);
    }



}



