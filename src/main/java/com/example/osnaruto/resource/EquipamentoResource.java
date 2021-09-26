package com.example.osnaruto.resource;

import com.example.osnaruto.model.Equipamento;
import com.example.osnaruto.request.EquipamentoRequest;
import com.example.osnaruto.response.EquipamentoResponse;
import com.example.osnaruto.service.EquipamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoResource {

    private final EquipamentoService service;

    public EquipamentoResource(EquipamentoService service) {
        this.service = service;
    }

    @GetMapping(value = "/consultar")
    public List<EquipamentoResponse> consultarEquipamento(@RequestHeader String token){
        return service.consultar(token);
    }

    @PostMapping("/cadastrar")
    public EquipamentoResponse inserirEquipamento(@RequestBody EquipamentoRequest equipamentoRequest, @RequestHeader String token){
            return service.novo(equipamentoRequest,token);
    }

    @PutMapping("/alterar")
    public EquipamentoResponse alterarEquipamento(@RequestBody EquipamentoRequest equipamentoRequest, @RequestHeader String token){
        return service.alterar(equipamentoRequest,token);
    }

    @DeleteMapping("/remover")
    public String removerEquipamento(@RequestParam Integer equipamentoId, @RequestHeader String token ){
        return service.remover(equipamentoId, token);
    }



}
