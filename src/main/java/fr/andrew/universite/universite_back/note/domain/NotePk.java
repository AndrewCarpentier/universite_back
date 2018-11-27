package fr.andrew.universite.universite_back.note.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class NotePk implements Serializable {
    @Column(name = "id_etudiant")
    private Integer etudiant;
    @Column(name = "id_matiere")
    private Integer matiere;

}