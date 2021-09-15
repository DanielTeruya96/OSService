package com.example.osnaruto.resource;

import com.example.osnaruto.exception.BasicException;
import com.example.osnaruto.model.Cliente;
import com.example.osnaruto.model.ClienteRepository;
import com.example.osnaruto.model.Contato;
import com.example.osnaruto.model.Usuario;
import com.example.osnaruto.repository.BasicBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cliente")
public class ClienteResource extends BasicResource {

    @Autowired
    private ClienteRepository clienteRepository;

    private BasicBusiness<Cliente> business = new BasicBusiness<>();

    /**
     * Busca todos os clientes
     * @return
     */
    @GetMapping("/consultar")
    public List<Cliente> consultar(){
        List<Cliente> clientes = new ArrayList<>();
        for(Cliente cliente: clienteRepository.findAll()){
            clientes.add(cliente);
        }

        return clientes;

    }


    /**
     * Metodo para inserir cliente
     *
     * @param cliente { "razaoSocial":"a razao", "cpfPcpj":"12345678", "nomeFantasia":"Fantasma da ope", "endereco":algum lugar desse mundo"}
     * @param token token de acesso ao serviço
     * @return cliente json com o id
     */
    @PostMapping("/insereCliente")
    public Cliente insereCliente(@RequestBody Cliente cliente, @RequestHeader String token){
        Usuario logado = getUsuario(token);

        Cliente c = business.inserir(cliente,logado);
        c = clienteRepository.save(c);
        return c;
    }


    /**
     * Metodo para remover o cliente
     *
     * @param clienteId id do cliente que deseja remover
     * @param token token de acesso ao serviço
     * @return mensagem de confirmação
     */
    @PostMapping("/removerCliente")
    public String removerCliente(@RequestParam Integer clienteId, @RequestHeader String token){
        Usuario logado = getUsuario(token);

        Optional<Cliente> clienteOptional =  clienteRepository.findById(clienteId);

        if(clienteOptional.isEmpty()){
            throw new BasicException("clienteId nao encontrado");
        }

        Cliente cliente = clienteOptional.get();

        cliente = business.remove(cliente,logado);

        clienteRepository.save(cliente);

        return "Cliente removido com sucesso!";



    }


}
