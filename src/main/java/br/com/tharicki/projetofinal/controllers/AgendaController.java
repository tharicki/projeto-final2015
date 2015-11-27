package br.com.tharicki.projetofinal.controllers;

import br.com.tharicki.projetofinal.models.Agenda;
import br.com.tharicki.projetofinal.services.IAgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/agendas",method = RequestMethod.POST)
    public Agenda save(@RequestBody Agenda agenda){
        try {
            agendaService.persist(agenda);
        } catch (Exception e){
            e.printStackTrace();
            agendaService.update(agenda);
        }
        return agenda;
    }

    @RequestMapping(value = "/agendas/{id}",method = RequestMethod.POST)
    public Agenda update(@PathVariable("id") Integer id, @RequestBody Agenda agenda){
        try {
            agendaService.persist(agenda);
        } catch (Exception e){
            agendaService.update(agenda);
        }
        return agenda;
    }

//    @RequestMapping(value = "/agendas", method = RequestMethod.DELETE)
//    public Agenda delete(@RequestBody Agenda agenda){
//        try {
//            agendaService.delete(agenda);
//        } catch (Exception e){
//            return agenda;
//        }
//        return agenda;
//    }

}
