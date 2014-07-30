package com.liusy.cms.service;

import java.io.Serializable;
import java.util.List;

import com.liusy.cms.model.CatalogItem;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.ServiceException;

public interface CatalogItemService {

	public CatalogItem findCatalogItem(Serializable id) throws ServiceException;

	public void createCatalogItem(CatalogItem sysCode) throws ServiceException;

	public void updateCatalogItem(CatalogItem sysCode) throws ServiceException;

	public void removeCatalogItem(Serializable id) throws ServiceException;

	public PageQuery queryCatalogItem(PageQuery pageQuery) throws ServiceException;

	public void removeCatalogItems(Serializable[] ids) throws ServiceException;
	
	public List<CatalogItem> findItemByCatalogId(Integer codeSetId) throws ServiceException;
   
   public List<CatalogItem> findTreeItems(Integer codeSetId) throws ServiceException;
	
	public List<CatalogItem> findAll() throws ServiceException;

}

