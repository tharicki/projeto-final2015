package br.com.tharicki.projetofinal.controllers;

import br.com.tharicki.projetofinal.models.Fornecedor;
import br.com.tharicki.projetofinal.services.IFornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tharicki on 16/11/2015.
 */
@RestController
public class FornecedorController {

    @Autowired
    private IFornecedorService fornecedorService;

    @RequestMapping("/fornecedores")
    public List<Fornecedor> findAllFornecedores() {
        return fornecedorService.findAllObjects();
    }

    @RequestMapping(value = "/fornecedores",method = RequestMethod.POST)
    public Fornecedor save(@RequestBody Fornecedor fornecedor){
        try {
            fornecedorService.persist(fornecedor);
        } catch (Exception e){
            e.printStackTrace();
            fornecedorService.update(fornecedor);
        }
        return fornecedor;
    }

    @RequestMapping(value = "/fornecedores/{id}",method = RequestMethod.POST)
    public Fornecedor update(@PathVariable("id") Integer id, @RequestBody Fornecedor fornecedor){
        try {
            fornecedorService.persist(fornecedor);
        } catch (Exception e){
            fornecedorService.update(fornecedor);
        }
        return fornecedor;
    }

    @RequestMapping(value = "/fornecedores", method = RequestMethod.DELETE)
    public Fornecedor delete(@RequestBody Fornecedor fornecedor){
        try {
            fornecedorService.delete(fornecedor);
        } catch (Exception e){
            return fornecedor;
        }
        return fornecedor;
    }
}
