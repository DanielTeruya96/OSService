package com.example.osnaruto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class ContatoRequest {

    @ApiModelProperty(value = "Nome do Contato", required = true, example = "Josenildo")
    private String nome;

    @ApiModelProperty(value = "Telefone do contato", example = "1000-000")
    private String telefone;

    @ApiModelProperty(value = "email do contato", example = "mail@mail.com")
    private String email;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
