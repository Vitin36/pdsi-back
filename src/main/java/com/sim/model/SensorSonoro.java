package com.sim.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class SensorSonoro extends Sensor{

    public SensorSonoro(){}

    public SensorSonoro(Poste p , Integer value){
        super(p,value);
    }

    @NotNull
    private Integer intensidade;

    public Integer getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(Integer temperatura) {
        this.intensidade = temperatura;
        this.value = temperatura;
    }

    @Override
    public void setValue(Integer value){
        this.setIntensidade(value);
    }

    @Override
    public Integer getValue(){
        return this.intensidade;
    }
}
