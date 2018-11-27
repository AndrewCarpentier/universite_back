package fr.andrew.universite.universite_back.note.business.impl;

import fr.andrew.universite.universite_back.note.business.INoteBusiness;
import fr.andrew.universite.universite_back.note.domain.Note;
import fr.andrew.universite.universite_back.note.domain.NotePk;
import fr.andrew.universite.universite_back.note.repository.INoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteBusinessImpl implements INoteBusiness {

    @Autowired
    private INoteRepository noteRepository;

    @Override
    public List<Note> getAllNote() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(NotePk id) {
        return noteRepository.getOne(id);
    }

    @Override
    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Void deleteNote(NotePk id) {
        noteRepository.deleteById(id);
        return null;
    }
}
