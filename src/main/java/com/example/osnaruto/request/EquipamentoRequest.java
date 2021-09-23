package com.example.osnaruto.request;

import javax.persistence.Basic;
import javax.persistence.Column;

public class EquipamentoRequest {


    private String nome;

    private String modelo;

    private String marca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
