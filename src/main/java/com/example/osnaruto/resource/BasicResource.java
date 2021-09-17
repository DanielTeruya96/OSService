package com.example.osnaruto.resource;

import com.example.osnaruto.exception.AutenticacaoException;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


public class BasicResource {

    @Autowired
    private UsuarioRepository usuarioRepository;

    protected Usuario getUsuario(String token) {
        Usuario logado = usuarioRepository.findByToken(token);
        if(logado == null){
            throw new AutenticacaoException();
        }
        return logado;
    }

}
