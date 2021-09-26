package com.example.osnaruto.service;

import com.example.osnaruto.business.BasicBusiness;
import com.example.osnaruto.exception.AutenticacaoException;
import com.example.osnaruto.exception.BasicException;
import com.example.osnaruto.model.EntidadeBase;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.AbstractRepository;
import com.example.osnaruto.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AbstractService<T extends EntidadeBase,RE,RP> {


    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    protected AbstractRepository<T> repository;

    protected T entidade;

    protected final ModelMapper modelMapper = new ModelMapper();

    protected final BasicBusiness<T> business = new BasicBusiness<>();

    protected Usuario logado;


    public List<RP> consultar(String token){
        logger.info("Buscando");
        this.logado = usuarioRepository.findByToken(token);

        List<T> ts = consulta();
        return populaResponse(ts);
    }









    public RP novo(RE request,String token){
        logger.info("Novo "+request.toString()+" com o token "+token);
        this.logado = getUsuario(token);

        this.entidade = novaEntidade(request);
        entidade = business.inserir(entidade,logado);
        validarNovo();

        entidade = repository.save(entidade);

        RP response = novoResponse(entidade);
        logger.info("retorno "+response.toString());
        return response;
    }


    public RP alterar(RE request, String token){
        logger.info("Alterando "+request+" com o token "+token);
        logado = getUsuario(token);

        T t = buscaEntidadeAlterar(request);
        t = repository.save(t);

        RP rp = populaResponseEditar(t);
        logger.info("Alterado "+rp.toString());
        return rp;

    }

    protected abstract RP populaResponseEditar(T t);

    protected abstract T buscaEntidadeAlterar(RE request);

    protected abstract RP novoResponse(T entidade);

    private void validarNovo() {
    }

    protected abstract T novaEntidade(RE request);




    protected abstract List<RP> populaResponse(List<T> ts);

    protected abstract List<T> consulta();


    public String remover(Integer id, String token){
        logger.info("remover recebido: "+id.toString()+" com o token "+token);
        Usuario logado = getUsuario(token);


        this.entidade = encontraEntidade(id);
        validarRemocao();

        entidade = business.remove(entidade,logado);
        repository.save(entidade);
        return "Removido com sucesso";


    }

    private T encontraEntidade(Integer id) {
        Optional<T> optionalT = repository.findById(id);
        if(optionalT.isEmpty()){
            throw new BasicException("Codigo nao encontrado");
        }

        this.entidade = optionalT.get();
        return this.entidade;
    }


    protected void validarRemocao(){
        //faz nada

    }

    protected Usuario getUsuario(String token) {
        Usuario logado = usuarioRepository.findByToken(token);
        if(logado == null){
            throw new AutenticacaoException();
        }
        logger.info("Usuario encontrado "+logado);
        return logado;
    }

}
