package br.com.tharicki.projetofinal.controllers;

import br.com.tharicki.projetofinal.models.Agenda;
import br.com.tharicki.projetofinal.services.IAgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Tharicki on 18/11/2015.
 */
@RestController
public class AgendaController {

    @Autowired
    private IAgendaService agendaService;

    @RequestMapping("/agendas")
    public List<Agenda> findAllLAgendas(){
        return agendaService.findAllObjects();
    }

}
