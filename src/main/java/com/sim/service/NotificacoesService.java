package com.sim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim.exception.NotFoundException;
import com.sim.model.Notificacoes;
import com.sim.repository.NotificacoesRepository;

@Service
public class NotificacoesService {
    @Autowired
    private NotificacoesRepository repo;

    public Notificacoes findById(String notificaco) throws NotFoundException {
        return this.repo.findById(notificaco).orElseThrow(() -> new NotFoundException("Notificação não encontrada"));
    }

    public List<Notificacoes> findAll() {
        return repo.findAll();
    }

    public Notificacoes generateNotificacao(String notificacao){
        Notificacoes not = new Notificacoes(notificacao);
        return this.save(not);
    }

    public Notificacoes save(Notificacoes notificaco) {
        return this.repo.save(notificaco);
    }

    public Notificacoes setarComoLida(String notificaco) throws NotFoundException {
        Notificacoes not = this.findById(notificaco);
        not.setarComoLida();
        return repo.save(not);
    }
}
