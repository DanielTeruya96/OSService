package com.example.osnaruto.request;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

import javax.persistence.Basic;
import javax.persistence.Column;

public class EquipamentoRequest {


    @ApiModelProperty(value = "codigo do equipamento", example="1")
    private Integer id;

    @ApiModelProperty(value = "nome do equipamento", example="lacre")
    private String nome;

    @ApiModelProperty(value = "modelo do equipamento", example="auau")
    private String modelo;

    @ApiModelProperty(value = "marca do equipamento", example="kajsdhajdskg")
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
