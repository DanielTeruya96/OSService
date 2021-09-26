package com.example.osnaruto.repository;

import com.example.osnaruto.model.Equipamento;

import java.util.List;

public interface EquipamentoRepository extends AbstractRepository<Equipamento> {

    List<Equipamento> findAll();
}
