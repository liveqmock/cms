package com.liusy.common.service.system.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.liusy.common.dao.SysResourceDao;
import com.liusy.common.dao.SysResourceRoleDao;
import com.liusy.common.dao.SysRoleDao;
import com.liusy.common.dao.SysUserDao;
import com.liusy.common.dao.SysUserRoleDao;
import com.liusy.common.model.SysResource;
import com.liusy.common.model.SysResourceRole;
import com.liusy.common.model.SysResourceUser;
import com.liusy.common.model.SysRole;
import com.liusy.common.model.SysUser;
import com.liusy.common.model.SysUserRole;
import com.liusy.common.service.system.SysRoleService;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.DAOException;
import com.liusy.core.exception.ServiceException;
import com.liusy.core.service.impl.BaseServiceImpl;
import com.liusy.core.util.ConvertUtil;

public class SysRoleServiceImpl extends BaseServiceImpl implements SysRoleService {

   private static final long serialVersionUID = 1L;

   public static String SYS_NOTVERIFY = "1";

   public static String SYS_OPER_DELETE = "3";

   public static String SYS_VERIFIED = "0";

   public static String SYS_OPER_NONE = "";

   public static String SYS_OPER_ADD = "1";

   public List<SysRole> findAllRole() throws ServiceException {
      try {
         return sysRoleDao.findAll();
      } catch (DAOException e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public SysRole getRole(Serializable id) throws ServiceException {
      try {
         return sysRoleDao.get(id);
      } catch (DAOException e) {
         throw new ServiceException(e);
      }
   }

   public void createRole(SysRole sysRole) throws ServiceException {
      try {
         List list = sysRoleDao.findByField(SysRole.PROP_ROLE_NAME, sysRole.getRoleName());
         if (list != null && list.size() > 0) {
            throw new ServiceException("角色名[" + sysRole.getRoleName() + "]已经存在，不能使用");
         }
         sysRoleDao.save(sysRole);
      } catch (DAOException e) {
         throw new ServiceException(e);
      } catch (ServiceException ex) {
         ex.printStackTrace();
         throw ex;
      } catch (Exception exc) {
         exc.printStackTrace();
         throw new ServiceException("系统错误。");
      }

   }

   public void updateRole(SysRole sysRole) throws ServiceException {
      try {
         List list = sysRoleDao.findByField(SysRole.PROP_ROLE_NAME, sysRole.getRoleName());
         if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
               SysRole role = (SysRole) list.get(i);
               if (sysRole.getId().intValue() != role.getId().intValue()) {
                  throw new ServiceException("角色名[" + sysRole.getRoleName() + "]存在重复，不能使用");
               }
            }
         }
         Integer roleId = sysRole.getId();
         SysRole tem = sysRoleDao.get(roleId);
         String status = tem.getRoleStatus();
         String uName = tem.getRoleName();

         ConvertUtil.convertToModelForUpdate(tem, sysRole);

         if (SYSROLE.equals(tem.getRoleType())) {
            tem.setRoleStatus(status);
            tem.setRoleName(uName);
         }
         sysRoleDao.update(tem);
      } catch (DAOException e) {
         e.printStackTrace();
         throw new ServiceException("数据库操作错误。");
      } catch (ServiceException ex) {
         ex.printStackTrace();
         throw ex;
      } catch (Exception exc) {
         throw new ServiceException("系统错误。");
      }

   }

   public void deleteRole(Serializable id) throws ServiceException {
      try {
         SysRole tem = sysRoleDao.get(id);
         if (SYSROLE.equals(tem.getRoleType())) {
            throw new ServiceException("该角色不能删除。");
         }
         sysRoleDao.delete(tem);
      } catch (DAOException de) {
         de.printStackTrace();
         throw new ServiceException("数据库操作错误。");
      } catch (ServiceException se) {
         se.printStackTrace();
         throw se;
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }

   }

