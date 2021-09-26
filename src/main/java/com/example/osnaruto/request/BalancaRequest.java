package com.example.osnaruto.request;

import io.swagger.annotations.ApiModelProperty;

public class BalancaRequest {

    @ApiModelProperty(value = "Codigo da balanca", example="1")
    private Integer id;

    @ApiModelProperty(value = "nome da balanca", example="prix")
    private String nome;

    @ApiModelProperty(value = "modelo da balanca", example="filizola")
    private String modelo;

    @ApiModelProperty(value = "marca da balanca", example="filizola")
    private String marca;

    @ApiModelProperty(value = "portaria", example="999786-0000")
    private String portaria;


    @ApiModelProperty(value = "Numero do imetro", example="13123987")
    private String numeroImetro;


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

    public String getPortaria() {
        return portaria;
    }

    public void setPortaria(String portaria) {
        this.portaria = portaria;
    }

    public String getNumeroImetro() {
        return numeroImetro;
    }

    public void setNumeroImetro(String numeroImetro) {
        this.numeroImetro = numeroImetro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BalancaRequest{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", portaria='" + portaria + '\'' +
                ", numeroImetro='" + numeroImetro + '\'' +
                '}';
    }
}
