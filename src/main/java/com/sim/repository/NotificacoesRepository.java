package com.sim.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sim.model.Notificacoes;

public interface NotificacoesRepository extends MongoRepository<Notificacoes, String> {

}
