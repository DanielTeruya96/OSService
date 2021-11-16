package com.example.osnaruto.response;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import java.util.List;

@ApiModel
public class ClienteResponse {


    @ApiModelProperty(value = "codigo do cliente", example = "5")
    private Integer id;


    @ApiModelProperty(value = "Razão social", example = "Conveniencia")
    private String razaoSocial;

    @ApiModelProperty(value = "CPF ou CNPJ do cliente", example="75264895148")
    private String cpfPcpj;

    @ApiModelProperty(value ="inscricao", example="23543545")
    private String inscricao;

    @ApiModelProperty(value = "Nome fantasia", example="Josenildo Cachaças")
    private String nomeFantasia;



    @ApiModelProperty(value = "Endereco do cliente", example="Rua de algum lugar numero 53")
    private String endereco;

    @ApiModelProperty(value = "numero", example="2")
    private String numero;

    @ApiModelProperty(value = "cep", example="7894-000")
    private String cep;

    @ApiModelProperty(value = "Cidade", example="Nioaque")
    private String cidade;

    @ApiModelProperty(value = "Bairro", example="jardim mansão")
    private String bairro;

    @ApiModelProperty(value = "Estado", example="MS")
    private String estado;



    @ApiModelProperty(value = "Lista de Contato")
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

    @Override
    public String toString() {
        return "ClienteResponse{" +
                "id=" + id +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cpfPcpj='" + cpfPcpj + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", endereco='" + endereco + '\'' +
                ", contatos=" + contatos +
                '}';
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
