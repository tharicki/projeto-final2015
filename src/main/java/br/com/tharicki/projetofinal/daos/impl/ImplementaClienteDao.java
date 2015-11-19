package br.com.tharicki.projetofinal.daos.impl;

import br.com.tharicki.projetofinal.daos.IClienteDao;
import br.com.tharicki.projetofinal.models.Cliente;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Tharicki on 14/11/2015.
 */
@Repository
public class ImplementaClienteDao extends ImplementaDao<Cliente, Serializable> implements IClienteDao {
}
