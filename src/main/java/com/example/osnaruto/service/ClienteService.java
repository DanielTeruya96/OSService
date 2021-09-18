package com.example.osnaruto.service;

import com.example.osnaruto.exception.BasicException;
import com.example.osnaruto.model.Cliente;
import com.example.osnaruto.model.ClienteRepository;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.request.ClientRequest;
import com.example.osnaruto.response.ClienteResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService extends BasicService<Cliente> {

    @Autowired
    private ClienteRepository clienteRepository;


    public List<ClienteResponse> buscarTotosCliente(){
        List<ClienteResponse> clientes = new ArrayList<>();
        for(Cliente cliente: clienteRepository.findAll()){
            ModelMapper modelMapper = new ModelMapper();
            ClienteResponse response = modelMapper.map(cliente, ClienteResponse.class);
            clientes.add(response);
        }

        return clientes;
    }

    public ClienteResponse insereCliente(ClientRequest clienteRequest, String token) {
        Usuario logado = getUsuario(token);

        Cliente cliente = modelMapper.map(clienteRequest,Cliente.class);

        Cliente c = this.business.inserir(cliente,logado);
        c = clienteRepository.save(c);


        return modelMapper.map(c,ClienteResponse.class);
    }

    public String removerCliente(Integer clienteId, String token) {
        Usuario logado = getUsuario(token);

        Optional<Cliente> clienteOptional =  clienteRepository.findById(clienteId);

        if(clienteOptional.isEmpty()){
            throw new BasicException("clienteId nao encontrado");
        }

        Cliente cliente = clienteOptional.get();

        cliente = business.remove(cliente,logado);

        clienteRepository.save(cliente);

        return "Cliente removido com sucesso!";

    }
}
