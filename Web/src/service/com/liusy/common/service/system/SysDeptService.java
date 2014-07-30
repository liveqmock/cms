package com.liusy.common.service.system;

import java.io.Serializable;
import java.util.List;

import com.liusy.common.model.SysDept;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.ServiceException;

public interface SysDeptService {
	public SysDept findSysDept(Serializable id) throws ServiceException;

	public PageQuery querySysDept(PageQuery pageQuery) throws ServiceException;
	
	public List<SysDept> findSysDepts(Serializable orgId) throws ServiceException;
	
	public List<SysDept> findAllDept()throws ServiceException;
}
