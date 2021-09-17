package com.example.osnaruto.response;

import com.example.osnaruto.model.Contato;

import javax.persistence.*;
import java.util.List;

public class ClienteResponse {


    private Integer id;


    private String razaoSocial;


    private String cpfPcpj;

    private String nomeFantasia;


    private String endereco;


    private List<ContatoResponse> contatos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfPcpj() {
        return cpfPcpj;
    }

    public void setCpfPcpj(String cpfPcpj) {
        this.cpfPcpj = cpfPcpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<ContatoResponse> getContatos() {
        return contatos;
    }

    public void setContatos(List<ContatoResponse> contatos) {
        this.contatos = contatos;
    }
}
