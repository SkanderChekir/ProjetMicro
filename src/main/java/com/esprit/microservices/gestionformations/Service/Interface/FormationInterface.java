package com.esprit.microservices.gestionformations.Service.Interface;


import com.esprit.microservices.gestionformations.Repository.*;
import com.esprit.microservices.gestionformations.Entity.*;
import com.esprit.microservices.gestionformations.Service.Imlp.*;
import com.esprit.microservices.gestionformations.Service.Interface.*;

import java.util.List;

public interface FormationInterface {

    Formation addFormation(Formation f);
    Formation updateFormation(Formation f);

    List<Formation> retrieveAllFormation();

    Formation retrieveFormationByID(Long id);

    void deleteFormation(Long id);

    //*******************AVANCEES*****************



}
