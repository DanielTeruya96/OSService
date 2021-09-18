package com.example.osnaruto.resource;

import com.example.osnaruto.request.ContatoRequest;
import com.example.osnaruto.exception.AutenticacaoException;
import com.example.osnaruto.exception.BasicException;
import com.example.osnaruto.model.Contato;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.BasicBusiness;
import com.example.osnaruto.repository.ContatoRepository;
import com.example.osnaruto.repository.UsuarioRepository;
import com.example.osnaruto.response.ContatoResponse;
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
public class ContatoResource{



    @Autowired
    private ContatoRepository repository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    private final BasicBusiness<Contato> business = new BasicBusiness<>();

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
        List<ContatoResponse> contatos = new ArrayList<>();
        for(Contato item: repository.findAll()){

            ModelMapper modelMapper = new ModelMapper();
            ContatoResponse response =  modelMapper.map(item, ContatoResponse .class);
            contatos.add(response);
        }
        return contatos;
    }

    @ApiOperation(value = "Insere um contato")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna contato com o codigo do contato"),
            @ApiResponse(code = 500, message = "Erro não mapeado")


    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "Token de acesso", required = true, paramType = "header", dataTypeClass = String.class, example = "852468245"),
    })
    @PostMapping(value = "insereContato", consumes = "application/json", produces = "application/json")
    public ContatoResponse insereContato(@RequestBody ContatoRequest contatoRequest, @RequestHeader String token){
        Usuario logado = getUsuario(token);

        ModelMapper modelMapper = new ModelMapper();
        Contato contato = modelMapper.map(contatoRequest, Contato.class);


        contato.setUsuarioInclusao(logado.getNome());
        contato.setDataInclusao(new Date());
        contato.setVersaoRegistro(0);
        contato = repository.save(contato);

        return modelMapper.map(contato,ContatoResponse.class);
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
    @PostMapping("removeContato")
    public String removeContato(@RequestParam Integer contatoId, @RequestHeader String token){
        Usuario logado = getUsuario(token);

        Optional<Contato> optionalContato = repository.findById(contatoId);

        if(optionalContato.isEmpty()){
            throw new BasicException("contatoId nao encontrado");
        }

        Contato contato = optionalContato.get();


        contato = business.remove(contato,logado);
        repository.save(contato);

        return "Contato removido com sucesso!";

    }

    /**
     * Busca o usuario por token
     * lanca um AutenticacaoException caso nao encontre o usuario
     *
     * @param token token do usuario
     * @return Usuario que possui o token
     */
    private Usuario getUsuario(String token) {
        Usuario logado = usuarioRepository.findByToken(token);
        if(logado == null){
            throw new AutenticacaoException();
        }
        return logado;
    }



}
