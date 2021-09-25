package com.example.osnaruto.repository;

import com.example.osnaruto.model.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Integer>, JpaSpecificationExecutor<Equipamento> {

    List<Equipamento> findAll();
}
