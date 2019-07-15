package com.sim.dto;

import javax.validation.constraints.NotNull;

public class SensorLuzCreate extends SensorCreate{

    @NotNull
    private Integer luminosidade;

    public Integer getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(Integer luminosidade) {
        this.luminosidade = luminosidade;
    }
}
