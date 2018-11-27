package fr.andrew.universite.universite_back.enseignant.repository;

import fr.andrew.universite.universite_back.enseignant.domain.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnseignantRepository extends JpaRepository<Enseignant, Integer> {
}
