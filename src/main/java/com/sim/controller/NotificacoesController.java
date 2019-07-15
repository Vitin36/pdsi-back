package com.sim.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sim.exception.NotFoundException;
import com.sim.model.Notificacoes;
import com.sim.service.NotificacoesService;

@RestController
@RequestMapping("/notificacoes")
public class NotificacoesController {

    @Autowired
    private NotificacoesService service;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public ResponseEntity<List<Notificacoes>> findAll() {
        return ResponseEntity.ok().body(this.service.findAll());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Notificacoes> findById(@PathVariable("id") String id) throws NotFoundException {
        return ResponseEntity.ok().body(this.service.findById(id));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PatchMapping(value = "/{id}/lida")
    public ResponseEntity<Notificacoes> setComoLida(@PathVariable("id") String id) throws NotFoundException {
        return ResponseEntity.ok().body(this.service.setarComoLida(id));
    }
}
