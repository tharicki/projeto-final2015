package br.com.tharicki.projetofinal.services.impl;

import br.com.tharicki.projetofinal.daos.IFornecedorDao;
import br.com.tharicki.projetofinal.models.Fornecedor;
import br.com.tharicki.projetofinal.services.IFornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Tharicki on 16/11/2015.
 */
@Service
public class ImplementaFornecedorService extends ImplementaService<Fornecedor> implements IFornecedorService {

    @Autowired
    private IFornecedorDao fornecedorDao;

    @PostConstruct
    public void init() {
        super.setDao(fornecedorDao);
    }
}
