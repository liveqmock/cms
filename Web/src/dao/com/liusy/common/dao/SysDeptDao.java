package com.liusy.common.dao;

import java.io.Serializable;

import com.liusy.common.model.SysDept;
import com.liusy.core.dao.HibernateDao;
import com.liusy.core.exception.DAOException;

public interface SysDeptDao extends HibernateDao<SysDept> {

   public SysDept get(Serializable id) throws DAOException;

	public SysDept load(Serializable id) throws DAOException;

	public Serializable save(SysDept sysDept) throws DAOException;

	public void saveOrUpdate(SysDept sysDept) throws DAOException;

	public void update(SysDept sysDept) throws DAOException;

	public void delete(Serializable id) throws DAOException;	
}
