package com.sim.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notificacoes")
public class Notificacoes {

    public Notificacoes(){
        this.lida = false;
    }

    public Notificacoes(String message){
        this.message = message;
        this.lida = false;
    }

    @Id
    private String id;

    @NotNull
    private String message;

    private Boolean lida;

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setarComoLida(){
        this.lida = true;
    }

    public Boolean getLida() {
        return lida;
    }

    public void setLida(Boolean lida) {
        this.lida = lida;
    }
}
