package fr.andrew.universite.universite_back.enseignant.controller.impl;

import fr.andrew.universite.universite_back.enseignant.business.IEnseignantBusiness;
import fr.andrew.universite.universite_back.enseignant.controller.IEnseignantController;
import fr.andrew.universite.universite_back.enseignant.domain.Enseignant;
import fr.andrew.universite.universite_back.matiere.domain.Matiere;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Slf4j
public class EnseignantControllerImpl implements IEnseignantController {

    @Autowired
    private IEnseignantBusiness enseignantBusiness;

    @Override
    @GetMapping(path = "/enseignants", name = "enseignants")
    public List<Enseignant> getAllEnseignants() {
        log.error("appel de getAllEnseignants");
        return enseignantBusiness.getAllEnseignants();
    }

    @Override
    @GetMapping(path = "/enseignants/{id}", name = "enseignant")
    public Enseignant getEnseignantById(@PathVariable(name = "id") Integer id) {
        log.info("appel de getEnseignantById");
        return enseignantBusiness.getEnseignantById(id);
    }

    @Override
    @PostMapping(path = "/enseignants", name = "ajouter")
    public Enseignant addEnseignant(@RequestBody Enseignant enseignant) {
        log.info("appel de ajouterEnseignant");
        return enseignantBusiness.saveEnseignant(enseignant);
    }

    @Override
    @PutMapping(path = "/enseignants/{id}", name = "modifier")
    public Enseignant updateEnseignant(@PathVariable(name = "id") Integer id, @RequestBody Enseignant enseignant) {
        enseignant.setId(id);
        log.info("appel de updateEnseignant");
        return enseignantBusiness.saveEnseignant(enseignant);
    }

    @Override
    @DeleteMapping(path = "/enseignants/{id}", name = "delete")
    public Void deleteEnseignant(@PathVariable Integer id) {
        log.info("appel de deleteEnseignant");
        enseignantBusiness.deleteEnseignant(id);
        return null;
    }

    @Override
    @GetMapping(path = "/enseignants/{id}/matieres", name = "matiereByIdEnseignant")
    public List<Matiere> matiereByIdEnseignant(@PathVariable(name = "id") Integer idEnseignant) {

        return enseignantBusiness.matiereByIdEnseignant(idEnseignant);
    }


}
