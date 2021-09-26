package com.example.osnaruto.resource;

import com.example.osnaruto.request.ContatoRequest;
import com.example.osnaruto.exception.AutenticacaoException;
import com.example.osnaruto.exception.BasicException;
import com.example.osnaruto.model.Contato;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.ContatoRepository;
import com.example.osnaruto.response.ContatoResponse;
import com.example.osnaruto.service.ContatoService;
import io.swagger.annotations.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("contato")
@Api(tags = "Contato")
public class ContatoResource{



    @Autowired
    private ContatoRepository repository;

    private final ContatoService service;

    public ContatoResource(ContatoService service) {
        this.service = service;
    }

    /**
     * Busca todos os contatos
     * @return lista de contatos
     */
    @ApiOperation(value = "Consulta todos os contatos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna lista de contato"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @GetMapping(value = "/consultar", produces = "application/json")
    public List<ContatoResponse> contatos(){
        return service.consultar();
    }

    @ApiOperation(value = "Insere um contato")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna contato com o codigo do contato"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "Token de acesso", required = true, paramType = "header", dataTypeClass = String.class, example = "852468245"),
    })
    @PostMapping(value = "/insereContato", consumes = "application/json", produces = "application/json")
    public ContatoResponse insereContato(@RequestBody ContatoRequest contatoRequest, @RequestHeader String token){
        return service.insereContato(contatoRequest,token);
    }


    @ApiOperation(value = "Remove um contato")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Ok"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "Token de acesso", required = true,  paramType = "header", dataTypeClass = String.class, example = "852468245"),
            @ApiImplicitParam(name = "contatoId", value = "Codigo do contato", required = true, paramType = "header", dataTypeClass = String.class, example = "123"),
    })
    @PutMapping("/removeContato")
    public String removeContato(@RequestParam Integer contatoId, @RequestHeader String token){
        return service.removeContato(contatoId,token);
    }





}
