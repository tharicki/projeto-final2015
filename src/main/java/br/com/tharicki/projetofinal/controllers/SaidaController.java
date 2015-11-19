package br.com.tharicki.projetofinal.controllers;

import br.com.tharicki.projetofinal.models.Agenda;
import br.com.tharicki.projetofinal.models.Saida;
import br.com.tharicki.projetofinal.services.IAgendaService;
import br.com.tharicki.projetofinal.services.ISaidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Tharicki on 18/11/2015.
 */
@RestController
public class SaidaController {

    @Autowired
    private ISaidaService saidaService;

    @RequestMapping("/saidas")
    public List<Saida> findAllSaidas(){
        return saidaService.findAllObjects();
    }

}
