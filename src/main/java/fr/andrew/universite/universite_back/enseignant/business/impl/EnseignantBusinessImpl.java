package fr.andrew.universite.universite_back.enseignant.business.impl;

import fr.andrew.universite.universite_back.enseignant.business.IEnseignantBusiness;
import fr.andrew.universite.universite_back.enseignant.domain.Enseignant;
import fr.andrew.universite.universite_back.enseignant.repository.IEnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnseignantBusinessImpl implements IEnseignantBusiness {

    @Autowired
    private IEnseignantRepository enseignantRepository;

    @Override
    public List<Enseignant> getAllEnseignants() {
        return enseignantRepository.findAll();
     }

    @Override
    public Enseignant getEnseignantById(Integer id) {
        return enseignantRepository.getOne(id);
    }

    @Override
    public Enseignant saveEnseignant(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

    @Override
    public Void deleteEnseignant(Integer id) {
        enseignantRepository.deleteById(id);
        return null;
    }


}
