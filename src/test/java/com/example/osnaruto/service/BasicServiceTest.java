package com.example.osnaruto.service;

import com.example.osnaruto.exception.AutenticacaoException;

import com.example.osnaruto.model.ClienteRepository;
import com.example.osnaruto.model.EntidadeBase;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.UsuarioRepository;
import com.example.osnaruto.resource.BasicResource;

import com.example.osnaruto.resource.ClienteResource;
import com.example.osnaruto.response.ClienteResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(ClienteResource.class)
class BasicServiceTest {

    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private ClienteService service;

    @Autowired
    private ObjectMapper objectMapper;




    @Test
    public void testaGet() throws Exception{
        List<ClienteResponse> responses = geraResponse();
        when(service.buscarTotosCliente()).thenReturn(responses);

        mockMvc.perform(get("/cliente/consultar")).andDo(print())
                .andExpect(status().isOk()).andReturn();
    }

    private List<ClienteResponse> geraResponse() {
        Faker f = new Faker();
        ClienteResponse response = new ClienteResponse();
        response.setNomeFantasia(f.name().fullName());
        response.setEndereco(f.address().fullAddress());
        List<ClienteResponse> list = new ArrayList<>();
        list.add(response);
        return list;
    }


}