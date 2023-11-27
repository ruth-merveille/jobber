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
@Table(name = "Commentaires")
public class Commentaires extends AbstractEntity{

    @Column(name = "contenu_commentaire")
    private String contenu_commentaire;

    @Column(name = "id_publication")
    private int id_publication;

    public String getContenu_commentaire(){
        return contenu_commentaire;
    }
}
