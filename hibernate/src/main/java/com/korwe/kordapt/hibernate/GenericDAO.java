package com.korwe.kordapt.hibernate;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href="mailto:nithia.govender@korwe.com">Nithia Govender</a>
 */
public interface GenericDAO<E, PK extends Serializable> {

    E save(E newInstance);
    E update(E obj);
    E saveOrUpdate(E obj);
    void delete(E obj);
    E findById(PK id);
    List<E> findAll();
    public List<PK> findAllIds();

    @SuppressWarnings("unchecked")
    List<E> findAllByProperty(String propertyName, Object value);

    E merge(E obj);

    Class<E> getEntityClass();

    @SuppressWarnings("unchecked")
    List<E> findAllByIdList(List<PK> ids);

    @SuppressWarnings("unchecked")
    List<E> findByProperties(E object);
}
