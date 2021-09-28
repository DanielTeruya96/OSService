package com.example.osnaruto.service;

import static com.example.osnaruto.repository.EquipamentoEspecification.*;

import com.example.osnaruto.exception.BasicException;
import com.example.osnaruto.model.Equipamento;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.EquipamentoRepository;
import com.example.osnaruto.request.EquipamentoRequest;
import com.example.osnaruto.response.EquipamentoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EquipamentoService extends AbstractService<Equipamento, EquipamentoRequest,EquipamentoResponse> {


    @Override
    protected EquipamentoResponse populaResponseEditar(Equipamento equipamento) {
        return modelMapper.map(equipamento,EquipamentoResponse.class);
    }

    @Override
    protected Equipamento buscaEntidadeAlterar(EquipamentoRequest request) {
        Equipamento equipamentoAntigo = buscaEquipamento(request.getId());
        Equipamento equipamentoNovo = modelMapper.map(request,Equipamento.class);
        return business.alterar(equipamentoAntigo,logado,equipamentoNovo);
    }

    @Override
    protected EquipamentoResponse novoResponse(Equipamento entidade) {
        return modelMapper.map(entidade,EquipamentoResponse.class);
    }

    @Override
    protected Equipamento novaEntidade(EquipamentoRequest request) {
        return modelMapper.map(request,Equipamento.class);
    }

    @Override
    protected List<EquipamentoResponse> populaResponse(List<Equipamento> equipamentos) {
        List<EquipamentoResponse> responses = new ArrayList<>();
        for(Equipamento item: equipamentos){
            responses.add(modelMapper.map(item,EquipamentoResponse.class));
        }

        return responses;
    }

    @Override
    protected List<Equipamento> consulta() {
        return repository.findAll(ativo());
    }

    private Equipamento buscaEquipamento(Integer equipamentoId) {
        Optional<Equipamento> equipamentoOptional = repository.findById(equipamentoId);

        if(equipamentoOptional.isEmpty()){
            throw new BasicException("Codigo do equipamento nao encontrado");
        }

        Equipamento equipamento = equipamentoOptional.get();
        logger.info("Foi encontrado o equipamento "+equipamento);
        return equipamento;
    }

}
