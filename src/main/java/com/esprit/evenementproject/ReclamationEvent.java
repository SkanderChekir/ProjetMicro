package com.esprit.evenementproject;


import jakarta.persistence.ForeignKey;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "ReclamationGestions",url = "http://localhost:8087")
public interface ReclamationEvent {

    @RequestMapping("reclamations")
    public List<Reclamation> getAllReclamations();

    @RequestMapping("reclamations/{id}")
    public  Reclamation getReclamationById(@PathVariable int id);
}
