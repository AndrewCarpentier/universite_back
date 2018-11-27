package fr.andrew.universite.universite_back.etudiant.business.impl;

import fr.andrew.universite.universite_back.enseignant.domain.Enseignant;
import fr.andrew.universite.universite_back.etudiant.business.IEtudiantBusiness;
import fr.andrew.universite.universite_back.etudiant.domain.Etudiant;
import fr.andrew.universite.universite_back.etudiant.repository.IEtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantBusinessImpl implements IEtudiantBusiness {

    @Autowired
    private IEtudiantRepository etudiantRepository;


    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiantById(Integer id) {
        return etudiantRepository.getOne(id);
    }

    @Override
    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Void deleteEtudiant(Integer id) {
        etudiantRepository.deleteById(id);
        return null;
    }
}
