package com.esprit.evenementproject;

import java.util.List;

public interface IEvenementService {

    Evenement addEvenement(Evenement evenement);
    List<Evenement> getAllEvenement();
    Evenement updateEvenementWithId(int id, Evenement evenement);
    String deleteEvenement(int id);
}
