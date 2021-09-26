package com.example.osnaruto.resource;

import com.example.osnaruto.model.Equipamento;
import com.example.osnaruto.request.EquipamentoRequest;
import com.example.osnaruto.response.EquipamentoResponse;
import com.example.osnaruto.service.EquipamentoService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamento")
@Api(tags = "Equipamento")
public class EquipamentoResource {

    private final EquipamentoService service;

    public EquipamentoResource(EquipamentoService service) {
        this.service = service;
    }

    @ApiOperation(value = "Consulta todas balancas")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna lista de balanca"),
            @ApiResponse(code = 403, message = "Erro de autenticacao"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "Token de acesso", required = true, paramType = "header", dataTypeClass = String.class, example = "852468245"),
    })
    @GetMapping(value = "/consultar")
    public List<EquipamentoResponse> consultarEquipamento(@RequestHeader String token){
        return service.consultar(token);
    }

    @ApiOperation(value = "Cadastrar um equipamento")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna info dos equipamento"),
            @ApiResponse(code = 403, message = "Erro de autenticacao"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @PostMapping(value = "/cadastrar", consumes = "application/json", produces = "application/json")
    public EquipamentoResponse inserirEquipamento(@RequestBody EquipamentoRequest equipamentoRequest, @RequestHeader String token){
            return service.novo(equipamentoRequest,token);
    }

    @ApiOperation(value = "Altera um equipamento que ja exite")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna info do equipamento"),
            @ApiResponse(code = 403, message = "Erro de autenticacao"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @PutMapping(value = "/alterar", consumes = "application/json", produces = "application/json")
    public EquipamentoResponse alterarEquipamento(@RequestBody EquipamentoRequest equipamentoRequest, @RequestHeader String token){
        return service.alterar(equipamentoRequest,token);
    }

    @ApiOperation(value = "deleta um equipamento que ja exite")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna \"OK\" "),
            @ApiResponse(code = 403, message = "Erro de autenticacao"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @DeleteMapping(value = "/remover", consumes = "application/json", produces = "application/json")
    public String removerEquipamento(@RequestParam Integer equipamentoId, @RequestHeader String token ){
        return service.remover(equipamentoId, token);
    }



}
