package fr.andrew.universite.universite_back.note.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import fr.andrew.universite.universite_back.etudiant.domain.Etudiant;
import fr.andrew.universite.universite_back.matiere.domain.Matiere;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "noter")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Note implements Serializable {

    @EmbeddedId
    private NotePk notePk;

    @Column(name = "note")
    private Double noteValue;
    @ManyToOne
    @JoinColumn(name = "id_etudiant", insertable = false, updatable = false)
    private Etudiant etudiant;
    @ManyToOne
    @JoinColumn(name = "id_matiere", insertable = false, updatable = false)
    private Matiere matiere;

}