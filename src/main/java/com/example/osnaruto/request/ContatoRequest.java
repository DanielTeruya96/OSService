package com.example.osnaruto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class ContatoRequest {

    @ApiModelProperty(hidden = true)
    private Integer id = null;

    @ApiModelProperty(value = "Nome do Contato", required = true, example = "Josenildo")
    private String nome;

    @ApiModelProperty(value = "Telefone do contato", example = "1000-000")
    private String telefone;

    @ApiModelProperty(value = "email do contato", example = "mail@mail.com")
    private String email;

    @ApiModelProperty(value = "codigo do cliente", example="123")
    private Integer idCliente;


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

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "ContatoRequest{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
