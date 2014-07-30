package com.liusy.cms.service.impl;

import java.io.Serializable;
import java.util.Collection;

import com.liusy.cms.dao.CatalogDao;
import com.liusy.cms.dao.CatalogItemDao;
import com.liusy.cms.model.Catalog;
import com.liusy.cms.service.CatalogService;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.ServiceException;

public class CatalogServiceImpl implements CatalogService {
	private CatalogDao	catalogDao;

	private CatalogItemDao	catalogItemDao;

	/**
	 * 注入DAO
	 * 
	 * @see com.CatalogService.core.service.CatalogService#setCatalogDao(CatalogDao
	 *      catalogDao)
	 */
	public void setCatalogDao(CatalogDao catalogDao) {
		this.catalogDao = catalogDao;
	}

	/**
	 * 用PK查找对象
	 * 
	 * @see com.CatalogService.core.service.CatalogService#findCatalog(Serializable
	 *      id)
	 */
	public Catalog findCatalog(Serializable id) throws ServiceException {
		try {
			return catalogDao.get(id);
		}
		catch (Exception e) {

			throw new ServiceException(e);
		}
	}

	/**
	 * 用Unique Key查找对象
	 */
	public Catalog findCatalogByUK(String ukField, Object ukValue) throws ServiceException {
		try {
			Collection<Catalog> c = findCatalogByField(ukField, ukValue);
			if (c != null && !c.isEmpty()) { return (Catalog) c.iterator().next(); }
			return null;
		}
		catch (Exception e) {

			throw new ServiceException(e);
		}
	}

	/**
	 * 新增对象
	 * 
	 * @see com.CatalogService.core.service.CatalogService#createCatalog(Catalog
	 *      sysCodeSet)
	 * @param
	 */
	public void createCatalog(Catalog sysCodeSet) throws ServiceException {
		try {
			catalogDao.save(sysCodeSet);
		}
		catch (Exception e) {

			throw new ServiceException(e);
		}
	}

	/**
	 * 更新对象
	 * 
	 * @see com.CatalogService.core.service.CatalogService#updateCatalog(Catalog
	 *      sysCodeSet)
	 * @param
	 */
	public void updateCatalog(Catalog sysCodeSet) throws ServiceException {
		try {
			catalogDao.update(sysCodeSet);
		}
		catch (Exception e) {

			throw new ServiceException(e);
		}
	}

	/**
	 * 删除对象
	 * 
	 * @param clazz
	 *           model class to lookup
	 * @param id
	 *           the identifier (primary key) of the class
	 * @see com.CatalogService.core.service.CatalogService#removeCatalog(Serializable
	 *      id)
	 */
	public void removeCatalog(Serializable id) throws ServiceException {
		try {
			catalogDao.delete(id);
		}
		catch (Exception e) {

			throw new ServiceException(e);
		}
	}

	/**
	 * 批删除对象
	 * 
	 * @param id
	 *           the identifier (primary key) of the class
	 */
	public void removeCatalogs(Serializable[] ids) throws ServiceException {
		try {
			for (int i = 0; i < ids.length; i++) {
				removeCatalog(ids[i]);
			}
		}
		catch (Exception e) {

			throw new ServiceException(e);
		}
	}

	/**
	 * 使用外健批删除从表记录
	 * 
	 * @param fieldName
	 *           字段名
	 * @param fieldValue
	 *           字段值,这里必须传入字段相应的类型,如Long不能用String
	 * @see com.CatalogService.core.service.CatalogService#removeCatalogByField(String
	 *      fieldName, Object fieldValue)
	 */
	public void removeCatalogByField(String fieldName, Object fieldValue) throws ServiceException {
		try {
			catalogDao.deleteByField(fieldName, fieldValue);
		}
		catch (Exception e) {

			throw new ServiceException(e);
		}
	}

	/**
	 * 使用外健获取从表记录
	 * 
	 * @param fieldName
	 *           字段名
	 * @param fieldValue
	 *           字段值,这里必须传入字段相应的类型,如Long不能用String
	 * @see com.CatalogService.core.service.CatalogService#findCatalogByField(String
	 *      fieldName, Object fieldValue)
	 */
	public Collection<Catalog> findCatalogByField(String fieldName, Object fieldValue) throws ServiceException {
		try {
			return catalogDao.findByField(fieldName, fieldValue);
		}
		catch (Exception e) {

			throw new ServiceException(e);
		}
	}

	/**
	 * 使用外健计算从表记录数
	 * 
	 * @param fieldName
	 *           字段名
	 * @param fieldValue
	 *           字段值,这里必须传入字段相应的类型,如Long不能用String
	 * @return
	 * @see com.CatalogService.core.service.CatalogService#countCatalogByField(String
	 *      fieldName, Object fieldValue)
	 */
	public int countCatalogByField(String fieldName, Object fieldValue) throws ServiceException {
		try {
			return catalogDao.countByField(fieldName, fieldValue);
		}
		catch (Exception e) {

			throw new ServiceException(e);
		}
	}

	/**
	 * @return 全部
	 * @throws Exception
	 */
	public Collection<Catalog> findAllCatalog() throws ServiceException {
		try {
			return catalogDao.findAll();
		}
		catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	public CatalogItemDao getCatalogItemDao() {
		return catalogItemDao;
	}

	public void setCatalogItemDao(CatalogItemDao catalogItemDao) {
		this.catalogItemDao = catalogItemDao;
	}

	public PageQuery getCodeSetsForTree(PageQuery pagequery)
			throws ServiceException {
		return null;//catalogDao.queryBySelectId(pagequery);
	}

	public PageQuery queryCatalog(PageQuery pageQuery) throws ServiceException {
		try {
			PageQuery  query=null;//catalogDao.queryBySelectId(pageQuery);
			pageQuery.setRecordSet(query.getRecordSet());
			pageQuery.setRecordCount(query.getRecordCount());
			return pageQuery;
		}
		catch (Exception e) {
			throw new ServiceException(e);
		}
	}

}
