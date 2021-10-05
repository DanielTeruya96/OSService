package com.example.osnaruto.service;

import com.example.osnaruto.exception.BasicException;
import com.example.osnaruto.model.ClienteBalanca;
import com.example.osnaruto.model.Equipamento;
import com.example.osnaruto.repository.GerenciarClienteRepository;
import com.example.osnaruto.request.GerenciarClienteRequest;
import com.example.osnaruto.resource.GerenciarClienteResource;
import com.example.osnaruto.response.EquipamentoResponse;
import com.example.osnaruto.response.GerenciarClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GerenciarClienteService extends AbstractService<ClienteBalanca, GerenciarClienteRequest, GerenciarClienteResponse>{

    @Autowired
    private GerenciarClienteRepository gerenciarClienteRepository;

    @Override
    protected GerenciarClienteResponse populaResponseEditar(ClienteBalanca clienteBalanca) {
        return modelMapper.map(clienteBalanca, GerenciarClienteResponse.class);
    }

    @Override
    protected ClienteBalanca buscaEntidadeAlterar(GerenciarClienteRequest request) {
        ClienteBalanca clienteBalanca = buscarClienteBalanca(request.getId());
        ClienteBalanca clienteBalancaNovo = modelMapper.map(request,ClienteBalanca.class);
        return business.alterar(clienteBalanca,logado,clienteBalancaNovo);
    }

    @Override
    protected GerenciarClienteResponse novoResponse(ClienteBalanca entidade) {
        return modelMapper.map(entidade,GerenciarClienteResponse.class);
    }

    @Override
    protected ClienteBalanca novaEntidade(GerenciarClienteRequest request) {
        return modelMapper.map(request,ClienteBalanca.class);
    }

    @Override
    protected List<GerenciarClienteResponse> populaResponse(List<ClienteBalanca> clienteBalancas) {
        List<GerenciarClienteResponse> responses = new ArrayList<>();
        for(ClienteBalanca clienteBalanca: clienteBalancas){
            responses.add(modelMapper.map(clienteBalanca,GerenciarClienteResponse.class));
        }
        return responses;
    }

    @Override
    protected List<ClienteBalanca> consulta() {
        return gerenciarClienteRepository.findAll();
    }

    private ClienteBalanca buscarClienteBalanca(Integer clienteBalancaId) {
        Optional<ClienteBalanca> equipamentoOptional = gerenciarClienteRepository.findById(clienteBalancaId);

        if(equipamentoOptional.isEmpty()){
            throw new BasicException("Codigo do equipamento nao encontrado");
        }

        ClienteBalanca equipamento = equipamentoOptional.get();
        logger.info("Foi encontrado o ClienteBalanca "+equipamento);
        return equipamento;
    }

}
