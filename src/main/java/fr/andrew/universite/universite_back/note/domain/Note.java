package fr.andrew.universite.universite_back.note.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.andrew.universite.universite_back.etudiant.domain.Etudiant;
import fr.andrew.universite.universite_back.matiere.domain.Matiere;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "noter")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Note implements Serializable {

    @JsonProperty("notePk")
    @EmbeddedId
    private NotePk notePk;
    @JsonProperty("note")
    @Column(name = "note")
    private Double noteValue;
    @JsonProperty("etudiant")
    @ManyToOne
    @JoinColumn(name = "id_etudiant", insertable = false, updatable = false)
    private Etudiant etudiant;
    @JsonProperty("matiere")
    @ManyToOne
    @JoinColumn(name = "id_matiere", insertable = false, updatable = false)
    private Matiere matiere;

}