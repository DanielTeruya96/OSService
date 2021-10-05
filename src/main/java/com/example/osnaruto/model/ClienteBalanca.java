package com.example.osnaruto.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "cliente_balanca")
public class ClienteBalanca extends EntidadeBase {

    @ManyToOne
    @JoinColumn(name = "balanca_id",referencedColumnName = "id")
    private Balanca balanca;

    @ManyToOne
    @JoinColumn(name = "cliente_id",referencedColumnName = "id")
    private Cliente cliente;

    private String numeroSerie;
    private String numeroImetro;


    public Balanca getBalanca() {
        return balanca;
    }

    public void setBalanca(Balanca balanca) {
        this.balanca = balanca;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Basic
    @Column(name = "numero_serie", nullable = true, length = 500)
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Basic
    @Column(name = "numero_imetro", nullable = true, length = 500)
    public String getNumeroImetro() {
        return numeroImetro;
    }

    public void setNumeroImetro(String numeroImetro) {
        this.numeroImetro = numeroImetro;
    }


}
