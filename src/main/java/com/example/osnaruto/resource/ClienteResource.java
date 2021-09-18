package com.example.osnaruto.resource;

import com.example.osnaruto.exception.BasicException;
import com.example.osnaruto.model.Cliente;
import com.example.osnaruto.model.ClienteRepository;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.BasicBusiness;
import com.example.osnaruto.request.ClientRequest;
import com.example.osnaruto.response.ClienteResponse;
import com.example.osnaruto.service.ClienteService;
import io.swagger.annotations.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cliente")
public class ClienteResource {

    private final ClienteService service;

    public ClienteResource(ClienteService service) {
        this.service = service;
    }

    @ApiOperation(value = "Consulta todos clientes")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna lista de clientes"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @GetMapping(value = "/consultar", produces = "application/json")
    public List<ClienteResponse> consultar(){
         return service.buscarTotosCliente();

    }


    @ApiOperation(value = "Insere cliente")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna Cliente cadastrado"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "Token de acesso", required = true, paramType = "header", dataTypeClass = String.class, example = "852468245"),
    })
    @PostMapping(value = "/insereCliente", consumes = "application/json", produces = "application/json")
    public ClienteResponse insereCliente(@RequestBody ClientRequest clienteRequest, @RequestHeader String token){
        return service.insereCliente(clienteRequest, token);
    }


    @ApiOperation(value = "Remove um cliente")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Ok"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "Token de acesso", required = true,  paramType = "header", dataTypeClass = String.class, example = "852468245"),
            @ApiImplicitParam(name = "clienteId", value = "Codigo do contato", required = true, paramType = "header", dataTypeClass = String.class, example = "123"),
    })
    @PostMapping(value = "/removerCliente", produces = "text/plain")
    public String removerCliente(@RequestParam Integer clienteId, @RequestHeader String token){
        return service.removerCliente(clienteId,token);
    }


}
