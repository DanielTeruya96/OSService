package com.example.osnaruto.model;

import javax.persistence.*;

@Entity
@Table(name = "balanca")
public class Balanca extends EntidadeBase{

    @Basic
    @Id
    private Integer id;

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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Balanca balanca = (Balanca) o;

        if (id != null ? !id.equals(balanca.id) : balanca.id != null) return false;
        if (nome != null ? !nome.equals(balanca.nome) : balanca.nome != null) return false;
        if (modelo != null ? !modelo.equals(balanca.modelo) : balanca.modelo != null) return false;
        if (marca != null ? !marca.equals(balanca.marca) : balanca.marca != null) return false;
        if (portaria != null ? !portaria.equals(balanca.portaria) : balanca.portaria != null) return false;
        return numeroImetro != null ? numeroImetro.equals(balanca.numeroImetro) : balanca.numeroImetro == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (portaria != null ? portaria.hashCode() : 0);
        result = 31 * result + (numeroImetro != null ? numeroImetro.hashCode() : 0);
        return result;
    }
}
