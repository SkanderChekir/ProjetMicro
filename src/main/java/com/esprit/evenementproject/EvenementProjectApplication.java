package com.esprit.evenementproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;


@EnableDiscoveryClient
@SpringBootApplication
public class EvenementProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvenementProjectApplication.class, args);
    }
    @Autowired
    private EvenementRepository evenementRepository;

    @Bean
    ApplicationRunner init() {
        return (args) -> {
            evenementRepository.save(new Evenement("aaaaa", "aaaa", "aaaa", "aaa", 111, LocalDateTime.parse("2024-10-27T18:00:00"), LocalDateTime.parse("2024-10-27T18:00:00")));
            evenementRepository.save(new Evenement("bbbbb", "bbbbb", "bbbbb", "bbbbb", 111, LocalDateTime.parse("2024-10-27T18:00:00"), LocalDateTime.parse("2024-10-27T18:00:00")));
            evenementRepository.save(new Evenement("ccccc", "ccccc", "ccccc", "ccccc", 111, LocalDateTime.parse("2024-10-27T18:00:00"), LocalDateTime.parse("2024-10-27T18:00:00")));
            evenementRepository.save(new Evenement("ddddd", "ddddd", "ddddd", "ddddd", 111, LocalDateTime.parse("2024-10-27T18:00:00"), LocalDateTime.parse("2024-10-27T18:00:00")));

            evenementRepository.findAll().forEach(System.out::println);
        };
    }

}
