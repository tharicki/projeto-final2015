package br.com.tharicki.projetofinal.daos;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Tharicki on 14/11/2015.
 */
public interface IDao<T, ID extends Serializable> {

    T getById(ID id);

    void persist(T entity);
    void update(T entity);
    void delete(T entity);
    void refresh(T entity);

    List<T> getList();

}
