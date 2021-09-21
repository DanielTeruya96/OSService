package com.example.osnaruto.model;

import javax.persistence.*;

@Entity
@Table(name = "balanca")
public class Balanca extends EntidadeBase{

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private Item item;

    @Basic
    @Column(name = "portaria",  length = 500)
    private String portaria;

    @Basic
    @Column(name = "numero_imetro",  length = 500)
    private String numeroImetro;

    @Basic
    @Column(name = "capacidade", length = 500)
    private String capacidade;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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


    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Balanca balanca = (Balanca) o;

        if (id != null ? !id.equals(balanca.id) : balanca.id != null) return false;
        if (item != null ? !item.equals(balanca.item) : balanca.item != null) return false;
        if (portaria != null ? !portaria.equals(balanca.portaria) : balanca.portaria != null) return false;
        if (numeroImetro != null ? !numeroImetro.equals(balanca.numeroImetro) : balanca.numeroImetro != null)
            return false;
        return capacidade != null ? capacidade.equals(balanca.capacidade) : balanca.capacidade == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (portaria != null ? portaria.hashCode() : 0);
        result = 31 * result + (numeroImetro != null ? numeroImetro.hashCode() : 0);
        result = 31 * result + (capacidade != null ? capacidade.hashCode() : 0);
        return result;
    }
}
