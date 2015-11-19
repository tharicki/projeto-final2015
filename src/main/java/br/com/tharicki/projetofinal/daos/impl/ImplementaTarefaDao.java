package br.com.tharicki.projetofinal.daos.impl;

import br.com.tharicki.projetofinal.daos.IAgendaDao;
import br.com.tharicki.projetofinal.daos.ITarefaDao;
import br.com.tharicki.projetofinal.models.Agenda;
import br.com.tharicki.projetofinal.models.Tarefa;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Tharicki on 18/11/2015.
 */
@Repository
public class ImplementaTarefaDao extends ImplementaDao<Tarefa,Serializable> implements ITarefaDao {
}
