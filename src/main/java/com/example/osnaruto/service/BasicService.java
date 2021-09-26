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

import java.util.Optional;

public abstract class BasicService<T extends EntidadeBase> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    protected AbstractRepository<T> repository;

    protected T entidade;

    protected final ModelMapper modelMapper = new ModelMapper();

    protected final BasicBusiness<T> business = new BasicBusiness<>();


    protected Usuario getUsuario(String token) {
        Usuario logado = usuarioRepository.findByToken(token);
        if(logado == null){
            throw new AutenticacaoException();
        }
        logger.info("Usuario encontrado "+logado);
        return logado;
    }




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
}
