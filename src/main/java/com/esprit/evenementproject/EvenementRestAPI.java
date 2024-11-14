package com.esprit.evenementproject;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@RequestMapping("/Evenements")
@RestController
public class EvenementRestAPI {


    @Autowired
    private EvenementService evenementService;



    private String title="Hello, I'm Islem Amor SAE8 my second version";
    @RequestMapping("/hello")
    public String sayhello() {
        return title;
    }

    @RequestMapping("/reclamations")
    public  List<Reclamation> getAllReclamations(){
        return evenementService.getReclamation();
    }

    @RequestMapping("reclamations/{id}")
    public Reclamation getReclamationById(@PathVariable int id){
        return evenementService.getReclamationById(id);
    }



    @PostMapping
    public ResponseEntity<Evenement> addEvenement(@RequestBody Evenement evenement) {
        return ResponseEntity.ok(evenementService.addEvenement(evenement));
    }

    @GetMapping
    public ResponseEntity<List<Map<String, Object>>> getAllEvenements() {
        List<Evenement> evenements = evenementService.getAllEvenement();

        List<Map<String, Object>> response = evenements.stream()
                .map(evenement -> {
                    Map<String, Object> evenementMap = new HashMap<>();
                    evenementMap.put("image", evenement.getImage());
                    evenementMap.put("titre", evenement.getTitre());
                    evenementMap.put("description", evenement.getDescription());
                    evenementMap.put("lieu", evenement.getLieu());
                    evenementMap.put("prix", evenement.getPrix());
                    evenementMap.put("datedebut", evenement.getDatedebut());
                    evenementMap.put("datefin", evenement.getDatefin());
                    return evenementMap;
                })
                .collect(Collectors.toList());

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evenement> getEvenementById(@PathVariable int id) {
        Evenement evenement = evenementService.getAllEvenement().stream()
                .filter(e -> e.getId() == id).findFirst().orElse(null);
                return ResponseEntity.ok(evenement);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evenement> updateEvenement(@PathVariable int id, @RequestBody Evenement evenement) {
        Evenement updatedEvenement = evenementService.updateEvenementWithId(id, evenement);
        return updatedEvenement != null ? ResponseEntity.ok(updatedEvenement) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEvenement(@PathVariable int id) {
        return ResponseEntity.ok(evenementService.deleteEvenement(id));
    }


}
