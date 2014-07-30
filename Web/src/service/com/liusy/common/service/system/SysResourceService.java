package com.liusy.common.service.system;

import java.io.Serializable;
import java.util.List;

import com.liusy.common.model.SysResource;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.ServiceException;

public interface SysResourceService {

   public SysResource findSysResource(Serializable id) throws ServiceException;

   public void createSysResource(SysResource sysResource) throws ServiceException;

   public void updateSysResource(SysResource sysResource) throws ServiceException;

   public void removeSysResource(Serializable id) throws ServiceException;

   public PageQuery querySysResource(PageQuery pageQuery) throws ServiceException;

   public void removeSysResources(Serializable[] ids) throws ServiceException;

   public List<SysResource> findAll() throws ServiceException;

   public boolean needCheck(String url) throws ServiceException;

}