package com.example.osnaruto.service;

import com.example.osnaruto.exception.BasicException;
import com.example.osnaruto.model.Balanca;
import com.example.osnaruto.request.BalancaRequest;
import com.example.osnaruto.response.BalancaResponse;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.example.osnaruto.repository.BalancaEspecification.ativo;

@Service
public class BalancaSerive extends AbstractService<Balanca, BalancaRequest, BalancaResponse> {

    @Override
    protected BalancaResponse populaResponseEditar(Balanca balanca) {
        return modelMapper.map(balanca,BalancaResponse.class);
    }

    @Override
    protected Balanca buscaEntidadeAlterar(BalancaRequest request) {
        return buscaEquipamento(request.getId());
    }

    @Override
    protected BalancaResponse novoResponse(Balanca entidade) {
        return modelMapper.map(entidade,BalancaResponse.class);
    }

    @Override
    protected Balanca novaEntidade(BalancaRequest request) {
        return modelMapper.map(request,Balanca.class);
    }

    @Override
    protected List<BalancaResponse> populaResponse(List<Balanca> balancas) {
        return modelMapper.map(balancas,new TypeToken<List<Balanca>>() {}.getType());
    }

    @Override
    protected List<Balanca> consulta() {
        return repository.findAll(ativo());
    }


    private Balanca buscaEquipamento(Integer balancaId) {
        Optional<Balanca> equipamentoOptional = repository.findById(balancaId);

        if(equipamentoOptional.isEmpty()){
            throw new BasicException("Codigo do equipamento nao encontrado");
        }

        Balanca balanca = equipamentoOptional.get();
        logger.info("Foi encontrado Balanca "+balanca);
        return balanca;
    }
}
