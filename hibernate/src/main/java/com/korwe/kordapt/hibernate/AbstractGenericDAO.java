package com.korwe.kordapt.hibernate;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:nithia.govender@korwe.com>Nithia Govender</a>
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public abstract class AbstractGenericDAO<E, PK extends Serializable> implements GenericDAO<E, PK>{

    private Class<E> entityClass;
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    protected AbstractGenericDAO() {
        entityClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public E save(E e) {
        PK key = (PK) getSession().save(e);
        getSession().flush();
        return e;
    }

    @Override
    public E findById(PK id) {
        return (E)getSession().get(getEntityClass(), id);
    }

    @Override
    public List<E> findAll() {
        return createDetachedCriteria().getExecutableCriteria(getSession()).list();
    }

    @Override
    public List<PK> findAllIds() {
        Criteria criteria = getSession().createCriteria(getEntityClass());
        criteria.setProjection(Projections.distinct(Projections.id()));
        return criteria.list();
    }

    @Override
    public List<E> findAllByProperty(String propertyName, Object value) {
        DetachedCriteria criteria = createDetachedCriteria();
        criteria.add(Restrictions.eq(propertyName, value));
        return criteria.getExecutableCriteria(getSession()).list();
    }

    @Override
    public E update(E obj) {
        getSession().update(obj);
        getSession().flush();
        return obj;
    }

    @Override
    public E saveOrUpdate(E obj) {
        getSession().saveOrUpdate(obj);
        getSession().flush();
        return obj;
    }

    @Override
    public E merge(E obj) {
        obj = (E)getSession().merge(obj);
        getSession().flush();
        return obj;
    }

    @Override
    public void delete(E obj) {
        getSession().delete(obj);
        getSession().flush();
    }

    @Override
    public Class<E> getEntityClass() {
       return entityClass;
    }

    @Override
    public List<E> findAllByIdList(List<PK> ids) {
        if (ids == null) return null;
        if (ids.size() == 0) return new ArrayList<E>(0);

        Criteria criteria =  getSession().createCriteria(getEntityClass());
        criteria.add(Restrictions.in("id", ids));
        return (List<E>) criteria.list();
    }

    @Override
    public List<E> findByProperties(E object) {
        Example example = Example.create(object);
        example.enableLike(MatchMode.ANYWHERE);
        example.ignoreCase();
        DetachedCriteria dc = DetachedCriteria.forClass(getEntityClass()).add(example);
        return dc.getExecutableCriteria(getSession()).list();
    }

    protected DetachedCriteria createDetachedCriteria() {
        return DetachedCriteria.forClass(getEntityClass());
    }


    public static String toVariableName(Class klazz) {
        String className= klazz.getSimpleName();
        String retVal = "";
        if (className.length()==0)
            return retVal;
        if (className.length() > 0)
            retVal += Character.toLowerCase(className.charAt(0));
        if (className.length() > 1)
            retVal += className.substring(1);

        return retVal;
    }

    public List<E> findByParentId(Class<?> parentClass, PK parentId) {
        Query query = getSession().createQuery("from "+getEntityClass().getName()+" e where e."+toVariableName(parentClass)+".id  = :parentId");
        query.setParameter("parentId", parentId);
        return (List<E>) query.list();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
