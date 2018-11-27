package fr.andrew.universite.universite_back.matiere.business.impl;

import fr.andrew.universite.universite_back.matiere.business.IMatiereBusiness;
import fr.andrew.universite.universite_back.matiere.domain.Matiere;
import fr.andrew.universite.universite_back.matiere.repository.IMatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatiereBusinessImpl implements IMatiereBusiness {

    @Autowired
    private IMatiereRepository matiereRepository;

    @Override
    public List<Matiere> getAllMatiere() {
        return matiereRepository.findAll();
    }

    @Override
    public Matiere getMatiereById(Integer id) {
        return matiereRepository.getOne(id);
    }

    @Override
    public Matiere saveMatiere(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    @Override
    public Void deleteMatiere(Integer id) {
        matiereRepository.deleteById(id);
        return null;
    }
}
