package com.example.osnaruto.repository;


import com.example.osnaruto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    public Usuario findByToken(String token);
}
