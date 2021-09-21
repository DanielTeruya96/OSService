package com.example.osnaruto.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item extends EntidadeBase{

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "nome", length = 500)
    private String nome;

    @Basic
    @Column(name = "modelo", length = 500)
    private String modelo;


    @Basic
    @Column(name = "marca", length = 500)
    private String marca;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (id != null ? !id.equals(item.id) : item.id != null) return false;
        if (nome != null ? !nome.equals(item.nome) : item.nome != null) return false;
        if (modelo != null ? !modelo.equals(item.modelo) : item.modelo != null) return false;
        return marca != null ? marca.equals(item.marca) : item.marca == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        return result;
    }
}
