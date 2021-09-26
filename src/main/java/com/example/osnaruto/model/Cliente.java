package com.example.osnaruto.model;

import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente extends EntidadeBase {


    @Basic
    @Column(name = "razao_social")
    private String razaoSocial;

    @Basic
    @Column(name = "cpf_pcpj")
    private String cpfPcpj;

    @Basic
    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Basic
    @Column(name = "endereco", length = 500)
    private String endereco;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    @Where(clause = "ativo = 1")
    private List<Contato> contatos;


    public Cliente() {

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


    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;

    }
}
