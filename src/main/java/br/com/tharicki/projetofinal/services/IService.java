package br.com.tharicki.projetofinal.services;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Tharicki on 14/11/2015.
 */
public interface IService<T, ID extends Serializable> {

    T getById(ID id);

    void persist(T entity);
    void update(T entity);
    void delete(T entity);
    void refesh(T entity);

    List<T> findAllObjects();
}
