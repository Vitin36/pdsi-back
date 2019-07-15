package com.sim.dto;

import javax.validation.constraints.NotNull;

public class SensorSonoroCreate extends SensorCreate {

    @NotNull
    private Integer intensidade;

    public Integer getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(Integer intensidade) {
        this.intensidade = intensidade;
    }
}
