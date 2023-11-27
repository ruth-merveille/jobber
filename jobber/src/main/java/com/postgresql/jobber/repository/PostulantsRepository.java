package com.postgresql.jobber.repository;


import com.postgresql.jobber.model.Postulants;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostulantsRepository extends CrudRepository<Postulants, Integer> {
}
