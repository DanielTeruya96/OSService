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

    @Column(name = "inscricao")
    private String inscricao;

    @Basic
    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Basic
    @Column(name = "endereco", length = 500)
    private String endereco;

    @Column(name = "numero")
    private String numero;

    @Column(name = "cep")
    private String cep;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "estado")
    private String estado;


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

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
