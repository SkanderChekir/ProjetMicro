package com.esprit.microservise.reclamationgestions.repositories;


import com.esprit.microservise.reclamationgestions.model.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation, Long> {
}
