package com.sim.dto;

import javax.validation.constraints.NotNull;

public class SensorTemperaturaCreate extends SensorCreate {
    @NotNull
    private Integer temperatura;

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }
}
