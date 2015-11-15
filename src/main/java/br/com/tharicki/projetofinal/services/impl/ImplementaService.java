package br.com.tharicki.projetofinal.services.impl;

import br.com.tharicki.projetofinal.daos.IDao;
import br.com.tharicki.projetofinal.services.IService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Tharicki on 14/11/2015.
 */
@Service
public class ImplementaService<T extends Object> implements IService<T, Serializable> {

    private IDao<T, Serializable> dao;

    @Override
    public T getById(Serializable id) {
        return dao.getById(id);
    }

    @Override
    public void persist(T entity) {
        dao.persist(entity);
    }

    @Override
    public void update(T entity) {
        dao.update(entity);
    }

    @Override
    public void delete(T entity) {
        dao.delete(entity);
    }

    @Override
    public void refesh(T entity) {
        dao.refesh(entity);
    }

    @Override
    public List<T> findAllObjects() {
        return dao.getList();
    }

    public IDao<T, Serializable> getDao() {
        return dao;
    }

    public void setDao(IDao<T, Serializable> dao) {
        this.dao = dao;
    }
}
