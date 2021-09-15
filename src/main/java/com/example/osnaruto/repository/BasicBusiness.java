package com.example.osnaruto.repository;

import com.example.osnaruto.model.EntidadeBase;
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

    public T inserir(T t, Usuario logado){
        t.setUsuarioInclusao(logado.getNome());
        t.setDataInclusao(new Date());
        t.setVersaoRegistro(0);
        return t;
    }

}
