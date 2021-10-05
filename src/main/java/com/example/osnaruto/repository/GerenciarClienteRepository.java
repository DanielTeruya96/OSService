package com.example.osnaruto.repository;

import com.example.osnaruto.model.ClienteBalanca;
import com.example.osnaruto.service.BasicService;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenciarClienteRepository extends AbstractRepository<ClienteBalanca> {
}
