package com.example.osnaruto.response;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel
public class ClienteResponse {


    @ApiModelProperty(value = "codigo do cliente", example = "5")
    private Integer id;


    @ApiModelProperty(value = "Razão social", example = "Conveniencia")
    private String razaoSocial;

    @ApiModelProperty(value = "CPF ou CNPJ do cliente", example="75264895148")
    private String cpfPcpj;

    @ApiModelProperty(value = "Nome fantasia", example="Josenildo Cachaças")
    private String nomeFantasia;

    @ApiModelProperty(value = "Endereco do cliente", example="Rua de algum lugar numero 53")
    private String endereco;


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
}
