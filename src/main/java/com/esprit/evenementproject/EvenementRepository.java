package com.esprit.evenementproject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EvenementRepository  extends JpaRepository<Evenement, Integer> {
@Query("select e from Evenement e where e.titre like :name")
    public Page<Evenement> findEvenementByTitre(@Param("name")String titre, Pageable pageable);

}
