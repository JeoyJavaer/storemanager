package dao;

import org.hibernate.criterion.DetachedCriteria;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Android_61 on 2017/3/23.
 */
public interface GenericDAO<T, ID extends Serializable> {

    public void save(T obj);


    public void delete(T obj);


    public void update(T obj);

    public T findById(Class<T> domainClass, ID id);


    public List<T> findAll(Class<T> domainClass);


    public List<T>findByNamedQuery(String queryName,Object ...values);


    public List<T> findByCriteria(DetachedCriteria criteria);

}
