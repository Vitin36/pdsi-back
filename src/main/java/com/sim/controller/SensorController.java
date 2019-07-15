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

import com.sim.dto.SensorHumidadeCreate;
import com.sim.dto.SensorLuzCreate;
import com.sim.dto.SensorPresencaCreate;
import com.sim.dto.SensorSonoroCreate;
import com.sim.dto.SensorTemperaturaCreate;
import com.sim.exception.NotFoundException;
import com.sim.model.Sensor;
import com.sim.service.SensorService;

@RestController
@RequestMapping("/sensor")
public class SensorController {

    @Autowired
    private SensorService service;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public ResponseEntity<List<Sensor>> findAll() {
        return ResponseEntity.ok().body(this.service.findAll());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Sensor> findById(@PathVariable("id") String id) throws NotFoundException {
        return ResponseEntity.ok().body(this.service.findById(id));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/humidade")
    public ResponseEntity<Sensor> create(@Valid @RequestBody SensorHumidadeCreate sensor) throws NotFoundException {
        return ResponseEntity.ok().body(this.service.save(sensor));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/luz")
    public ResponseEntity<Sensor> create(@Valid @RequestBody SensorLuzCreate sensor) throws NotFoundException {
        return ResponseEntity.ok().body(this.service.save(sensor));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/presenca")
    public ResponseEntity<Sensor> create(@Valid @RequestBody SensorPresencaCreate sensor) throws NotFoundException {
        return ResponseEntity.ok().body(this.service.save(sensor));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/sonoro")
    public ResponseEntity<Sensor> create(@Valid @RequestBody SensorSonoroCreate sensor) throws NotFoundException {
        return ResponseEntity.ok().body(this.service.save(sensor));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/temperatura")
    public ResponseEntity<Sensor> create(@Valid @RequestBody SensorTemperaturaCreate sensor) throws NotFoundException {
        return ResponseEntity.ok().body(this.service.save(sensor));
    }

}
