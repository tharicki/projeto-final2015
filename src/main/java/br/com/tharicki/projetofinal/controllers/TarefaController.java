package br.com.tharicki.projetofinal.controllers;

import br.com.tharicki.projetofinal.models.Saida;
import br.com.tharicki.projetofinal.models.Tarefa;
import br.com.tharicki.projetofinal.services.ISaidaService;
import br.com.tharicki.projetofinal.services.ITarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
