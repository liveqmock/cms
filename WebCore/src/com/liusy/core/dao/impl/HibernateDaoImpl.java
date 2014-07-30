package com.liusy.core.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.liusy.core.dao.HibernateDao;
import com.liusy.core.exception.DAOException;

/**
 * <p>
 * Title: 数据管理中心
 * </p>
 * 
 * <p>
 * Description:Hibernate DAO访问基类
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2009-2011
 * </p>
 * 
 * <p>
 * Company:
 * </p>
 * 
 * @author liusy
 * @version 1.2
 */
public abstract class HibernateDaoImpl<T> extends HibernateDaoSupport implements HibernateDao<T> {

   private Class<T> clazz;

   public HibernateDaoImpl() {
      clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#findByHql(java.lang.String)
    */
   public List<T> findByHql(String hql) throws DAOException {
      try {
         return (List<T>) getHibernateTemplate().find(hql);
      } catch (Exception e) {
         throw new DAOException(e);
      }
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#count()
    */
   public long count() throws DAOException {
      return 0;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#get(java.io.Serializable)
    */
   public T get(Serializable key) throws DAOException {
      try {
         return (T) getHibernateTemplate().get(clazz, key);
      } catch (HibernateException e) {
         throw new DAOException(e);
      }

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#load(java.io.Serializable)
    */
   public T load(Serializable key) throws DAOException {
      try {
         return (T) getHibernateTemplate().load(clazz, key);
      } catch (HibernateException e) {
         throw new DAOException(e);
      }
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#findAll()
    */
   public List<T> findAll() throws DAOException {
      try {
         return (List<T>) getHibernateTemplate().find("from " + getClassName());
      } catch (HibernateException e) {
         throw new DAOException(e);
      }
   }

   public List<T> findAll(Serializable[] keys) throws DAOException {
      List<T> list = new ArrayList<T>();
      for (Serializable id : keys) {
         T t=get(id);
         if(t!=null) list.add(t);
      }
      return list;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#findAll(java.lang.String, boolean)
    */
   public List<T> findAll(String orderName, boolean ascending) throws DAOException {
      if (orderName == null || "".equals(orderName)) throw new DAOException("orderName can not be null.");

      String[] orderNames = { orderName };
      boolean[] ascendings = { ascending };
      return findAllBase(orderNames, ascendings);
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#findAll(java.lang.String[],
    * boolean[])
    */
   public List<T> findAll(String[] orderNames, boolean[] ascendings) throws DAOException {
      if (orderNames == null) throw new DAOException("orderNames can not be null.");
      if (ascendings == null) throw new DAOException("ascendings can not be null.");
      return findAllBase(orderNames, ascendings);
   }

   private List<T> findAllBase(String[] orderNames, boolean[] ascendings) throws DAOException {
      String hql = "";
      StringBuffer buffer = new StringBuffer();
      buffer.append("from " + getClassName() + " a");

      if (orderNames != null && orderNames.length > 0) {
         if (orderNames.length != ascendings.length) {
            throw new DAOException("orderNames and ascendings count not equal.");
         }

         buffer.append(" order by");
         for (int i = 0; i < orderNames.length; i++) {
            if (orderNames[i] == null) {
               throw new DAOException("OrderName can not be null.");
            }
            else {
               buffer.append(" a." + orderNames[i] + (ascendings[i] ? " asc" : " desc"));
            }
            if (i != orderNames.length - 1) buffer.append(",");
         }
      }
      hql = buffer.toString();
      try {
         return (List<T>) getHibernateTemplate().find(hql);
      } catch (HibernateException e) {
         throw new DAOException(e);
      }
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#findByField(java.lang.String,
    * java.lang.Object)
    */
   public List<T> findByField(String fieldName, Object fieldValue) throws DAOException {
      if (fieldName == null || "".equals(fieldName)) throw new DAOException();

      String[] fieldNames = { fieldName };
      Object[] fieldValues = { fieldValue };
      return findByFieldsBase(fieldNames, fieldValues, null, null);
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#findByField(java.lang.String,
    * java.lang.Object, java.lang.String, boolean)
    */
   public List<T> findByField(String fieldName, Object fieldValue, String orderName, boolean ascending) throws DAOException {
      if (fieldName == null || "".equals(fieldName) || orderName == null || "".equals(orderName)) throw new DAOException();

      String[] fieldNames = { fieldName };
      Object[] fieldValues = { fieldValue };
      String[] orderNames = { orderName };
      boolean[] ascendings = { ascending };
      return findByFieldsBase(fieldNames, fieldValues, orderNames, ascendings);
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#findByFields(java.lang.String[],
    * java.lang.Object[], java.lang.String, boolean)
    */
   public List<T> findByFields(String[] fieldNames, Object[] fieldValues, String orderName, boolean ascending) throws DAOException {
      if (fieldNames == null || fieldNames.length == 0) throw new DAOException();
      if (fieldNames.length != fieldValues.length) throw new DAOException();

      if (orderName == null || "".equals(orderName)) throw new DAOException();

      String[] orderNames = { orderName };
      boolean[] ascendings = { ascending };
      return findByFieldsBase(fieldNames, fieldValues, orderNames, ascendings);
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#findByFields(java.lang.String[],
    * java.lang.Object[])
    */
   public List<T> findByFields(String[] fieldNames, Object[] fieldValues) throws DAOException {
      if (fieldNames == null || fieldNames.length == 0) throw new DAOException();
      if (fieldNames.length != fieldValues.length) throw new DAOException();

      return findByFieldsBase(fieldNames, fieldValues, null, null);
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#findByFields(java.lang.String[],
    * java.lang.Object[], java.lang.String[], boolean[])
    */
   public List<T> findByFields(String[] fieldNames, Object[] fieldValues, String[] orderNames, boolean[] ascendings) throws DAOException {
      if (fieldNames == null || fieldNames.length == 0) throw new DAOException();
      if (orderNames == null || orderNames.length == 0) throw new DAOException();
      if (orderNames.length != ascendings.length) throw new DAOException();

      return findByFieldsBase(fieldNames, fieldValues, orderNames, ascendings);
   }

   private List<T> findByFieldsBase(String[] fieldNames, Object[] fieldValues, String[] orderNames, boolean[] ascendings) throws DAOException {
      String hql = "";
      StringBuffer buffer = new StringBuffer();
      buffer.append("from " + getClassName() + " a");
      List<String> fns = new ArrayList<String>();
      List<Object> fvs = new ArrayList<Object>();

      if (fieldNames != null && fieldNames.length > 0) {
         if (fieldNames.length != fieldValues.length) {
            throw new DAOException("Parameter count error.");
         }
         for (int i = 0; i < fieldNames.length; i++) {
            if (fieldNames[i] == null) {
               throw new DAOException("Parameter name error.");
            }
            else {
               if (i == 0) buffer.append(" where");
               else buffer.append(" and");
               if (fieldValues[i] == null) {
                  buffer.append(" a." + fieldNames[i] + " is null");
               }
               else {
                  buffer.append(" a." + fieldNames[i] + "=:" + fieldNames[i]);
                  fns.add(fieldNames[i]);
                  fvs.add(fieldValues[i]);
               }
            }
         }
      }

      if (orderNames != null && orderNames.length > 0) {
         if (orderNames.length != ascendings.length) {
            throw new DAOException("OrderName count error.");
         }

         buffer.append(" order by");
         for (int i = 0; i < orderNames.length; i++) {
            if (orderNames[i] == null) {
               throw new DAOException("OrderName name error.");
            }
            else {
               buffer.append(" a." + orderNames[i] + (ascendings[i] ? " asc" : " desc"));
            }
            if (i != orderNames.length - 1) buffer.append(",");
         }
      }
      hql = buffer.toString();
      String[] ss = new String[fns.size()];
      fns.toArray(ss);
      Object[] vs = new Object[fvs.size()];
      fvs.toArray(vs);
      try {
         return (List<T>) getHibernateTemplate().findByNamedParam(hql, ss, vs);
      } catch (HibernateException e) {
         throw new DAOException(e);
      }
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#countByField(java.lang.String,
    * java.lang.Object)
    */
   public int countByField(String fieldName, Object fieldValue) throws DAOException {
      if (fieldName == null || "".equals(fieldName)) throw new DAOException();

      String[] fieldNames = { fieldName };
      Object[] fieldValues = { fieldValue };
      return countByFieldsBase(fieldNames, fieldValues);
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#countByFields(java.lang.String[],
    * java.lang.Object[])
    */
   public int countByFields(String[] fieldNames, Object[] fieldValues) throws DAOException {
      if (fieldNames == null || fieldNames.length == 0) throw new DAOException();
      return countByFieldsBase(fieldNames, fieldValues);
   }

   private int countByFieldsBase(String[] fieldNames, Object[] fieldValues) throws DAOException {
      String hql;
      StringBuffer buffer = new StringBuffer();
      buffer.append("select count(*) from " + getClassName() + " a");
      List<String> fns = new ArrayList<String>();
      List<Object> fvs = new ArrayList<Object>();

      if (fieldNames != null && fieldNames.length > 0) {
         if (fieldNames.length != fieldValues.length) {
            throw new DAOException("Parameter count error.");
         }
         for (int i = 0; i < fieldNames.length; i++) {
            if (fieldNames[i] == null) {
               throw new DAOException("Parameter name error.");
            }
            else {
               if (i == 0) buffer.append(" where");
               else buffer.append(" and");
               if (fieldValues[i] == null) {
                  buffer.append(" a." + fieldNames[i] + " is null");
               }
               else {
                  buffer.append(" a." + fieldNames[i] + "=:" + fieldNames[i]);
                  fns.add(fieldNames[i]);
                  fvs.add(fieldValues[i]);
               }
            }
         }
      }
      hql = buffer.toString();
      try {
         return ((Long) getHibernateTemplate().findByNamedParam(hql, (String[]) fns.toArray(), fvs.toArray()).listIterator().next()).intValue();
      } catch (HibernateException e) {
         throw new DAOException(e);
      }
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#save(T)
    */
   public Serializable save(final T entity) throws DAOException {
      try {
         return getHibernateTemplate().save(entity);
      } catch (HibernateException e) {
         throw new DAOException(e);
      }

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#saveOrUpdate(T)
    */
   public void saveOrUpdate(final T entity) throws DAOException {
      try {
         getHibernateTemplate().saveOrUpdate(entity);
      } catch (HibernateException e) {
         throw new DAOException(e);
      }

   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * com.liusy.core.dao.HibernateDao#saveOrUpdateAll(java.util.Collection)
    */
   public void saveOrUpdateAll(final Collection<T> entities) throws DAOException {
      try {
         getHibernateTemplate().saveOrUpdateAll(entities);
      } catch (HibernateException e) {
         throw new DAOException(e);
      }

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#update(T)
    */
   public void update(final T entity) throws DAOException {
      try {
         getHibernateTemplate().update(entity);
      } catch (HibernateException e) {
         throw new DAOException(e);
      }

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#deleteAll(java.util.Collection)
    */
   public void deleteAll(final Collection<T> entities) throws DAOException {
      try {
         getHibernateTemplate().deleteAll(entities);
      } catch (HibernateException e) {
         throw new DAOException(e);
      }

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#deleteAll()
    */

   public void deleteAll() throws DAOException {
      this.executeUpdate("delete from " + getClassName());
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#deleteAll(java.io.Serializable[])
    */
   public void deleteAll(Serializable[] keys) throws DAOException {
      for (Serializable id : keys) {
         delete(id);
      }
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#deleteByFields(java.lang.String[],
    * java.lang.Object[])
    */
   public void deleteByFields(String[] fieldNames, Object[] fieldValues) throws DAOException {
      List<T> removeList = findByFields(fieldNames, fieldValues);
      if (removeList != null && !removeList.isEmpty()) {
         getHibernateTemplate().deleteAll(removeList);
      }
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#deleteByField(java.lang.String,
    * java.lang.Object)
    */
   public void deleteByField(String fieldName, Object fieldValue) throws DAOException {
      List<T> removeList = findByField(fieldName, fieldValue);
      if (removeList != null && !removeList.isEmpty()) {
         getHibernateTemplate().deleteAll(removeList);
      }
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#delete(T)
    */
   public void delete(final T entity) throws DAOException {
      try {
         getHibernateTemplate().delete(entity);
      } catch (HibernateException e) {
         throw new DAOException(e);
      }
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#delete(java.io.Serializable)
    */
   public void delete(Serializable key) throws DAOException {
      try {
         getHibernateTemplate().delete(get(key));
      } catch (HibernateException e) {
         throw new DAOException(e);
      }
   }

   /**
    * Used by the base DAO classes but here for your modification Re-read the
    * state of the given instance from the underlying database. It is
    * inadvisable to use this to implement long-running sessions that span many
    * business tasks. This method is, however, useful in certain special
    * circumstances.
    */
   protected void refresh(T entity) throws DAOException {
      try {
         getHibernateTemplate().refresh(entity);
      } catch (HibernateException e) {
         throw new DAOException(e);
      }
   }

   protected boolean executeUpdate(final String hql) throws DAOException {
      HibernateCallback callback = new HibernateCallback() {
         public Object doInHibernate(Session session) throws HibernateException {
            try {
               Query query = session.createQuery(hql);
               query.executeUpdate();
               return new Boolean(true);
            } catch (Exception e) {
               e.printStackTrace();
               return new Boolean(false);
            }
         }
      };
      Boolean ret = false;
      try {
         ret = ((Boolean) getHibernateTemplate().execute(callback)).booleanValue();
         return ret;
      } catch (Exception e) {
         throw new DAOException(e);
      }
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.liusy.core.dao.HibernateDao#getClassName()
    */
   public String getClassName() {
      return clazz.getSimpleName();
   }
}
