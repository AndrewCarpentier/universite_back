package fr.andrew.universite.universite_back.etudiant.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.andrew.universite.universite_back.note.domain.Note;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "t_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "numero_etudiant")
    @JsonProperty("numero")
    private Integer numeroEtudiant;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "date_naissance")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateNaissance;
    @Column(name = "sexe")
    private String sexe;
    @OneToMany(mappedBy = "etudiant")
    @JsonIgnore
    private List<Note> notes;


}