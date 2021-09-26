package com.example.osnaruto.model;

import javax.persistence.*;

@Entity
@Table(name = "balanca")
public class Balanca extends EntidadeBase{



    @Basic
    @Column(name = "nome",  length = 500)
    private String nome;

    @Basic
    @Column(name = "modelo",  length = 500)
    private String modelo;

    @Basic
    @Column(name = "marca", length = 500)
    private String marca;

    @Basic
    @Column(name = "portaria", length = 500)
    private String portaria;


    @Basic
    @Column(name = "numero_imetro", length = 500)
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
}
