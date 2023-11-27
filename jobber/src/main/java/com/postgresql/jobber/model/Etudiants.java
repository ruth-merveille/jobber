package com.postgresql.jobber.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "etudiants")
public class Etudiants extends AbstractEntity{

    @Column(name = "nom_etudiant")
    private String nom_etudiant;

    @Column(name = "prenom_etudiant")
    private String prenom_etudiant;

    @Column(name = "age_etudiant")
    private int age_etudiant;

    @Column(name = "sexe_etudiant")
    private String sexe_etudiant;

    @Column(name = "email_etudiant")
    private String email_etudiant;

    @Column(name = "tel_etudiant")
    private String tel_etudiant;

    @Column(name = "ville_etudiant")
    private String ville_etudiant;

    @Column(name = "quartier_etudiant")
    private String quartier_etudiant;

    @Column(name = "domaine_activite_etudiant")
    private String domaine_activite_etudiant;

    @Column(name = "duree_livraison_etudiant")
    private String duree_livraison_etudiant;

    @Column(name = "mot_passe_etudiant")
    private String mot_passe_etudiant;

    @Column(name = "photo_etudiant")
    private String photo_etudiant;

    public String getNom_Etudiants() {
        return nom_etudiant;
    }
}
