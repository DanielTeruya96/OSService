package com.example.osnaruto.resource;

import com.example.osnaruto.model.Equipamento;
import com.example.osnaruto.request.EquipamentoRequest;
import com.example.osnaruto.response.EquipamentoResponse;
import com.example.osnaruto.service.EquipamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("equipamento")
public class EquipamentoResource {

    private final EquipamentoService service;

    public EquipamentoResource(EquipamentoService service) {
        this.service = service;
    }

    @GetMapping(value = "/consultar")
    public List<EquipamentoResponse> consultarEquipamento(){
        return service.consultar();
    }

    @PostMapping("/cadastrar")
    public EquipamentoResponse inserirEquipamento(@RequestBody EquipamentoRequest equipamentoRequest, @RequestHeader String token){
            return service.cadastrarEquipament(equipamentoRequest,token);
    }



}
