package fr.andrew.universite.universite_back.enseignant.business;

import fr.andrew.universite.universite_back.enseignant.domain.Enseignant;

import java.util.List;

public interface IEnseignantBusiness {

    List<Enseignant> getAllEnseignants();
    Enseignant getEnseignantById(Integer id);
    Enseignant saveEnseignant(Enseignant enseignant);
    Void deleteEnseignant(Integer id);
}
