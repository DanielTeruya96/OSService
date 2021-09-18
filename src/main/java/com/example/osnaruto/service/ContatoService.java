package com.example.osnaruto.service;

import com.example.osnaruto.exception.BasicException;
import com.example.osnaruto.model.Contato;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.ContatoRepository;
import com.example.osnaruto.request.ContatoRequest;
import com.example.osnaruto.response.ContatoResponse;
import org.modelmapper.ModelMapper;
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
        List<ContatoResponse> contatos = new ArrayList<>();
        for(Contato item: contatoRepository.findAll()){

            ModelMapper modelMapper = new ModelMapper();
            ContatoResponse response =  modelMapper.map(item, ContatoResponse .class);
            contatos.add(response);
        }
        return contatos;
    }


    public String removeContato(Integer contatoId, String token) {
        Usuario logado = getUsuario(token);

        Optional<Contato> optionalContato = contatoRepository.findById(contatoId);

        if(optionalContato.isEmpty()){
            throw new BasicException("contatoId nao encontrado");
        }

        Contato contato = optionalContato.get();


        contato = business.remove(contato,logado);
        contatoRepository.save(contato);

        return "Contato removido com sucesso!";
    }

    public ContatoResponse insereContato(ContatoRequest contatoRequest, String token) {
        Usuario logado = getUsuario(token);

        ModelMapper modelMapper = new ModelMapper();
        Contato contato = modelMapper.map(contatoRequest, Contato.class);


        contato.setUsuarioInclusao(logado.getNome());
        contato.setDataInclusao(new Date());
        contato.setVersaoRegistro(0);
        contato = contatoRepository.save(contato);

        return modelMapper.map(contato,ContatoResponse.class);
    }
}
