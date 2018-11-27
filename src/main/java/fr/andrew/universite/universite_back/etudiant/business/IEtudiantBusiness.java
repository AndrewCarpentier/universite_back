package fr.andrew.universite.universite_back.etudiant.business;

import fr.andrew.universite.universite_back.etudiant.domain.Etudiant;

import java.util.List;

public interface IEtudiantBusiness {

    List<Etudiant> getAllEtudiant();
    Etudiant getEtudiantById(Integer id);
    Etudiant saveEtudiant(Etudiant etudiant);
    Void deleteEtudiant(Integer id);
}
