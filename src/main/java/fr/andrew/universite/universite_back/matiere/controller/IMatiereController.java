package fr.andrew.universite.universite_back.matiere.controller;

import fr.andrew.universite.universite_back.matiere.domain.Matiere;

import java.util.List;

public interface IMatiereController {

    List<Matiere> getAllMatiere();
    Matiere getMatiereById(Integer id);
    Matiere addMatiere(Matiere matiere);
    Matiere updateMatiere(Integer id ,Matiere matiere);
    Void deleteMatiere(Integer id);
}
