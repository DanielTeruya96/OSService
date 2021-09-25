package com.example.osnaruto.repository;

import com.example.osnaruto.model.Equipamento;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Path;

public class EquipamentoEspecification  {

    public static Specification<Equipamento> ativo() {
        return (root, query, builder) -> builder.equal(root.get("ativo"), true);
    }

    public static Specification<Equipamento> nome(String nome){
        return (root, query, builder) -> builder.equal(root.get("nome"), nome);
    }

    public static Specification<Equipamento> id(Integer id){
        return (root, query, builder) -> builder.equal(root.get("id"), id);
    }


}
