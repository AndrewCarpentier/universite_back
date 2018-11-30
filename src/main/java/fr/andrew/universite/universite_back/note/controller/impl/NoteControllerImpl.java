package fr.andrew.universite.universite_back.note.controller.impl;

import fr.andrew.universite.universite_back.note.business.INoteBusiness;
import fr.andrew.universite.universite_back.note.controller.INoteController;
import fr.andrew.universite.universite_back.note.domain.Note;
import fr.andrew.universite.universite_back.note.domain.NotePk;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Slf4j
public class NoteControllerImpl implements INoteController {

    @Autowired
    private INoteBusiness noteBusiness;

    @Override
    @GetMapping(path = "/notes",name = "notes")
    public List<Note> getAllNote() {
        log.info("appel de getAllNote");
        return noteBusiness.getAllNote();
    }

    @Override
    @GetMapping(path = "/notes/{id_etudiant},{id_matiere}",name = "note")
    public Note getNoteById(NotePk id, @PathVariable(name = "id_etudiant") Integer idEtudiant, @PathVariable(name = "id_matiere") Integer idMatiere) {
        log.info("appel de getNoteById");
        id.setEtudiant(idEtudiant);
        id.setMatiere(idMatiere);
        return noteBusiness.getNoteById(id);
    }

    @Override
    @GetMapping(path = "/notes/{id_etudiant}", name = "noteByIdEtudiant")
    public List<Note> getNoteByIdEtudiant(@PathVariable(name = "id_etudiant") Integer idEtudiant) {
        log.info("appel de getNoteByIdEtudiant");
        return noteBusiness.getNoteByIdEtudiant(idEtudiant);
    }

    @Override
    @PostMapping(path = "/notes",name = "addNote")
    public Note addNote(@RequestBody Note note) {
        log.info("appel de addNote ");

        return noteBusiness.saveNote(note);
    }

    @Override
    @PutMapping(path = "/notes/{id_etudiant},{id_matiere}", name = "updateNote")
    public Note updateNote(@RequestBody Note note, NotePk id, @PathVariable(name = "id_etudiant") Integer idEtudiant, @PathVariable(name = "id_matiere") Integer idMatiere) {
        log.info("appel de updateNote");
        id.setEtudiant(idEtudiant);
        id.setMatiere(idMatiere);
        note.setNotePk(id);
        return noteBusiness.saveNote(note);
    }

    @Override
    @DeleteMapping(path = "/notes/{id_etudiant},{id_matiere}")
    public Void deleteNote(NotePk id, @PathVariable(name = "id_etudiant") Integer idEtudiant, @PathVariable(name = "id_matiere") Integer idMatiere) {
        log.info("appel de deleteNote");
        id.setEtudiant(idEtudiant);
        id.setMatiere(idMatiere);
        noteBusiness.deleteNote(id);
        return null;
    }
}
