package com.liusy.core.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.liusy.core.exception.DAOException;

/**
 * <p> Title:DAO访问接口 </p>
 * 
 * <p> Description:通用的DAO访问接口，可以作为其他表访问的基类。 </p>
 * 
 * <p> Copyright: Copyright (c) 2009-2011 </p>
 * 
 * <p> Company:  </p>
 * 
 * @author liusy
 * @version 1.2
 */
public interface HibernateDao<T> {

   public long count() throws DAOException;

   public T get(Serializable key) throws DAOException;

   public T load(Serializable key) throws DAOException;

   public Serializable save(final T entity) throws DAOException;

   public void saveOrUpdate(final T entity) throws DAOException;

   public void saveOrUpdateAll(final Collection<T> entities) throws DAOException;

   public void update(final T entity) throws DAOException;

   public void delete(final T entity) throws DAOException;

   public void delete(Serializable key) throws DAOException;

   public void deleteAll(final Collection<T> entities) throws DAOException;

   public void deleteAll() throws DAOException;

   public void deleteAll(Serializable[] keys) throws DAOException;

   public void deleteByFields(String[] fieldNames, Object[] fieldValues) throws DAOException;

   public void deleteByField(String fieldName, Object fieldValue) throws DAOException;

   public List<T> findAll() throws DAOException;

   public List<T> findAll(Serializable[] keys) throws DAOException;

   public List<T> findAll(String orderName, boolean ascending) throws DAOException;

   public List<T> findAll(String[] orderNames, boolean[] ascendings) throws DAOException;

   public List<T> findByField(String fieldName, Object fieldValue) throws DAOException;

   public List<T> findByField(String fieldName, Object fieldValue, String orderName, boolean ascending) throws DAOException;

   public List<T> findByFields(String[] fieldNames, Object[] fieldValues, String orderName, boolean ascending) throws DAOException;

   public List<T> findByFields(String[] fieldNames, Object[] fieldValues) throws DAOException;

   public List<T> findByFields(String[] fieldNames, Object[] fieldValues, String[] orderNames, boolean[] ascendings) throws DAOException;

   public int countByField(String fieldName, Object fieldValue) throws DAOException;

   public int countByFields(String[] fieldNames, Object[] fieldValues) throws DAOException;

   public List<T> findByHql(String hql) throws DAOException;

   public String getClassName();
}