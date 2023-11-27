package com.postgresql.jobber.repository;


import com.postgresql.jobber.model.OfrreEmploi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffreEmploiRepository extends CrudRepository<OfrreEmploi, Integer> {
}
