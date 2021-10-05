package com.example.osnaruto.resource;

import com.example.osnaruto.response.GerenciarClienteResponse;
import com.example.osnaruto.service.GerenciarClienteService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cliente/gerenciar")
@Api(tags = "Gerenciar cliente")
public class GerenciarClienteResource {

    private final GerenciarClienteService service;


    public GerenciarClienteResource(GerenciarClienteService service) {
        this.service = service;
    }

    @GetMapping(name = "consultar")
    public List<GerenciarClienteResponse> buscar(@RequestHeader String token){
        return service.consultar(token);
    }

}
