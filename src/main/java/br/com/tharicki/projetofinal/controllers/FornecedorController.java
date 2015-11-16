package br.com.tharicki.projetofinal.controllers;

import br.com.tharicki.projetofinal.models.Fornecedor;
import br.com.tharicki.projetofinal.services.IFornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Tharicki on 16/11/2015.
 */
@RestController
public class FornecedorController {

    @Autowired
    private IFornecedorService fornecedorService;

    @RequestMapping("/fornecedores")
    public List<Fornecedor> findAllFornecedores(){
        return fornecedorService.findAllObjects();
    }
}
