package com.example.osnaruto.service;

import static com.example.osnaruto.repository.EquipamentoEspecification.*;

import com.example.osnaruto.model.Equipamento;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.EquipamentoRepository;
import com.example.osnaruto.request.EquipamentoRequest;
import com.example.osnaruto.response.EquipamentoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class EquipamentoService extends BasicService<Equipamento> {

    @Autowired
    private EquipamentoRepository equipamentoRepository;

    public List<EquipamentoResponse> consultar() {
        logger.info("Buscando todos os equipamentos");

        List<Equipamento> equipamentos = equipamentoRepository.findAll(ativo());

        List<EquipamentoResponse> responses = new ArrayList<>();
        for(Equipamento item: equipamentos){
            responses.add(modelMapper.map(item,EquipamentoResponse.class));
        }

        return responses;


    }

    public EquipamentoResponse cadastrarEquipament(EquipamentoRequest equipamentoRequest, String token) {
        logger.info("insereCliente recebido: "+equipamentoRequest.toString()+" com o token "+token);
        Usuario logado = getUsuario(token);

        Equipamento equipamento = modelMapper.map(equipamentoRequest, Equipamento.class);
        equipamento = business.inserir(equipamento,logado);

        equipamento = equipamentoRepository.save(equipamento);

        EquipamentoResponse response = modelMapper.map(equipamento,EquipamentoResponse.class);
        logger.info("Response "+response.toString());
        return response;
    }
}
