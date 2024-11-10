package com.esprit.microservices.gestionformations.Repository;



import com.esprit.microservices.gestionformations.Entity.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository extends JpaRepository<Formation,Long> {


}
