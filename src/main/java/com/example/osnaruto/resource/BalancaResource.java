package com.example.osnaruto.resource;

import com.example.osnaruto.model.Balanca;
import com.example.osnaruto.request.BalancaRequest;
import com.example.osnaruto.response.BalancaResponse;
import com.example.osnaruto.service.BalancaSerive;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/balanca")
public class BalancaResource {

    private final BalancaSerive serive;


    public BalancaResource(BalancaSerive serive) {
        this.serive = serive;
    }

    @GetMapping(value = "/consultar")
    public List<BalancaResponse> consultarBalanca(@RequestHeader String token){
        return serive.consultar(token);
    }


    @PostMapping("/cadastrar")
    public BalancaResponse inserirnovaBalanca(@RequestBody BalancaRequest request, @RequestHeader String token){
        return serive.alterar(request,token);
    }

    @DeleteMapping("/remover")
    public String removerBalanca(@RequestParam Integer balancaId, @RequestHeader String token){
        return serive.remover(balancaId, token);
    }




}
