package com.sim.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sim.dto.OrdemServicoCreate;
import com.sim.exception.NotFoundException;
import com.sim.model.OrdemServico;
import com.sim.service.OrdemServicoService;

@RestController
@RequestMapping("/ordemServico")
public class OrdemServicoController {

    @Autowired
    private OrdemServicoService service;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public ResponseEntity<List<OrdemServico>> findAll() {
        return ResponseEntity.ok().body(this.service.findAll());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/{id}")
    public ResponseEntity<OrdemServico> findById(@PathVariable("id") String id) throws NotFoundException {
        return ResponseEntity.ok().body(this.service.findById(id));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public ResponseEntity<OrdemServico> create(@Valid @RequestBody OrdemServicoCreate ordem) throws NotFoundException {
        return ResponseEntity.ok().body(this.service.save(ordem));
    }
}
