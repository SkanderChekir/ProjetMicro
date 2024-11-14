package com.example.gestionstages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GestionStagesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionStagesApplication.class, args);
    }

}
