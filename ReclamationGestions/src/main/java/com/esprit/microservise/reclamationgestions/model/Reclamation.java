    package com.esprit.microservise.reclamationgestions.model;



    import jakarta.persistence.*;
    import java.time.LocalDate;

    @Entity
    public class Reclamation {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private Long studentId;

        @Column(nullable = false, length = 500)
        private String description;

        @Column(nullable = false)
        private String status;

        @Column(nullable = false)
        private LocalDate dateSubmitted;

        @Column
        private LocalDate dateResolved;

        // Getters and setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getStudentId() {
            return studentId;
        }

        public void setStudentId(Long studentId) {
            this.studentId = studentId;
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
