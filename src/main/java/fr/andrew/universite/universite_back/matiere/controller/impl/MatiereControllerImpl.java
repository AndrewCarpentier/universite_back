package fr.andrew.universite.universite_back.matiere.controller.impl;

import fr.andrew.universite.universite_back.matiere.business.IMatiereBusiness;
import fr.andrew.universite.universite_back.matiere.controller.IMatiereController;
import fr.andrew.universite.universite_back.matiere.domain.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MatiereControllerImpl implements IMatiereController {

    @Autowired
    private IMatiereBusiness matiereBusiness;

    @Override
    @GetMapping(path = "/matieres",name = "matieres")
    public List<Matiere> getAllMatiere() {
        return matiereBusiness.getAllMatiere();
    }

    @Override
    @GetMapping(path = "/matieres/{id}",name = "matiere")
    public Matiere getMatiereById(@PathVariable(name = "id") Integer id) {
        return matiereBusiness.getMatiereById(id);
    }

    @Override
    @PostMapping(path = "/matieres",name = "addMatiere")
    public Matiere addMatiere(@RequestBody Matiere matiere) {
        return matiereBusiness.saveMatiere(matiere);
    }

    @Override
    @PutMapping(path = "/matieres/{id}",name = "updateMatiere")
    public Matiere updateMatiere(@PathVariable(name = "id") Integer id, @RequestBody Matiere matiere) {
        matiere.setId(id);
        return matiereBusiness.saveMatiere(matiere);
    }

    @Override
    @DeleteMapping(path = "matieres/{id}",name = "deleteMatiere")
    public Void deleteMatiere(@PathVariable(name = "id") Integer id) {
        matiereBusiness.deleteMatiere(id);
        return null;
    }
}
