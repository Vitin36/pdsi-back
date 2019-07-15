package com.sim.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class OrdemServicoCreate implements Serializable {

    @NotNull
    private String poste;

    private String descricao;

    @NotNull String equipamento;

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
}
