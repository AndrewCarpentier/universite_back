package fr.andrew.universite.universite_back.note.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class NotePk implements Serializable {
    @JsonProperty("idEtudiant")
    @Column(name = "id_etudiant")
    private Integer etudiant;
    @JsonProperty("idMatiere")
    @Column(name = "id_matiere")
    private Integer matiere;

}