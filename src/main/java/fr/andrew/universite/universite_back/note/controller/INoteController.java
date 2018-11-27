package fr.andrew.universite.universite_back.note.controller;

import fr.andrew.universite.universite_back.note.domain.Note;
import fr.andrew.universite.universite_back.note.domain.NotePk;

import java.util.List;

public interface INoteController {

    List<Note> getAllNote();
    Note getNoteById(NotePk id, Integer idEtudiant, Integer idMatiere);
    Note addNote(Note note);
    Note updateNote(NotePk id ,Note note);
    Void deleteNote(NotePk id);
}
