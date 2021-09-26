package com.example.osnaruto.response;

public class BalancaResponse {

    private Integer id;

    private String nome;

    private String modelo;

    private String marca;


    private String portaria;



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
        return "BalancaResponse{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", portaria='" + portaria + '\'' +
                ", numeroImetro='" + numeroImetro + '\'' +
                '}';
    }
}
