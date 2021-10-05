package com.example.osnaruto.request;

public class GerenciarClienteRequest {

    private Integer id;
    private Integer balancaId;
    private Integer clienteId;

    private String numeroSerie;
    private String numeroImetro;


    public Integer getBalancaId() {
        return balancaId;
    }

    public void setBalancaId(Integer balancaId) {
        this.balancaId = balancaId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
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
}
