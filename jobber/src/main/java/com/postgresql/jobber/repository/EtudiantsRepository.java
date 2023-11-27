package com.postgresql.jobber.repository;

import com.postgresql.jobber.model.Etudiants;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository est une annotation Spring pour indiquer que la classe a pour rôle de communiquer avec une source de données (en l'occurrence la base de données).
@Repository
public interface EtudiantsRepository extends CrudRepository <Etudiants, Integer>{
}
