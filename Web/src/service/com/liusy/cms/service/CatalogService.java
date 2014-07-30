package com.liusy.cms.service;

import java.io.Serializable;
import java.util.Collection;

import com.liusy.cms.model.Catalog;
import com.liusy.core.exception.ServiceException;

public interface CatalogService {
	/**
	 * 用PK查找对象
	 */
	public Catalog findCatalog(Serializable id) throws ServiceException;

	/**
	 * 用Unique Key查找对象
	 */
	public Catalog findCatalogByUK(String ukField, Object ukValue) throws ServiceException;

	/**
	 * 新增对象
	 * 
	 * @param
	 */
	public void createCatalog(Catalog sysCodeSet) throws ServiceException;

	/**
	 * 更新对象
	 * 
	 * @param
	 */
	public void updateCatalog(Catalog sysCodeSet) throws ServiceException;

	/**
	 * 删除对象
	 * 
	 * @param clazz
	 *           model class to lookup
	 * @param id
	 *           the identifier (primary key) of the class
	 */
	public void removeCatalog(Serializable id) throws ServiceException;

	/**
	 * 批删除对象
	 * 
	 * @param id
	 *           the identifier (primary key) of the class
	 */
	public void removeCatalogs(Serializable[] ids) throws ServiceException;

	/**
	 * @param fieldName
	 *           字段名
	 * @param fieldValue
	 *           字段值,这里必须传入字段相应的类型,如Long不能用String
	 */
	public void removeCatalogByField(String fieldName, Object fieldValue) throws ServiceException;

	/**
	 * @return 返回全部表对象 Collection<Catalog>
	 * @throws Exception
	 */
	public Collection<Catalog> findAllCatalog() throws ServiceException;

	/**
	 * @param fieldName
	 *           字段名
	 * @param fieldValue
	 *           字段值,这里必须传入字段相应的类型,如Long不能用String
	 */
	public Collection<Catalog> findCatalogByField(String fieldName, Object fieldValue) throws ServiceException;

	/**
	 * 计算记录数
	 * 
	 * @param fieldName
	 *           字段名
	 * @param fieldValue
	 *           字段值,这里必须传入字段相应的类型,如Long不能用String
	 * @return
	 */
	public int countCatalogByField(String fieldName, Object fieldValue) throws ServiceException;
	/**
	 * 分页动态查询
	 * 
	 * @param queryObject
	 *           (queryObject.getResult()<Map(fieldName, fieldValue)>)
	 * @return
	 */
	// public PagerObject queryCatalog(QueryString queryString,PagerObject
	// queryObject) throws ServiceException ;

}
