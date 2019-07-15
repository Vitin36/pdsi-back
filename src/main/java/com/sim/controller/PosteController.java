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

import com.sim.exception.NotFoundException;
import com.sim.model.Poste;
import com.sim.service.PosteService;

@RestController
@RequestMapping("/poste")
public class PosteController {

    @Autowired
    private PosteService service;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public ResponseEntity<List<Poste>> findAll() {
        return ResponseEntity.ok().body(this.service.findAll());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Poste> findById(@PathVariable("id") String id) throws NotFoundException {
        return ResponseEntity.ok().body(this.service.findById(id));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public ResponseEntity<Poste> create(@Valid @RequestBody Poste poste){
        return ResponseEntity.ok().body(this.service.save(poste));
    }
}
