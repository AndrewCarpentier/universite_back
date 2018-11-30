package fr.andrew.universite.universite_back.etudiant.controller.impl;

import fr.andrew.universite.universite_back.etudiant.business.IEtudiantBusiness;
import fr.andrew.universite.universite_back.etudiant.controller.IEtudiantController;
import fr.andrew.universite.universite_back.etudiant.domain.Etudiant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Slf4j
public class EtudiantControllerImpl implements IEtudiantController {

    @Autowired
    private IEtudiantBusiness etudiantBusiness;

    @Override
    @GetMapping(path = "/etudiants",name = "etudiants")
    public List<Etudiant> getAllEtudiant() {
        log.info("appel de getAllEtudiant");
        return etudiantBusiness.getAllEtudiant();
    }

    @Override
    @GetMapping(path = "/etudiants/{id}",name = "etudiant")
    public Etudiant getEtudiantById(@PathVariable(name = "id") Integer id) {
        log.info("appel de getEtudiantById");
        return etudiantBusiness.getEtudiantById(id);
    }

    @Override
    @PostMapping(path = "/etudiants",name = "addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        log.info("appel de addEtudiant");
        return etudiantBusiness.saveEtudiant(etudiant);
    }

    @Override
    @PutMapping(path = "/etudiants/{id}",name = "updateEtudiant")
    public Etudiant updateEtudiant(@PathVariable(name = "id") Integer id, @RequestBody Etudiant etudiant) {
        etudiant.setId(id);
        log.info("appel de updateEtudiant");
        return etudiantBusiness.saveEtudiant(etudiant);
    }

    @Override
    @DeleteMapping(path = "/etudiants/{id}",name = "deleteEtudiant")
    public Void deleteEtudiant(@PathVariable(name = "id") Integer id) {
        log.info("appel de deleteEtudiant");
        etudiantBusiness.deleteEtudiant(id);
        return null;
    }

}
