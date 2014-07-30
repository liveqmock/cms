package com.liusy.common.service.login.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.liusy.common.dao.SysDeptDao;
import com.liusy.common.dao.SysOrgDao;
import com.liusy.common.dao.SysResourceDao;
import com.liusy.common.dao.SysResourceRoleDao;
import com.liusy.common.dao.SysResourceUserDao;
import com.liusy.common.dao.SysUserDao;
import com.liusy.common.dao.SysUserRoleDao;
import com.liusy.common.model.SysDept;
import com.liusy.common.model.SysOrg;
import com.liusy.common.model.SysResource;
import com.liusy.common.model.SysResourceRole;
import com.liusy.common.model.SysUser;
import com.liusy.common.model.SysUserRole;
import com.liusy.common.service.login.LoginService;
import com.liusy.core.dao.JdbcDao;
import com.liusy.core.exception.DAOException;
import com.liusy.core.exception.ServiceException;
import com.liusy.core.util.Const;
import com.liusy.core.web.UserSession;

public class LoginServiceImpl implements LoginService {

   public static String   VERIFIED   = "0";
   public static String   NEEDVERIFY = "1";

   private SysUserDao     sysUserDao;
   private SysOrgDao      sysOrgDao;
   private SysDeptDao     sysDeptDao;
   private SysResourceDao sysResourceDao;

   private JdbcDao        jdbcDao;

   public UserSession login(String accountName, String password) throws ServiceException {
      if (accountName == null) throw new ServiceException("系统错误。");
      UserSession session = null;
      try {
         session = checkAccount(accountName, password);
         getPrivileges(session);
         return session;
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

   private UserSession checkAccount(String accountName, String password) throws ServiceException {
      UserSession session = null;
      List<SysUser> users = sysUserDao.findByField(SysUser.PROP_USER_ACCOUNT, accountName);
      if (users == null || users.size() == 0) throw new ServiceException("用户帐号或密码错误。");
      if (users.size() > 1) throw new ServiceException("系统错误。");

      SysUser user = (SysUser) users.get(0);
      if (!Const.LOGIN_ACTIVE.equals(user.getUserStatus())) throw new ServiceException("用户已被停用，请与系统管理员联系。");
      if (user.getOrgId() == null) throw new ServiceException("找不到用户所在单位，请与系统管理员联系。");
      if (user.getDeptId() == null) throw new ServiceException("找不到用户所在部门，请与系统管理员联系。");
      if (!password.equals(user.getUserPassword())) throw new ServiceException("用户帐号或密码有误。");

      session = new UserSession();
      session.setUserId(user.getId().toString());
      session.setAccountName(user.getUserAccount());
      session.setUserName(user.getUserName());
      session.setLoginTime(new Date());
      session.setOrgId(user.getOrgId().toString());
      session.setDeptId(user.getDeptId().toString());

      SysOrg sysOrg = sysOrgDao.get(user.getOrgId());
      session.setOrgCode(sysOrg.getOrgCode());
      session.setOrgName(sysOrg.getName());

      SysDept sysDept = sysDeptDao.get(user.getDeptId());
      session.setDeptCode(sysDept.getDeptCode());
      session.setDeptName(sysDept.getDeptName());

      List<Map<String, Object>> roles = jdbcDao.queryBySqlId("getUserRoles", user.getId());
      for (int i = 0; i < roles.size(); i++) {
         session.getRoles().put(new Integer(roles.get(i).get("roleId").toString()), roles.get(i).get("roleName").toString());
      }
      return session;
   }

   private void getPrivileges(UserSession session) throws ServiceException {
      Map<String, String> privileges = session.getPrivileges();

      Iterator<Integer> it = session.getRoles().keySet().iterator();
      if (it == null) return;
      while (it.hasNext()) {
         Integer key = it.next();
         List<Map<String, Object>> rights = jdbcDao.queryBySqlId("getRoleRights", key);
         if (rights != null) {
            for (Map<String, Object> right : rights) {
               if (!privileges.containsKey(right.get("resCode").toString())) {
                  privileges.put(right.get("resCode").toString(), right.get("resName").toString());
               }
            }
         }
      }
      
      Integer uid = new Integer(session.getUserId());
      List<Map<String, Object>> rights = jdbcDao.queryBySqlId("getUserRights", uid);
      if (rights != null) {
         for (Map<String, Object> right : rights) {
            if (!privileges.containsKey(right.get("resCode").toString())) {
               privileges.put(right.get("resCode").toString(), right.get("resName").toString());
            }
         }
      }
   }

   public SysDeptDao getSysDeptDao() {
      return sysDeptDao;
   }

   public void setSysDeptDao(SysDeptDao sysDeptDao) {
      this.sysDeptDao = sysDeptDao;
   }

   public SysUserDao getSysUserDao() {
      return sysUserDao;
   }

   public void setSysUserDao(SysUserDao sysUserDao) {
      this.sysUserDao = sysUserDao;
   }

   public SysResourceDao getSysResourceDao() {
      return sysResourceDao;
   }

   public void setSysResourceDao(SysResourceDao sysResourceDao) {
      this.sysResourceDao = sysResourceDao;
   }

   public SysOrgDao getSysOrgDao() {
      return sysOrgDao;
   }

   public void setSysOrgDao(SysOrgDao sysOrgDao) {
      this.sysOrgDao = sysOrgDao;
   }

   public JdbcDao getJdbcDao() {
      return jdbcDao;
   }

   public void setJdbcDao(JdbcDao jdbcDao) {
      this.jdbcDao = jdbcDao;
   }
}