   public PageQuery querySysRole(PageQuery page) throws ServiceException {
      try {
         String sql = "select r.id as id,r.role_code as code,r.role_name as rolename,r.remark as remark,r.role_status as status from sys_role r";

         String fstr = createSqlFilter(page);
         if (fstr.length() > 0)
            sql += " where " + fstr;

         page.setQuerySql(sql);
         return jdbcDao.queryBySql(page);
      } catch (DAOException e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   private String createSqlFilter(PageQuery page) {
      StringBuffer buffer = new StringBuffer();
      Map<String, String> fields = page.getParameters();
      String str = (String) fields.get("roleCode");
      if (str != null && !"".equals(str)) {
         if (str.contains("%"))
            buffer.append(" r.role_code like '" + str + "'");
         else
            buffer.append(" r.role_code  like '%" + str + "%'");
      }
      str = (String) fields.get("roleName");
      if (str != null && !"".equals(str)) {
         if (buffer.length() > 0)
            buffer.append(" and ");
         buffer.append(" r.role_name  like '%" + str + "%'");
      }
      str = (String) fields.get("roleStatus");
      if (str != null && !"".equals(str)) {
         if (buffer.length() > 0)
            buffer.append(" and ");
         buffer.append(" r.role_status =" + str);
      }
      return buffer.toString();
   }

   public void deleteRoles(Serializable[] ids) throws ServiceException {
      try {
         for (int i = 0; i < ids.length; i++) {
            SysRole tmp = sysRoleDao.get(ids[i]);
            if (SYSROLE.equals(tmp.getRoleType())) {
               throw new ServiceException("系统角色不能删除。");
            }
         }
         sysRoleDao.deleteAll(ids);
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

   public void saveRights(Integer id, String rights) throws ServiceException {
      String tmp = "," + rights + ",";
      try {
         SysRole sysRole = sysRoleDao.get(id);
         if (sysRole == null)
            throw new ServiceException("该角色不存在");
         List<SysResourceRole> roleRights = sysResourceRoleDao.findByField(SysResourceRole.PROP_ROLE_ID, id);
         for (int i = 0; i < roleRights.size(); i++) {
            SysResourceRole srr = (SysResourceRole) roleRights.get(i);
            if (tmp.indexOf("," + srr.getResId().toString() + ",") < 0) {
               sysResourceRoleDao.delete(srr);
            } else {
               tmp = tmp.replace("," + srr.getResId().toString() + ",", ",");// 放弃没有变化的权限
            }
         }
         String[] newRights = rights.split(",");
         for (int i = 0; i < newRights.length; i++) {
            String r = newRights[i];
            if (r == null || r.equals(""))
               continue;
            SysResourceRole sru = new SysResourceRole();// 增加权限
            sru.setRoleId(id);
            sru.setStatus(SYS_VERIFIED);// 待审核//2011/4/6日已经改为“不需要审核”
            sru.setOper(SYS_OPER_ADD);// 设置增加操作
            sru.setResId(new Integer(r));
            sysResourceRoleDao.save(sru);
         }
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

   public void startRoles(Serializable[] ids) throws ServiceException {
      try {
         for (int i = 0; i < ids.length; i++) {
            SysRole tmp = sysRoleDao.get(ids[i]);
            if (tmp != null) {
               tmp.setRoleStatus("1");
               sysRoleDao.update(tmp);
            }
         }
      } catch (DAOException e) {
         e.printStackTrace();
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统出错。");
      }
   }

   public void stopRoles(Serializable[] ids) throws ServiceException {
      try {
         for (int i = 0; i < ids.length; i++) {
            SysRole tmp = sysRoleDao.get(ids[i]);
            if (tmp != null && !SYSROLE.equals(tmp.getRoleType())) { // 系统固定的用户不能暂停。
               tmp.setRoleStatus("0");
               sysRoleDao.update(tmp);
            }
         }
      } catch (DAOException e) {
         e.printStackTrace();
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   /**
    * 注入DAO
    * 
    * @see com.thunisoft.core.service.SysRoleService#setSysRoleDao(SysRole
    *      sysRoleDao)
    */
   private SysRoleDao sysRoleDao;

   public void setSysRoleDao(SysRoleDao sysRoleDao) {
      this.sysRoleDao = sysRoleDao;
   }

   private SysResourceRoleDao sysResourceRoleDao;

   public void setSysResourceRoleDao(SysResourceRoleDao sysResourceRoleDao) {
      this.sysResourceRoleDao = sysResourceRoleDao;
   }

   private SysUserRoleDao sysUserRoleDao;

   public SysUserRoleDao getSysUserRoleDao() {
      return sysUserRoleDao;
   }

   public void setSysUserRoleDao(SysUserRoleDao sysUserRoleDao) {
      this.sysUserRoleDao = sysUserRoleDao;
   }

   public void setSysUserRoleDaoo(SysUserRoleDao sysUserRoleDao) {
      this.sysUserRoleDao = sysUserRoleDao;
   }

   private SysResourceDao sysResourceDao;

   public SysResourceDao getSysResourceDao() {
      return sysResourceDao;
   }

   public void setSysResourceDao(SysResourceDao sysResourceDao) {
      this.sysResourceDao = sysResourceDao;
   }

   private SysUserDao sysUserDao;

   public SysUserDao getSysUserDao() {
      return sysUserDao;
   }

   public void setSysUserDao(SysUserDao sysUserDao) {
      this.sysUserDao = sysUserDao;
   }

   public List<SysResource> findRoleRights(Serializable id) throws ServiceException {
      List<Integer> list = new ArrayList<Integer>();
      try {
         List<SysResourceRole> srs = sysResourceRoleDao.findByField(SysResourceRole.PROP_ROLE_ID, id);
         for (SysResourceRole s : srs) {
            list.add(s.getResId());
         }
         return sysResourceDao.findAll(list.toArray(new Serializable[list.size()]));
      } catch (DAOException e) {
         e.printStackTrace();
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public List<SysUser> findRoleUsers(Serializable id) throws ServiceException {
      List<Integer> list = new ArrayList<Integer>();
      try {
         List<SysUserRole> srs = sysUserRoleDao.findByField(SysUserRole.PROP_ROLE_ID, id);
         for (SysUserRole s : srs) {
            list.add(s.getUserId());
         }
         return sysUserDao.findAll(list.toArray(new Serializable[list.size()]));
      } catch (DAOException e) {
         e.printStackTrace();
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }
}
