package com.postgresql.jobber.repository;

import com.postgresql.jobber.model.Commentaires;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentairesRepository extends CrudRepository<Commentaires, Integer> {
}
