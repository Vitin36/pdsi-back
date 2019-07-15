package com.sim.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class SensorLuz extends Sensor{

    public SensorLuz(){}

    public SensorLuz(Poste p , Integer value){
        super(p,value);
    }

    @NotNull
    private Integer luminosidade;

    public Integer getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(Integer luminosidade) {
        this.luminosidade = luminosidade;
        this.value = luminosidade;
    }

    @Override
    public void setValue(Integer value){
        this.setLuminosidade(value);
    }

    @Override
    public Integer getValue(){
        return this.luminosidade;
    }
}
