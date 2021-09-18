package com.example.osnaruto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ApiModel
public class ContatoResponse {

    @ApiModelProperty(value = "Código do contato", example = "123")
    private int id;

    @ApiModelProperty(value = "nome do contato", example = "Josenildo")
    private String nome;

    @ApiModelProperty(value = "telefone do contato", example = "48651-7894")
    private String telefone;

    @ApiModelProperty(value = "email do contato", example = "josenildo@mail.com")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
