package br.com.tharicki.projetofinal.daos.impl;

import br.com.tharicki.projetofinal.daos.IAgendaDao;
import br.com.tharicki.projetofinal.daos.IProdutoDao;
import br.com.tharicki.projetofinal.models.Agenda;
import br.com.tharicki.projetofinal.models.Produto;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Tharicki on 18/11/2015.
 */
@Repository
public class ImplementaProdutoDao extends ImplementaDao<Produto,Serializable> implements IProdutoDao {
}
