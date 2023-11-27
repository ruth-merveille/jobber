package com.postgresql.jobber.service;

import java.util.Optional;

import com.postgresql.jobber.model.Publications;
import org.springframework.stereotype.Service;


import com.postgresql.jobber.repository.PublicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;




@Service
public class PublicationsService {

    @Autowired
    private PublicationsRepository publicationsRepository;

    public Iterable<Publications> getPublications() {
        return publicationsRepository.findAll();
    }

    public Optional<Publications> getPublicationsById(Integer id) {
         return publicationsRepository.findById(id);
        }
}










