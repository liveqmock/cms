package com.liusy.common.service.system.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Order;

import com.liusy.common.dao.SysResourceDao;
import com.liusy.common.model.SysResource;
import com.liusy.common.service.system.SysResourceService;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.DAOException;
import com.liusy.core.exception.ServiceException;
import com.liusy.core.service.impl.BaseServiceImpl;
import com.liusy.core.util.ConvertUtil;

public class SysResourceServiceImpl extends BaseServiceImpl implements SysResourceService {
	private static final long	serialVersionUID	= 1L;

	public SysResource findSysResource(Serializable id) throws ServiceException {
		try {
			return sysResourceDao.get(id);
		}
		catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	public void createSysResource(SysResource sysResource) throws ServiceException {
		try {
			sysResourceDao.save(sysResource);
		}
		catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	public void updateSysResource(SysResource sysResource) throws ServiceException {
		try {
			SysResource tmp = sysResourceDao.get(sysResource.getId());
			ConvertUtil.convertToModelForUpdate(tmp, sysResource);
			sysResourceDao.update(tmp);
		}
		catch (DAOException e) {
			throw new ServiceException(e);
		}
		catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	public void removeSysResource(Serializable id) throws ServiceException {
		try {
			sysResourceDao.delete(id);
		}
		catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	public void removeSysResources(Serializable[] ids) throws ServiceException {
		try {
			sysResourceDao.deleteAll(ids);
		}
		catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	public PageQuery querySysResource(PageQuery pageQuery) throws ServiceException {
		try {
			PageQuery query =null;// sysResourceDao.queryBySelectId(pageQuery);
			pageQuery.setRecordSet(query.getRecordSet());
			pageQuery.setRecordCount(query.getRecordCount());
			return pageQuery;
		}
		catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	public List<SysResource> findAll() throws ServiceException {
		try {
			return sysResourceDao.findAll(SysResource.PROP_PARENT_ID, true);
		}
		catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	public boolean needCheck(String url) throws ServiceException {
		if (url == null) return false;
		
		List list = sysResourceDao.findByField(SysResource.PROP_ACTION_URL, url);
		if (list != null && list.size() > 0) return true;
		else return false;
	}

	private SysResourceDao	sysResourceDao;

	/**
	 * 注入DAO
	 * 
	 * @see com.thunisoft.core.service.SysResourceService#setSysResourceDao(SysResource
	 *      sysResourceDao)
	 */
	public void setSysResourceDao(SysResourceDao sysResourceDao) {
		this.sysResourceDao = sysResourceDao;
	}
}