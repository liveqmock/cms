package com.liusy.common.dao;
import java.io.Serializable;

import com.liusy.common.model.SysRole;
import com.liusy.core.dao.HibernateDao;
import com.liusy.core.exception.DAOException;

public interface SysRoleDao extends HibernateDao<SysRole> {
	
	public SysRole get(Serializable id) throws DAOException;

	public SysRole load(Serializable id) throws DAOException;	
	
	public Serializable save(SysRole sysRole) throws DAOException;

	public void saveOrUpdate(SysRole sysRole) throws DAOException;

	public void update(SysRole sysRole) throws DAOException;
	
	public void delete(Serializable id) throws DAOException;
}
