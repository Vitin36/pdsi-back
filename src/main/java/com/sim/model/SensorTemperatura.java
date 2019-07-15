package com.sim.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class SensorTemperatura extends Sensor{

    public SensorTemperatura(){}

    public SensorTemperatura(Poste p , Integer value){
        super(p,value);
    }

    @NotNull
    private Integer temperatura;

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
        this.value = temperatura;
    }

    @Override
    public void setValue(Integer value){
        this.setTemperatura(value);
    }

    @Override
    public Integer getValue(){
        return this.temperatura;
    }
}
