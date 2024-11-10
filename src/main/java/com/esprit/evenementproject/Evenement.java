package com.esprit.evenementproject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;




@Entity
public class Evenement {
    @Id
    @GeneratedValue
    private int id;
    private String image;
    private String titre;
    private String description;
    private String lieu;
    private float prix;
    private LocalDateTime datedebut;
    private LocalDateTime datefin;

    @JsonIgnore
    public Object getLinks() {
        return null; // Ignore les liens
    }
    public Evenement() {
    }

    public Evenement(String image, String titre, String description,
                     String lieu, float prix, LocalDateTime datedebut,
                     LocalDateTime datefin) {
        this.image = image;
        this.titre = titre;
        this.description = description;
        this.lieu = lieu;
        this.prix = prix;
        this.datedebut = datedebut;
        this.datefin = datefin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public LocalDateTime getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(LocalDateTime datedebut) {
        this.datedebut = datedebut;
    }

    public LocalDateTime getDatefin() {
        return datefin;
    }

    public void setDatefin(LocalDateTime datefin) {
        this.datefin = datefin;
    }
}
