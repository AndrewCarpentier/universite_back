package fr.andrew.universite.universite_back.matiere.business;

import fr.andrew.universite.universite_back.matiere.domain.Matiere;

import java.util.List;

public interface IMatiereBusiness {

    List<Matiere> getAllMatiere();
    Matiere getMatiereById(Integer id);
    Matiere saveMatiere(Matiere matiere);
    Void deleteMatiere(Integer id);
    List<Matiere> findMatiereByIdEnseignant(Integer idEnseignant);
}
