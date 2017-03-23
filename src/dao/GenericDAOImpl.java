package dao;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Android_61 on 2017/3/23.
 */

@SuppressWarnings("all")
public class GenericDAOImpl <T,ID extends Serializable> extends HibernateDaoSupport implements GenericDAO<T,ID >{
    @Override
    public void save(T obj) {
        super.getHibernateTemplate().save(obj);
    }

    @Override
    public void delete(T obj) {
        super.getHibernateTemplate().delete(obj);
    }

    @Override
    public void update(T obj) {
        super.getHibernateTemplate().update(obj);
    }

    @Override
    public T findById(Class<T> domainClass, ID id) {
        return super.getHibernateTemplate().get(domainClass,id);
    }

    @Override
    public List<T> findAll(Class<T> domainClass) {
        return super.getHibernateTemplate().loadAll(domainClass);
    }

    @Override
    public List<T> findByNamedQuery(String queryName, Object... values) {
        return super.getHibernateTemplate().findByNamedQuery(queryName,values);
    }

    @Override
    public List<T> findByCriteria(DetachedCriteria criteria) {
        return super.getHibernateTemplate().findByCriteria(criteria);
    }
}
