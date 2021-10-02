package com.example.osnaruto.resource;

import com.example.osnaruto.model.Balanca;
import com.example.osnaruto.request.BalancaRequest;
import com.example.osnaruto.response.BalancaResponse;
import com.example.osnaruto.service.BalancaSerive;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/balanca")
@Api(tags = "Balanca")
public class BalancaResource {

    private final BalancaSerive serive;



    public BalancaResource(BalancaSerive serive) {
        this.serive = serive;
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
    @GetMapping(value = "/consultar", produces = "application/json")
    public List<BalancaResponse> consultarBalanca(@RequestHeader String token){
        return serive.consultar(token);
    }


    @ApiOperation(value = "Cria uma nova balanca")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna info da balanca"),
            @ApiResponse(code = 403, message = "Erro de autenticacao"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @PostMapping(value = "/cadastrar", consumes = "application/json", produces = "application/json")
    public BalancaResponse inserirnovaBalanca(@RequestBody BalancaRequest request, @RequestHeader String token){
        return serive.novo(request,token);
    }

    @ApiOperation(value = "Altera uma balanca que ja exite")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna info da balanca"),
            @ApiResponse(code = 403, message = "Erro de autenticacao"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @PutMapping(value = "/alterar", consumes = "application/json", produces = "application/json")
    public BalancaResponse alterarResponse(@RequestBody BalancaRequest request, @RequestHeader String token){
        return serive.alterar(request,token);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "Token de acesso", required = true,  paramType = "header", dataTypeClass = String.class, example = "852468245"),
            @ApiImplicitParam(name = "balancaId", value = "Codigo da balanca", required = true, paramType = "header", dataTypeClass = String.class, example = "123"),
    })
    @DeleteMapping(value = "/remover", produces = "text/plain")
    public String removerBalanca(@RequestParam Integer balancaId, @RequestHeader String token){
        return serive.remover(balancaId, token);
    }




}
