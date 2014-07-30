package com.liusy.common.service.system;

import java.io.Serializable;
import java.util.List;

import com.liusy.common.model.SysCode;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.ServiceException;

public interface SysCodeService {

	public SysCode findSysCode(Serializable id) throws ServiceException;

	public void createSysCode(SysCode sysCode) throws ServiceException;

	public void updateSysCode(SysCode sysCode) throws ServiceException;

	public void removeSysCode(Serializable id) throws ServiceException;

	public PageQuery querySysCode(PageQuery pageQuery) throws ServiceException;

	public void removeSysCodes(Serializable[] ids) throws ServiceException;
	
	public PageQuery getSysCodeSetsForTree(PageQuery pagequery) throws ServiceException;
	
	public List<SysCode> findCodeBySetId(Integer codeSetId) throws ServiceException;
   
   public List<SysCode> findTreeCodes(Integer codeSetId) throws ServiceException;
	
	public List<SysCode> findAll() throws ServiceException;
	
	public String findCodeNoByName(String name) throws ServiceException;

}

