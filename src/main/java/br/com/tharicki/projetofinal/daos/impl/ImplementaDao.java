package br.com.tharicki.projetofinal.daos.impl;

import br.com.tharicki.projetofinal.daos.IDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Tharicki on 14/11/2015.
 */
@Repository
public abstract class ImplementaDao<T, ID extends Serializable> implements IDao<T, ID> {

    private Class<T> persistentClass;

    @PersistenceContext(name = "darkconnection")
    protected EntityManager entityManager;
    Root<T> root;

    @SuppressWarnings("rawtypes")
    TypedQuery q;

    @SuppressWarnings("unchecked")
    public ImplementaDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Transactional()
    public T getById(ID id) {
        return entityManager.find(persistentClass, id);
    }

    @Transactional
    public void persist(T entity) {
        entityManager.persist(entity);
    }

    @Transactional
    public void update(T entity) {
        entityManager.merge(entity);
    }

    @Transactional
    public void delete(T entity) {
        Object o = entityManager.merge(entity);
        entityManager.remove(o);
    }

    @Transactional
    public void refresh(T entity) {
        entityManager.refresh(entity);
    }

    public Class<T> getPersistentTClass() {
        return persistentClass;
    }

    @Transactional()
    @SuppressWarnings("unchecked")
    public List<T> getList() {
        return entityManager.createQuery(
                "Select t from " + persistentClass.getSimpleName() + " t")
                .getResultList();
    }
}
