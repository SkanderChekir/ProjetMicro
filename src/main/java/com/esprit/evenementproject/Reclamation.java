package com.esprit.evenementproject;

import java.time.LocalDate;

public class Reclamation {

    private Long id;
    private String description;
    private String status;
    private LocalDate dateSubmitted;
    private LocalDate dateResolved;

    public Reclamation(Long id, String description, String status, LocalDate dateSubmitted, LocalDate dateResolved) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.dateSubmitted = dateSubmitted;
        this.dateResolved = dateResolved;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(LocalDate dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public LocalDate getDateResolved() {
        return dateResolved;
    }

    public void setDateResolved(LocalDate dateResolved) {
        this.dateResolved = dateResolved;
    }
}
