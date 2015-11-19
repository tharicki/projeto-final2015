package br.com.tharicki.projetofinal.services.impl;

import br.com.tharicki.projetofinal.daos.IAgendaDao;
import br.com.tharicki.projetofinal.models.Agenda;
import br.com.tharicki.projetofinal.services.IAgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Tharicki on 18/11/2015.
 */
@Service
public class ImplementaAgendaService extends ImplementaService<Agenda> implements IAgendaService{

    @Autowired
    private IAgendaDao agendaDao;

    @PostConstruct
    public void init(){
        super.setDao(agendaDao);
    }

}
