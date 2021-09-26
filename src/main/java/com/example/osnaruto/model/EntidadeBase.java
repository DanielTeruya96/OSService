package com.example.osnaruto.model;

import io.swagger.models.auth.In;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class EntidadeBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ativo")
    private Boolean ativo;


    @Column(name = "DATA_INCLUSAO")
    protected Date dataInclusao;

    @Column(name = "usuario_inclusao")
    protected String usuarioInclusao;

    @Column(name = "data_alteracao")
    protected Date dataAlteracao;

    @Column(name = "usuario_alteracao")
    protected String usuarioAlteracao;

    @Column(name = "versao_registro")
    protected Integer versaoRegistro;

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public String getUsuarioInclusao() {
        return usuarioInclusao;
    }

    public void setUsuarioInclusao(String usuarioInclusao) {
        this.usuarioInclusao = usuarioInclusao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAleracao) {
        this.dataAlteracao = dataAleracao;
    }

    public String getUsuarioAlteracao() {
        return usuarioAlteracao;
    }

    public void setUsuarioAlteracao(String usuarioAlteracao) {
        this.usuarioAlteracao = usuarioAlteracao;
    }

    public Integer getVersaoRegistro() {
        return versaoRegistro == null ? 0 : versaoRegistro;
    }

    public void setVersaoRegistro(Integer versaoRegistro) {
        this.versaoRegistro = versaoRegistro;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
