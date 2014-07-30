package com.liusy.common.service.system.impl;

import java.io.Serializable;
import java.util.List;

import com.liusy.common.dao.SysCodeDao;
import com.liusy.common.dao.SysCodeSetDao;
import com.liusy.common.model.SysCode;
import com.liusy.common.model.SysCodeSet;
import com.liusy.common.service.system.SysCodeService;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.DAOException;
import com.liusy.core.exception.ServiceException;
import com.liusy.core.util.ConvertUtil;

public class SysCodeServiceImpl implements SysCodeService {
   private static final long serialVersionUID = 1L;

   public SysCode findSysCode(Serializable id) throws ServiceException {
      try {
         return sysCodeDao.get(id);
      } catch (DAOException e) {
         throw new ServiceException(e);
      }
   }

   public void createSysCode(SysCode sysCode) throws ServiceException {
      try {
         List list = sysCodeDao.findByField(SysCode.PROP_CS_ID, sysCode.getCodeSetId());

         if (list != null) {
            for (int i = 0; i < list.size(); i++) {
               SysCode tmp = (SysCode) list.get(i);
               if (tmp.getName().equalsIgnoreCase(sysCode.getName()) || tmp.getValue().equalsIgnoreCase(sysCode.getValue())) {
                  throw new ServiceException("代码名称和代码值不能重复。");
               }
            }
         }
         sysCodeDao.save(sysCode);
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

   public void updateSysCode(SysCode sysCode) throws ServiceException {
      try {
         List list = sysCodeDao.findByField(SysCode.PROP_CS_ID, sysCode.getCodeSetId());

         if (list != null) {
            for (int i = 0; i < list.size(); i++) {
               SysCode tmp = (SysCode) list.get(i);
               if (tmp.getId().intValue() != sysCode.getId().intValue()
                     && (tmp.getName().equalsIgnoreCase(sysCode.getName()) || tmp.getValue().equalsIgnoreCase(sysCode.getValue()))) {
                  throw new ServiceException("代码名称和代码值不能重复。");
               }
            }
         }
         SysCode tmp = sysCodeDao.get(sysCode.getId());
         ConvertUtil.convertToModelForUpdate(tmp, sysCode);
         sysCodeDao.update(tmp);
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

   public void removeSysCode(Serializable id) throws ServiceException {
      try {
         sysCodeDao.delete(id);
      } catch (DAOException e) {
         throw new ServiceException(e);
      }
   }

   public void removeSysCodes(Serializable[] ids) throws ServiceException {
      try {
         sysCodeDao.deleteAll(ids);
      } catch (Exception e) {
         throw new ServiceException(e);
      }
   }

   public PageQuery querySysCode(PageQuery pageQuery) throws ServiceException {
      try {
         PageQuery query = null;// sysCodeDao.queryBySelectId(pageQuery);
         pageQuery.setRecordSet(query.getRecordSet());
         pageQuery.setRecordCount(query.getRecordCount());
         return pageQuery;
      } catch (Exception e) {
         throw new ServiceException(e);
      }
   }

   public List<SysCode> findAll() throws ServiceException {
      try {
         return sysCodeDao.findAll();
      } catch (Exception e) {
         throw new ServiceException(e);
      }
   }

   public List<SysCode> findCodeBySetId(Integer codeSetId) throws ServiceException {
      try {
         return sysCodeDao.findByField(SysCode.PROP_CS_ID, codeSetId, SysCode.PROP_ITEM_VALUE, true);
      } catch (Exception e) {
         throw new ServiceException(e);
      }
   }

   public List<SysCode> findTreeCodes(Integer codeSetId) throws ServiceException {
      try {
         String[] fields = { SysCode.PROP_CS_ID };
         Object[] values = { codeSetId };
         String[] orders = { SysCode.PROP_TREE_LEVEL,SysCode.PROP_ITEM_VALUE };
         boolean[] decs = { true,true };
         return sysCodeDao.findByFields(fields, values, orders, decs);
      } catch (Exception e) {
         throw new ServiceException(e);
      }
   }

   private SysCodeSetDao sysCodeSetDao;

   private SysCodeDao    sysCodeDao;

   /**
    * 注入DAO
    * 
    * @see com.CatalogItemService.core.service.SysCodeService#setSysCodeDao(SysCode
    *      sysCodeDao)
    */
   public void setSysCodeDao(SysCodeDao sysCodeDao) {
      this.sysCodeDao = sysCodeDao;
   }

   public PageQuery getSysCodeSetsForTree(PageQuery pagequery) throws ServiceException {
      return null;// sysCodeSetDao.queryBySelectId(pagequery);
   }

   public void setSysCodeSetDao(SysCodeSetDao sysCodeSetDao) {
      this.sysCodeSetDao = sysCodeSetDao;
   }

   public String findCodeNoByName(String name) throws ServiceException {
      try {
         List<SysCodeSet> codeSets=sysCodeSetDao.findByField(SysCodeSet.PROP_EN_NAME, "PRJ_STAGE");
         
         List<SysCode> codes=sysCodeDao.findByFields(new String[]{SysCode.PROP_CS_ID,SysCode.PROP_ITEM_NAME}, new Object[]{codeSets.get(0).getId(),name});
         return codes.get(0).getValue();
      } catch (Exception e) {
         throw new ServiceException(e);
      }
   }
}