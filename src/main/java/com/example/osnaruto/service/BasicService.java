package com.example.osnaruto.service;

import com.example.osnaruto.business.BasicBusiness;
import com.example.osnaruto.exception.AutenticacaoException;
import com.example.osnaruto.model.EntidadeBase;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BasicService<T extends EntidadeBase> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UsuarioRepository usuarioRepository;

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
}
