package fr.andrew.universite.universite_back.enseignant.domain;

import com.fasterxml.jackson.annotation.*;
import fr.andrew.universite.universite_back.matiere.domain.Matiere;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "t_enseignant")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Enseignant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "numero_enseignant")
    @JsonProperty("numero")
    private Integer numeroEnseignant;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "dateNaissance")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateNaissance;
    @Column(name = "sexe")
    private String sexe;
    @Column(name = "grade")
    private String grade;
    @Column(name = "date_embauche")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateEmbauche;
    @OneToMany(mappedBy = "enseignant")
    @JsonIgnore
    private List<Matiere> matieres;
}