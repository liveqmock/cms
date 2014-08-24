package com.liusy.cms.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liusy.cms.dao.CatalogDao;
import com.liusy.cms.dao.CatalogItemDao;
import com.liusy.cms.model.CatalogItem;
import com.liusy.cms.service.CatalogItemService;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.DAOException;
import com.liusy.core.exception.ServiceException;
import com.liusy.core.util.ConvertUtil;


@Service("catalogItemService")
public class CatalogItemServiceImpl implements CatalogItemService {
	
   private static final long serialVersionUID = 1L;

   public CatalogItem findCatalogItem(Serializable id) throws ServiceException {
      try {
         return catalogItemDao.get(id);
      } catch (DAOException e) {
         throw new ServiceException(e);
      }
   }

   public void createCatalogItem(CatalogItem catalogItem) throws ServiceException {
      try {
 
         catalogItemDao.save(catalogItem);
      } catch (DAOException e) {
         e.printStackTrace();
         throw new ServiceException("数据库操作错误。");
      } catch (ServiceException se) {
         se.printStackTrace();
         throw se;
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public void updateCatalogItem(CatalogItem catalogItem) throws ServiceException {
      try {
         CatalogItem tmp = catalogItemDao.get(catalogItem.getId());
         ConvertUtil.convertToModelForUpdate(tmp, catalogItem);
         catalogItemDao.update(tmp);
      } catch (DAOException e) {
         e.printStackTrace();
         throw new ServiceException("数据库操作错误。");
      } catch (ServiceException se) {
         se.printStackTrace();
         throw se;
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public void removeCatalogItem(Serializable id) throws ServiceException {
      try {
         catalogItemDao.delete(id);
      } catch (DAOException e) {
         throw new ServiceException(e);
      }
   }

   public void removeCatalogItems(Serializable[] ids) throws ServiceException {
      try {
         catalogItemDao.deleteAll(ids);
      } catch (Exception e) {
         throw new ServiceException(e);
      }
   }

   public PageQuery queryCatalogItem(PageQuery pageQuery) throws ServiceException {
      try {
         PageQuery query = null;// catalogItemDao.queryBySelectId(pageQuery);
         pageQuery.setRecordSet(query.getRecordSet());
         pageQuery.setRecordCount(query.getRecordCount());
         return pageQuery;
      } catch (Exception e) {
         throw new ServiceException(e);
      }
   }

   public List<CatalogItem> findAll() throws ServiceException {
      try {
         return catalogItemDao.findAll();
      } catch (Exception e) {
         throw new ServiceException(e);
      }
   }

   public List<CatalogItem> findItemByCatalogId(Integer catalogId) throws ServiceException {
      try {
	      return catalogItemDao.findByHql(" select ci from CatalogItem ci ,Catalog c where c.id=ci.catalogId and (c.parentId = "+catalogId+" or c.id = "+catalogId+")");
	      
         //return catalogItemDao.findByField("catalogId", catalogId, "sort", true);
      } catch (Exception e) {
         throw new ServiceException(e);
      }
   }

   public List<CatalogItem> findTreeItems(Integer catalogId) throws ServiceException {
      try {
         String[] fields = { "catalogId" };
         Object[] values = { catalogId };
         String[] orders = { "sort" };
         boolean[] decs = { true,true };
         return catalogItemDao.findByFields(fields, values, orders, decs);
      } catch (Exception e) {
         throw new ServiceException(e);
      }
   }
   @Autowired
   private CatalogDao catalogDao;
   @Autowired
   private CatalogItemDao    catalogItemDao;





}