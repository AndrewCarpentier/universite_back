package fr.andrew.universite.universite_back.matiere.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import fr.andrew.universite.universite_back.enseignant.domain.Enseignant;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

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
    private Integer numeroMatiere;
    @Column(name = "nom")
    private String nom;
    @Column(name = "coef")
    private Integer coef;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_enseignant")
    private Enseignant enseignant;
}