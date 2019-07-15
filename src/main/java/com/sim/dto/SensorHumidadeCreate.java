package com.sim.dto;

import javax.validation.constraints.NotNull;

public class SensorHumidadeCreate extends SensorCreate{

    @NotNull
    private Integer acionamento;

    public Integer getAcionamento() {
        return acionamento;
    }

    public void setAcionamento(Integer acionamento) {
        this.acionamento = acionamento;
    }
}
