package br.com.tharicki.projetofinal.services.impl;

import br.com.tharicki.projetofinal.daos.IClienteDao;
import br.com.tharicki.projetofinal.models.Cliente;
import br.com.tharicki.projetofinal.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by Tharicki on 14/11/2015.
 */
public class ImplementaClienteService extends ImplementaService<Cliente> implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;

    @PostConstruct
    public void init(){
        super.setDao(clienteDao);
    }

}
