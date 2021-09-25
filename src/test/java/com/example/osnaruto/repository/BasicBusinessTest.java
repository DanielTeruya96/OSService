package com.example.osnaruto.repository;

import com.example.osnaruto.business.BasicBusiness;
import com.example.osnaruto.model.EntidadeBase;
import com.example.osnaruto.model.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicBusinessTest {

    private BasicBusiness<EntidadeBase> business = new BasicBusiness<>();
    private Usuario logado;

    @BeforeEach
    public  void carregarLogado(){
        Usuario u = new Usuario();
        u.setNome("TesteUsuario");
        logado = u;
    }



    @Test
    public void inserirTest(){
        EntidadeBase entidadeBase = new EntidadeBase();
        entidadeBase = business.inserir(entidadeBase,logado);

        assertEquals(entidadeBase.getVersaoRegistro(), 0);
        assertEquals(entidadeBase.getAtivo(), true);
        assertEquals(entidadeBase.getUsuarioInclusao(), logado.getNome());

        long tempoCriacao = entidadeBase.getDataInclusao().getTime();
        assertTrue(System.currentTimeMillis() > tempoCriacao);
    }

    @Test
    public void removerTest(){
        EntidadeBase entidadeBase = new EntidadeBase();
        entidadeBase = business.remove(entidadeBase,logado);

        assertEquals(entidadeBase.getVersaoRegistro(), 1);
        assertEquals(entidadeBase.getAtivo(), false);
        assertEquals(entidadeBase.getUsuarioAlteracao(), logado.getNome());

        long tempoModificacao = entidadeBase.getDataAlteracao().getTime();
        assertTrue(System.currentTimeMillis() >= tempoModificacao);
    }





}