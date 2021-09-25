package com.example.osnaruto.business;

import com.example.osnaruto.model.EntidadeBase;
import com.example.osnaruto.model.Equipamento;
import com.example.osnaruto.model.Usuario;

import java.util.Date;

public class BasicBusiness<T extends EntidadeBase> {

    public T remove(T t, Usuario logado){
        t.setAtivo(false);
        t.setDataAlteracao(new Date());
        t.setUsuarioAlteracao(logado.getNome());
        t.setVersaoRegistro(t.getVersaoRegistro()+1);
        return t;
    }

    public T alterar(T t, Usuario logado, T e){
        e.setUsuarioInclusao(t.getUsuarioInclusao());
        e.setDataInclusao( t.getDataInclusao());
        e.setAtivo(true);
        e.setDataAlteracao(new Date());
        e.setUsuarioAlteracao(logado.getNome());
        e.setVersaoRegistro(t.getVersaoRegistro()+1);
        return e;
    }

    public T inserir(T t, Usuario logado){
        t.setUsuarioInclusao(logado.getNome());
        t.setDataInclusao(new Date());
        t.setVersaoRegistro(0);
        t.setAtivo(true);
        return t;
    }

}
