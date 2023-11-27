package com.postgresql.jobber.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "publications")
public class Publications extends AbstractEntity{
    @Column(name = "contenu_publication")
    private String contenu_publication;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    List<Commentaires> contenu_commentaire = new ArrayList<>();


    public String getContenu_publication(){
        return contenu_publication;
    }
}
