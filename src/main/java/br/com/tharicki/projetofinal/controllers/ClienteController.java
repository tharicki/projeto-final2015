package br.com.tharicki.projetofinal.controllers;

import br.com.tharicki.projetofinal.models.Cliente;
import br.com.tharicki.projetofinal.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tharicki on 15/11/2015.
 */
@RestController
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @RequestMapping("/clientes")
    public List<Cliente> findAllClientes(){
        return clienteService.findAllObjects();
    }

    @RequestMapping(value = "/clientes",method = RequestMethod.POST)
    public Cliente save(@RequestBody Cliente cliente){
        try {
            clienteService.persist(cliente);
        } catch (Exception e){
            e.printStackTrace();
            clienteService.update(cliente);
        }
        return cliente;
    }

    @RequestMapping(value = "/clientes/{id}",method = RequestMethod.POST)
    public Cliente update(@PathVariable("id") Integer id, @RequestBody Cliente cliente){
        try {
            clienteService.persist(cliente);
        } catch (Exception e){
            clienteService.update(cliente);
        }
        return cliente;
    }

}
