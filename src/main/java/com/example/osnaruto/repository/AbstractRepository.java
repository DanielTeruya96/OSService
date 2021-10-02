package com.example.osnaruto.repository;

import com.example.osnaruto.model.EntidadeBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractRepository<T extends EntidadeBase> extends JpaRepository<T,Integer>, JpaSpecificationExecutor<T> {
}
