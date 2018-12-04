package fr.andrew.universite.universite_back.note.repository;

import fr.andrew.universite.universite_back.note.domain.Note;
import fr.andrew.universite.universite_back.note.domain.NotePk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INoteRepository extends JpaRepository<Note, NotePk> {

    List<Note> getAllByEtudiant_Id(Integer idEtudiant);
    List<Note> findByEtudiant_IdAndNoteValueLessThan(Integer id, Double aDouble);
}
