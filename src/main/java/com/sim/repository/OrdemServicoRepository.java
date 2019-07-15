package com.sim.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sim.model.OrdemServico;

public interface OrdemServicoRepository extends MongoRepository<OrdemServico, String> {
}
