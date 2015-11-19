package br.com.tharicki.projetofinal.services.impl;

import br.com.tharicki.projetofinal.daos.IAgendaDao;
import br.com.tharicki.projetofinal.daos.IProdutoDao;
import br.com.tharicki.projetofinal.models.Agenda;
import br.com.tharicki.projetofinal.models.Produto;
import br.com.tharicki.projetofinal.services.IAgendaService;
import br.com.tharicki.projetofinal.services.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Tharicki on 18/11/2015.
 */
@Service
public class ImplementaProdutoService extends ImplementaService<Produto> implements IProdutoService{

    @Autowired
    private IProdutoDao produtoDao;

    @PostConstruct
    public void init(){
        super.setDao(produtoDao);
    }

}
