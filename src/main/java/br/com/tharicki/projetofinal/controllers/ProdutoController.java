package br.com.tharicki.projetofinal.controllers;

import br.com.tharicki.projetofinal.models.Agenda;
import br.com.tharicki.projetofinal.models.Produto;
import br.com.tharicki.projetofinal.services.IAgendaService;
import br.com.tharicki.projetofinal.services.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tharicki on 18/11/2015.
 */
@RestController
public class ProdutoController {

    @Autowired
    private IProdutoService produtoService;

    @RequestMapping("/produtos")
    public List<Produto> findAllLProdutos(){
        return produtoService.findAllObjects();
    }

    @RequestMapping(value = "/fornecedores",method = RequestMethod.POST)
    public Produto save(@RequestBody Produto produto){
        try {
            produtoService.persist(produto);
        } catch (Exception e){
            e.printStackTrace();
            produtoService.update(produto);
        }
        return produto;
    }

    @RequestMapping(value = "/fornecedores/{id}",method = RequestMethod.POST)
    public Produto update(@PathVariable("id") Integer id, @RequestBody Produto produto){
        try {
            produtoService.persist(produto);
        } catch (Exception e){
            produtoService.update(produto);
        }
        return produto;
    }

    @RequestMapping(value = "/fornecedores", method = RequestMethod.DELETE)
    public Produto delete(@RequestBody Produto produto){
        try {
            produtoService.delete(produto);
        } catch (Exception e){
            return produto;
        }
        return produto;
    }

}
