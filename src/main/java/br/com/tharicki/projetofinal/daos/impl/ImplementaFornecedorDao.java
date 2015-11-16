package br.com.tharicki.projetofinal.daos.impl;

import br.com.tharicki.projetofinal.daos.IFornecedorDao;
import br.com.tharicki.projetofinal.models.Fornecedor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Tharicki on 16/11/2015.
 */
@Repository
public class ImplementaFornecedorDao extends ImplementaDao<Fornecedor,Serializable> implements IFornecedorDao{

}
