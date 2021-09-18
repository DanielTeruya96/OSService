package com.example.osnaruto.service;

import com.example.osnaruto.exception.AutenticacaoException;
import com.example.osnaruto.model.Cliente;
import com.example.osnaruto.model.EntidadeBase;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.BasicBusiness;
import com.example.osnaruto.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class BasicService<T extends EntidadeBase> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    protected final ModelMapper modelMapper = new ModelMapper();

    protected final BasicBusiness<T> business = new BasicBusiness<>();


    protected Usuario getUsuario(String token) {
        Usuario logado = usuarioRepository.findByToken(token);
        if(logado == null){
            throw new AutenticacaoException();
        }
        return logado;
    }


    protected final BasicBusiness<T> business = new BasicBusiness<>();
}
