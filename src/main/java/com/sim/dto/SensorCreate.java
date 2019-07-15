package com.sim.dto;

import javax.validation.constraints.NotNull;

public abstract class SensorCreate {

    @NotNull
    private String poste;

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
}
