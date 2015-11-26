package br.com.tharicki.projetofinal.controllers;

import br.com.tharicki.projetofinal.models.Agenda;
import br.com.tharicki.projetofinal.models.Saida;
import br.com.tharicki.projetofinal.services.IAgendaService;
import br.com.tharicki.projetofinal.services.ISaidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/fornecedores",method = RequestMethod.POST)
    public Saida save(@RequestBody Saida saida){
        try {
            saidaService.persist(saida);
        } catch (Exception e){
            e.printStackTrace();
            saidaService.update(saida);
        }
        return saida;
    }

    @RequestMapping(value = "/fornecedores/{id}",method = RequestMethod.POST)
    public Saida update(@PathVariable("id") Integer id, @RequestBody Saida saida){
        try {
            saidaService.persist(saida);
        } catch (Exception e){
            saidaService.update(saida);
        }
        return saida;
    }

    @RequestMapping(value = "/fornecedores", method = RequestMethod.DELETE)
    public Saida delete(@RequestBody Saida saida){
        try {
            saidaService.delete(saida);
        } catch (Exception e){
            return saida;
        }
        return saida;
    }

}
