package br.com.tharicki.projetofinal.services.impl;

import br.com.tharicki.projetofinal.daos.IAgendaDao;
import br.com.tharicki.projetofinal.daos.ISaidaDao;
import br.com.tharicki.projetofinal.models.Agenda;
import br.com.tharicki.projetofinal.models.Saida;
import br.com.tharicki.projetofinal.services.IAgendaService;
import br.com.tharicki.projetofinal.services.ISaidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Tharicki on 18/11/2015.
 */
@Service
public class ImplementaSaidaService extends ImplementaService<Saida> implements ISaidaService{

    @Autowired
    private ISaidaDao saidaDao;

    @PostConstruct
    public void init(){
        super.setDao(saidaDao);
    }

}
