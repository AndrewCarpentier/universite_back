package fr.andrew.universite.universite_back.note.business;

import fr.andrew.universite.universite_back.note.domain.Note;
import fr.andrew.universite.universite_back.note.domain.NotePk;

import java.util.List;

public interface INoteBusiness {

    List<Note> getAllNote();
    Note getNoteById(NotePk id);
    List<Note> getNoteByIdEtudiant(Integer idEtudiant);
    List<Note> getNoteByIdEtudiantInf(Integer idEtudiant, Double aDouble);
    Note saveNote(Note note);
    Void deleteNote(NotePk id);

}
