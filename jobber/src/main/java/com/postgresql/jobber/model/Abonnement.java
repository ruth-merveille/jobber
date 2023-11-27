package com.postgresql.jobber.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.lang.Object;



@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "abonnement")
public class Abonnement extends  AbstractEntity{

    @Column(name = "duree_abonnement")
    private int duree_abonnenment;

    @Column(name = "prix_abonnement")
    private int prix_abonnement;
}
