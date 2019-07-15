package com.sim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim.exception.NotFoundException;
import com.sim.model.Poste;
import com.sim.repository.PosteRepository;

@Service
public class PosteService {

    @Autowired
    private PosteRepository repo;

    public Poste findById(String poste) throws NotFoundException {
        return this.repo.findById(poste).orElseThrow(() -> new NotFoundException("Poste não encontrado"));
    }

    public List<Poste> findAll() {
        return repo.findAll();
    }

    public Poste save(Poste poste) {
        return this.repo.save(poste);
    }

}
