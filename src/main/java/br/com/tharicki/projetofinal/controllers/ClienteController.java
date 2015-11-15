package br.com.tharicki.projetofinal.controllers;

import br.com.tharicki.projetofinal.models.Cliente;
import br.com.tharicki.projetofinal.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
