package br.com.tharicki.projetofinal.services.impl;

import br.com.tharicki.projetofinal.daos.IAgendaDao;
import br.com.tharicki.projetofinal.daos.ITarefaDao;
import br.com.tharicki.projetofinal.models.Agenda;
import br.com.tharicki.projetofinal.models.Tarefa;
import br.com.tharicki.projetofinal.services.IAgendaService;
import br.com.tharicki.projetofinal.services.ITarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Tharicki on 18/11/2015.
 */
@Service
public class ImplementaTarefaService extends ImplementaService<Tarefa> implements ITarefaService{

    @Autowired
    private ITarefaDao tarefaDao;

    @PostConstruct
    public void init(){
        super.setDao(tarefaDao);
    }

}
