package com.example.osnaruto.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@DynamicUpdate
public class Balanca extends EntidadeBase{


    @Column(name = "nome",  length = 500)
    private String nome;


    @Column(name = "modelo",  length = 500)
    private String modelo;

    @Column(name = "marca", length = 500)
    private String marca;

    @Column(name = "portaria", length = 500)
    private String portaria;


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
