package com.esprit.microservices.gestionformations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionFormationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionFormationsApplication.class, args);
    }

}
