package br.com.tharicki.projetofinal.controllers;

import br.com.tharicki.projetofinal.models.Saida;
import br.com.tharicki.projetofinal.models.Tarefa;
import br.com.tharicki.projetofinal.services.ISaidaService;
import br.com.tharicki.projetofinal.services.ITarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tharicki on 18/11/2015.
 */
@RestController
public class TarefaController {

    @Autowired
    private ITarefaService tarefaService;

    @RequestMapping("/tarefas")
    public List<Tarefa> findAllTarefas(){
        return tarefaService.findAllObjects();
    }

    @RequestMapping(value = "/tarefas",method = RequestMethod.POST)
    public Tarefa save(@RequestBody Tarefa tarefa){
        try {
            tarefaService.persist(tarefa);
        } catch (Exception e){
            e.printStackTrace();
            tarefaService.update(tarefa);
        }
        return tarefa;
    }

    @RequestMapping(value = "/tarefas/{id}",method = RequestMethod.POST)
    public Tarefa update(@PathVariable("id") Integer id, @RequestBody Tarefa tarefa){
        try {
            tarefaService.persist(tarefa);
        } catch (Exception e){
            tarefaService.update(tarefa);
        }
        return tarefa;
    }

    @RequestMapping(value = "/tarefas", method = RequestMethod.DELETE)
    public Tarefa delete(@RequestBody Tarefa tarefa){
        try {
            tarefaService.delete(tarefa);
        } catch (Exception e){
            return tarefa;
        }
        return tarefa;
    }

}
