package com.example.osnaruto.request;

import com.example.osnaruto.response.ContatoResponse;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class ClientRequest {


    @ApiModelProperty(value = "Razão social", example = "Conveniencia")
    private String razaoSocial;

    @ApiModelProperty(value = "CPF ou CNPJ do cliente", example="75264895148")
    private String cpfPcpj;

    @ApiModelProperty(value = "Nome fantasia", example="Josenildo Cachaças")
    private String nomeFantasia;

    @ApiModelProperty(value = "Endereco do cliente", example="Rua de algum lugar numero 53")
    private String endereco;

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
}
