package fr.andrew.universite.universite_back.matiere.repository;

import fr.andrew.universite.universite_back.matiere.domain.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMatiereRepository extends JpaRepository<Matiere, Integer> {
    List<Matiere> findAllByEnseignant_Id(Integer idEnseignant);
}
