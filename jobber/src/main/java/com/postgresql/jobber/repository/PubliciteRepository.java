package com.postgresql.jobber.repository;


import com.postgresql.jobber.model.Publicite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PubliciteRepository extends CrudRepository<Publicite, Integer> {
}
