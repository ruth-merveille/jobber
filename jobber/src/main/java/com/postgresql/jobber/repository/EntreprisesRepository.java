package com.postgresql.jobber.repository;

import com.postgresql.jobber.model.Entreprises;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntreprisesRepository extends CrudRepository<Entreprises, Integer> {
}
