package com.sim.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sim.model.Poste;

public interface PosteRepository extends MongoRepository<Poste, String> {
}
