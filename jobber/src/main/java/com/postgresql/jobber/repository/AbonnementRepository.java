package com.postgresql.jobber.repository;

import com.postgresql.jobber.model.Abonnement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonnementRepository extends CrudRepository<Abonnement, Integer> {
}
