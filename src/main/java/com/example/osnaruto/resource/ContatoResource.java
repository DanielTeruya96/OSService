package com.example.osnaruto.resource;

import com.example.osnaruto.exception.AutenticacaoException;
import com.example.osnaruto.exception.BasicException;
import com.example.osnaruto.model.Contato;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.BasicBusiness;
import com.example.osnaruto.repository.ContatoRepository;
import com.example.osnaruto.repository.UsuarioRepository;
import com.example.osnaruto.response.ContatoResponse;
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

    private BasicBusiness<Contato> business = new BasicBusiness<>();

    /**
     * Busca todos os contatos
     * @return lista de contatos
     */
    @GetMapping("/consultar")
    public List<ContatoResponse> contatos(){
        List<ContatoResponse> contatos = new ArrayList<>();
        for(Contato item: repository.findAll()){

            ModelMapper modelMapper = new ModelMapper();
            ContatoResponse response =  modelMapper.map(item, ContatoResponse .class);
            contatos.add(response);
        }
        return contatos;
    }

    /**
     * {
     *     "nome":"Joaquim",
     *     "email":"mail.mail.com"
     * }
     * @param contato { "nome":"Joaquim", "email":"mail.mail.com" }
     * @return ok
     */
    @PostMapping("insereContato")
    public Contato insereContato(@RequestBody Contato contato, @RequestHeader String token){
        Usuario logado = getUsuario(token);


        contato.setUsuarioInclusao(logado.getNome());
        contato.setDataInclusao(new Date());
        contato.setVersaoRegistro(0);
        contato = repository.save(contato);
        return contato;
    }


    /**
     * Remocao de usuario
     *
     * @param contatoId Integer com o contato
     * @param token Header token do usuario
     * @return
     */
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
