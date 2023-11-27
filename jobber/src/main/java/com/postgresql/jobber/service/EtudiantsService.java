package com.postgresql.jobber.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgresql.jobber.model.Etudiants;
import com.postgresql.jobber.repository.EtudiantsRepository;

@Service
public class EtudiantsService {


    //on lit tous les données de la table
    @Autowired
    private EtudiantsRepository etudiantsRepository;

    public Iterable<Etudiants> getEtudiants() {
        return etudiantsRepository.findAll();
    }

    public Optional<Etudiants> getEtudiantsById(Integer id) {
        return etudiantsRepository.findById(id);
    }
}
