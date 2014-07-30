package com.liusy.common.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.liusy.common.dao.SysCodeDao;
import com.liusy.common.dao.SysCodeSetDao;
import com.liusy.common.dao.SysResourceDao;
import com.liusy.common.model.SysCode;
import com.liusy.common.model.SysCodeSet;
import com.liusy.common.model.SysResource;
import com.liusy.core.common.Code;
import com.liusy.core.exception.ServiceException;
import com.liusy.core.web.CommonService;

public class CommonServiceImpl implements CommonService {

   private Map<String, List<Code>> codes;

   private Map<String, String>     sysReources;

   private SysCodeDao              sysCodeDao;

   private SysCodeSetDao           sysCodeSetDao;

   private SysResourceDao          sysResourceDao;

   public SysCodeDao getSysCodeDao() {
      return sysCodeDao;
   }

   public void setSysCodeDao(SysCodeDao sysCodeDao) {
      this.sysCodeDao = sysCodeDao;
   }

   public SysCodeSetDao getSysCodeSetDao() {
      return sysCodeSetDao;
   }

   public void setSysCodeSetDao(SysCodeSetDao sysCodeSetDao) {
      this.sysCodeSetDao = sysCodeSetDao;
   }

   public Map<String, List<Code>> loadCodes() throws ServiceException {
      if (codes == null) {
         codes = new HashMap<String, List<Code>>();
         Iterator<SysCodeSet> it = sysCodeSetDao.findAll().iterator();
         try {
            Iterator<SysCode> itc = sysCodeDao.findAll(SysCode.PROP_ITEM_VALUE, true).iterator();
            while (itc.hasNext()) {
               SysCode sysCode = (SysCode) itc.next();
               String csid = sysCode.getCodeSetId().toString();
               List<Code> ls = codes.get(csid);
               if (ls == null) {
                  ls = new ArrayList<Code>();
                  ls.add(new Code("", ""));
                  codes.put(csid, ls);
               }
               ls.add(new Code(sysCode.getName(), sysCode.getValue(), sysCode.getParentId(), sysCode.getParentValue()));
            }
            while (it.hasNext()) {
               SysCodeSet set = (SysCodeSet) it.next();
               List<Code> list = codes.get(set.getId().toString());
               if (list != null) {
                  codes.remove(set.getId().toString());
                  codes.put(set.getEnName(), list);
               }
            }
         } catch (Exception e) {
            throw new ServiceException(e);
         }
      }
      return codes;
   }

   public void remove(String codeSetName) {
      if (codes != null) codes.remove(codeSetName);
   }

   public List<Code> load(String codeSetName) {
      if (codes == null) loadCodes();
      List<Code> list = codes.get(codeSetName);

      if (list == null) {
         list = new ArrayList<Code>();
         List<SysCodeSet> scs = sysCodeSetDao.findByField(SysCodeSet.PROP_EN_NAME, codeSetName);
         if (scs == null || scs.size() == 0) {
            codes.put(codeSetName, list);
            return list;
         }
         else {
            int scId = scs.get(0).getId();
            List<SysCode> ls = sysCodeDao.findByField(SysCode.PROP_CS_ID, scId, SysCode.PROP_ITEM_VALUE, true);
            if (ls != null) {
               for (SysCode sc : ls) {
                  list.add(new Code(sc.getName(), sc.getValue(), sc.getParentId(), sc.getParentValue()));
               }
            }
            codes.put(codeSetName, list);
         }
      }
      return list;
   }

   public SysResourceDao getSysResourceDao() {
      return sysResourceDao;
   }

   public void setSysResourceDao(SysResourceDao sysResourceDao) {
      this.sysResourceDao = sysResourceDao;
   }

   private void findReources() {
      List<SysResource> list = sysResourceDao.findAll();
      if (sysReources == null) sysReources = new HashMap<String, String>();
      for (SysResource sr : list) {
         if (sr.getActionUrl() != null && sr.getActionUrl().trim().length() > 0) {
            sysReources.put(sr.getResCode().trim(), sr.getActionUrl().trim());
         }
      }
   }

   public String findResourceCode(String url) {
      if (sysReources == null) findReources();
      String res = "";

      Iterator<String> it = sysReources.keySet().iterator();
      while (it.hasNext()) {
         String key = it.next();
         if (sysReources.get(key).equalsIgnoreCase(url.trim())) {
            res = key;
            break;
         }
      }
      return res;
   }
}
