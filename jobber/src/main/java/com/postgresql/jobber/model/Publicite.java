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
@Table(name = "publicité")
public class Publicite extends AbstractEntity{

    @Column(name = "contenu_publicite")
    private Object contenu_publicite;

    @Column(name = "description_publicite")
    private String description;
}
