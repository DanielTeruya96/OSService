package com.example.osnaruto.repository;

import com.example.osnaruto.model.Contato;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends CrudRepository<Contato,Integer> {

    @Override
    @Query(value = "select c from Contato c where c.ativo = true")
    Iterable<Contato> findAll();
}
