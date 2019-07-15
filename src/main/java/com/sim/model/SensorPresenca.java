package com.sim.model;

import javax.validation.constraints.NotNull;

public class SensorPresenca extends Sensor{

    public SensorPresenca(){}

    public SensorPresenca(Poste p , Integer value){
        super(p,value);
    }

    @NotNull
    private Integer acionamento;

    public Integer getAcionamento() {
        return acionamento;
    }

    public void setAcionamento(Integer acionamento) {
        this.acionamento = acionamento;
        this.value = acionamento;
    }

    @Override
    public void setValue(Integer value){
        this.setAcionamento(value);
    }

    @Override
    public Integer getValue(){
        return this.acionamento;
    }
}
