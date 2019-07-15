package com.sim.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sim.model.Sensor;

public interface SensorRepository extends MongoRepository<Sensor, String> {
}
