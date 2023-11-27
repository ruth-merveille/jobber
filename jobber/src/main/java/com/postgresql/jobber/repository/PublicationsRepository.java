package com.postgresql.jobber.repository;


import com.postgresql.jobber.model.Publications;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationsRepository extends CrudRepository<Publications, Integer> {
}
