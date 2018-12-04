package fr.andrew.universite.universite_back.etudiant.controller;

import fr.andrew.universite.universite_back.etudiant.domain.Etudiant;

import java.util.List;

public interface IEtudiantController {

    List<Etudiant> getAllEtudiant();
    Etudiant getEtudiantById(Integer id);
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Integer id ,Etudiant etudiant);
    Void deleteEtudiant(Integer id);

}
