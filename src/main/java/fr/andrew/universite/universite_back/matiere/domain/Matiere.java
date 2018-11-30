package fr.andrew.universite.universite_back.matiere.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.andrew.universite.universite_back.enseignant.domain.Enseignant;
import fr.andrew.universite.universite_back.note.domain.Note;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "t_matiere")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Matiere implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "numero_matiere")
    @JsonProperty("numero")
    private Integer numeroMatiere;
    @Column(name = "nom")
    private String nom;
    @Column(name = "coef")
    private Integer coef;
    @Column(name = "date_debut")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateDebut;
    @Column(name = "date_fin")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateFin;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_enseignant")
    private Enseignant enseignant;
    @OneToMany(mappedBy = "matiere")
    @JsonIgnore
    private List<Note> notes;
}