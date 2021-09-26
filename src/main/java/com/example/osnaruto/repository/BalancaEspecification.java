package com.example.osnaruto.repository;

import com.example.osnaruto.model.Balanca;
import com.example.osnaruto.model.Equipamento;
import org.springframework.data.jpa.domain.Specification;

public class BalancaEspecification {

    public static Specification<Balanca> ativo() {
        return (root, query, builder) -> builder.equal(root.get("ativo"), true);
    }
}
