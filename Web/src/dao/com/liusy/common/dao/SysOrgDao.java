package com.liusy.common.dao;

import java.io.Serializable;

import com.liusy.common.model.SysOrg;
import com.liusy.core.dao.HibernateDao;
import com.liusy.core.exception.DAOException;

public interface SysOrgDao extends HibernateDao<SysOrg> {
	public SysOrg cast(Object object);
	
	public SysOrg get(Serializable id) throws DAOException;

	public SysOrg load(Serializable id) throws DAOException;	
	
	public Serializable save(SysOrg sysOrg) throws DAOException;

	public void saveOrUpdate(SysOrg sysOrg) throws DAOException;

	public void update(SysOrg sysOrg) throws DAOException;
	
	public void delete(Serializable id) throws DAOException;

	public void refresh(SysOrg sysOrg) throws DAOException;	
}
