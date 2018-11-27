package fr.andrew.universite.universite_back.note.controller.impl;

import fr.andrew.universite.universite_back.note.business.INoteBusiness;
import fr.andrew.universite.universite_back.note.controller.INoteController;
import fr.andrew.universite.universite_back.note.domain.Note;
import fr.andrew.universite.universite_back.note.domain.NotePk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteControllerImpl implements INoteController {

    @Autowired
    private INoteBusiness noteBusiness;

    @Override
    @GetMapping(path = "/notes",name = "notes")
    public List<Note> getAllNote() {
        return noteBusiness.getAllNote();
    }

    @Override
    @GetMapping(path = "notes/{id_etudiant}/{id_matiere}",name = "note")
    public Note getNoteById(NotePk id, @PathVariable(name = "id_etudiant") Integer idEtudiant, @PathVariable(name = "id_matiere") Integer idMatiere) {
        id.setEtudiant(idEtudiant);
        id.setMatiere(idMatiere);
        return noteBusiness.getNoteById(id);
    }

    @Override
    @PostMapping(path = "notes",name = "addNote")
    public Note addNote(@RequestBody Note note) {
        return noteBusiness.saveNote(note);
    }

    @Override
    public Note updateNote(NotePk id, Note note) {
        return null;
    }

    @Override
    public Void deleteNote(NotePk id) {
        return null;
    }
}
