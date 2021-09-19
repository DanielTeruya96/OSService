package com.example.osnaruto.service;

import com.example.osnaruto.exception.BasicException;
import com.example.osnaruto.model.Cliente;
import com.example.osnaruto.model.Contato;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.ContatoRepository;
import com.example.osnaruto.request.ContatoRequest;
import com.example.osnaruto.response.ContatoResponse;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ContatoService extends BasicService<Contato>{

    @Autowired
    private ContatoRepository contatoRepository;


    public List<ContatoResponse> consultar() {
        logger.info("Consultando todos contatos");
        List<ContatoResponse> contatos = new ArrayList<>();
        for(Contato item: contatoRepository.findAll()){

            ModelMapper modelMapper = new ModelMapper();
            ContatoResponse response =  modelMapper.map(item, ContatoResponse .class);
            contatos.add(response);
        }
        logger.info("Encontrado os seguintes contatos"+contatos);

        return contatos;
    }


    public String removeContato(Integer contatoId, String token) {
        logger.info("removeContato recebido: "+contatoId.toString()+" com o token "+token);
        Usuario logado = getUsuario(token);

        Optional<Contato> optionalContato = contatoRepository.findById(contatoId);

        if(optionalContato.isEmpty()){
            throw new BasicException("contatoId nao encontrado");
        }

        Contato contato = optionalContato.get();


        contato = business.remove(contato,logado);
        contatoRepository.save(contato);
        logger.info("Foi removido o contato de id "+contatoId);

        return "Contato removido com sucesso!";
    }

    public ContatoResponse insereContato(ContatoRequest contatoRequest, String token) {
        logger.info("insereContato recebido: "+contatoRequest.toString()+" com o token "+token);
        Usuario logado = getUsuario(token);


        Contato contato = modelMapper.map(contatoRequest, Contato.class);
        contato.setId(null);

        contato = business.inserir(contato,logado);
        contato = contatoRepository.save(contato);
        ContatoResponse response = modelMapper.map(contato,ContatoResponse.class);
        logger.info("Inserido o seguinte Contato"+response);

        return response;
    }
}
