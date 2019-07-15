package com.sim.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class SensorHumidade extends Sensor {

    public SensorHumidade(){}

    public SensorHumidade(Poste p , Integer value){
        super(p,value);
    }

    @NotNull
    private Integer acionameto;

    public void setAcionameto(Integer acionameto) {
        this.acionameto = acionameto;
    }

    public Integer getAcionameto() {
        return acionameto;
    }

    @Override
    public void setValue(Integer value){
        this.setAcionameto(value);
        this.value = value;
    }

    @Override
    public Integer getValue(){
        return this.acionameto;
    }
}
