package fr.andrew.universite.universite_back.note.repository;

import fr.andrew.universite.universite_back.note.domain.Note;
import fr.andrew.universite.universite_back.note.domain.NotePk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INoteRepository extends JpaRepository<Note, NotePk> {
}
