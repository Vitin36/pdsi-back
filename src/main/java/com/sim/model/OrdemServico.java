package com.sim.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ordemServico")
public class OrdemServico {


    @Id
    private String id;

    @DBRef
    @NotNull
    private Poste poste;

    @NotNull
    private String descricao;

    @NotNull
    private String equipamento;

    private Date reparo;

    public OrdemServico() {
        this.reparo = new Date();
    }

    public OrdemServico(Poste poste, String descricao, String equipamento) {
        this.poste = poste;
        this.descricao = descricao;
        this.equipamento = equipamento;
        this.reparo = new Date();
    }

    public String getId() {
        return id;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getReparo() {
        return reparo;
    }

    public void setReparo(Date reparo) {
        this.reparo = reparo;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
}
