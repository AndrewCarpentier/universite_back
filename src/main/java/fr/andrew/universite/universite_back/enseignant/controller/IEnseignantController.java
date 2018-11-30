package fr.andrew.universite.universite_back.enseignant.controller;

import fr.andrew.universite.universite_back.enseignant.domain.Enseignant;
import fr.andrew.universite.universite_back.matiere.domain.Matiere;

import java.util.List;

public interface IEnseignantController {

    List<Enseignant> getAllEnseignants();
    Enseignant getEnseignantById(Integer id);
    Enseignant addEnseignant(Enseignant enseignant);
    Enseignant updateEnseignant(Integer id ,Enseignant enseignant);
    Void deleteEnseignant(Integer id);
    List<Matiere> matiereByIdEnseignant(Integer idEnseignant);
}
