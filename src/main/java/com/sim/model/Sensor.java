package com.sim.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "sensor")
abstract public class Sensor {

    public Sensor(){

    }

    public Sensor(Poste p , Integer value){
        this.poste = p;
        this.setValue(value);
    }

    @Id
    private String id;

    @DBRef
    private Poste poste;

    protected Integer value;

    public String getId() {
        return id;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    @JsonIgnore
    public abstract Integer getValue();

    public abstract void setValue(Integer value);
}
