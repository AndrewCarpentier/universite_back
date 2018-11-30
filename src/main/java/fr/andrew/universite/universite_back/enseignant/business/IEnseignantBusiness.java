package fr.andrew.universite.universite_back.enseignant.business;

import fr.andrew.universite.universite_back.enseignant.domain.Enseignant;
import fr.andrew.universite.universite_back.matiere.domain.Matiere;

import java.util.List;

public interface IEnseignantBusiness {

    List<Enseignant> getAllEnseignants();
    Enseignant getEnseignantById(Integer id);
    Enseignant saveEnseignant(Enseignant enseignant);
    Void deleteEnseignant(Integer id);
    List<Matiere> matiereByIdEnseignant(Integer idEnseignant);
}
