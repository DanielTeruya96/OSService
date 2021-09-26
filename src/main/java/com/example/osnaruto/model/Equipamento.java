package com.example.osnaruto.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@DynamicUpdate
public class Equipamento extends EntidadeBase{

    @Column(name = "nome", length = 500)
    private String nome;


    @Column(name = "modelo",  length = 500)
    private String modelo;

    @Basic
    @Column(name = "marca", length = 500)
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



    @Override
    public String toString() {
        return "Equipamento{" +
                " nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
