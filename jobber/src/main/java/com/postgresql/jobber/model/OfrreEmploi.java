package com.postgresql.jobber.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.Date;




@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "offre_emploi")
public class OfrreEmploi extends AbstractEntity{
    @Column(name = "profil")
    private String profil;

    @Column(name = "date_limite")
    private Date date_limite;

    @Column(name = "nbre_candidatures")
    private int nbre_candidatures;

    @Column(name = "nbre_candidats")
    private int nbre_candidats;
}
