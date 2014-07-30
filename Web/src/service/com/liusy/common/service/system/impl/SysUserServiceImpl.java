package com.liusy.common.service.system.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.liusy.common.dao.SysResourceDao;
import com.liusy.common.dao.SysResourceUserDao;
import com.liusy.common.dao.SysRoleDao;
import com.liusy.common.dao.SysUserDao;
import com.liusy.common.dao.SysUserRoleDao;
import com.liusy.common.model.SysResource;
import com.liusy.common.model.SysResourceUser;
import com.liusy.common.model.SysRole;
import com.liusy.common.model.SysUser;
import com.liusy.common.model.SysUserRole;
import com.liusy.common.service.system.SysUserService;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.DAOException;
import com.liusy.core.exception.ServiceException;
import com.liusy.core.service.impl.BaseServiceImpl;
import com.liusy.core.util.Const;
import com.liusy.core.util.ConvertUtil;

public class SysUserServiceImpl extends BaseServiceImpl implements SysUserService {

   private SysUserDao         sysUserDao;
   private SysUserRoleDao     sysUserRoleDao;
   private SysResourceUserDao sysResourceUserDao;
   private SysRoleDao         sysRoleDao;
   private SysResourceDao     sysResourceDao;

   public void setSysUserDao(SysUserDao sysUserDao) {
      this.sysUserDao = sysUserDao;
   }

   public void setSysUserRoleDao(SysUserRoleDao sysUserRoleDao) {
      this.sysUserRoleDao = sysUserRoleDao;
   }

   public void setSysResourceUserDao(SysResourceUserDao sysResourceUserDao) {
      this.sysResourceUserDao = sysResourceUserDao;
   }

   public void setSysResourceDao(SysResourceDao sysResourceDao) {
      this.sysResourceDao = sysResourceDao;
   }

   public void setSysRoleDao(SysRoleDao sysRoleDao) {
      this.sysRoleDao = sysRoleDao;
   }

   public SysUser getUser(Serializable id) throws ServiceException {
      try {
         return sysUserDao.get(id);
      } catch (DAOException e) {
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public void createUser(SysUser sysUser, String roleIds) throws ServiceException {
      try {
         List<SysUser> list = sysUserDao.findByField(SysUser.PROP_USER_ACCOUNT, sysUser.getUserAccount());
         if (list != null && list.size() > 0) {
            throw new ServiceException("帐号名:[" + sysUser.getUserAccount() + "]已经存在，不能使用。");
         }

         Integer userId = (Integer) sysUserDao.save(sysUser);

         String[] ids = roleIds.split(";");
         for (int i = 0; i < ids.length; i++) {
            if (ids[i].trim().equals("")) continue;
            SysUserRole sru = new SysUserRole();
            sru.setUserId(userId);
            sru.setRoleId(new Integer(ids[i]));
            sysUserRoleDao.save(sru);
         }
      } catch (DAOException e) {
         throw new ServiceException("数据库操作错误。");
      } catch (ServiceException se) {
         throw se;
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public void updateUser(Map<String, String> user) throws ServiceException {
      try {
         Integer userId = Integer.valueOf(user.get(SysUser.PROP_ID));
         String uc = user.get(SysUser.PROP_USER_ACCOUNT);
         List<SysUser> list = sysUserDao.findByField(SysUser.PROP_USER_ACCOUNT, uc);
         if (list != null) {
            for (int i = 0; i < list.size(); i++) {
               SysUser us = (SysUser) list.get(i);
               if (userId != us.getId().intValue()) {
                  throw new ServiceException("帐号名:[" + us.getUserAccount() + "]存在重复，不能使用。");
               }
            }
         }

         String roleIds = user.get("roleIds");
         String tmp = ";" + roleIds;
         SysUser tmpUser = sysUserDao.get(userId);
         String state = tmpUser.getUserStatus();
         String uName = tmpUser.getUserName();
         String uAcc = tmpUser.getUserAccount();

         ConvertUtil.mapToObject(tmpUser, user, true);
         if (SYSUSER.equals(tmpUser.getAccountType())) { // 系统固定的用户的信息不能修改账号、姓名和状态。
            tmpUser.setUserStatus(state);
            tmpUser.setUserName(uName);
            tmpUser.setUserAccount(uAcc);
         }
         sysUserDao.update(tmpUser);

         if (SYSUSER.equals(tmpUser.getAccountType())) return; // 系统固定的用户不能修改角色和权限。

         List<SysUserRole> userRoles = sysUserRoleDao.findByField(SysUserRole.PROP_USER_ID, userId);
         for (int i = 0; i < userRoles.size(); i++) {
            SysUserRole sru = (SysUserRole) userRoles.get(i);
            if (tmp.indexOf(";" + sru.getRoleId().toString() + ";") < 0) {
               // roleIds中不包含的角色，删除。
               sysUserRoleDao.delete(sru);
            }
            else {
               // roleIds中包含的角色，不处理。
               tmp = tmp.replace(";" + sru.getRoleId().toString() + ";", ";");//
            }
         }

         // 余下的是新增的角色，增加。
         String[] newRoles = tmp.split(";");
         for (int i = 0; i < newRoles.length; i++) {
            String r = newRoles[i];
            if (r == null || r.equals("")) continue;
            SysUserRole sru = new SysUserRole();
            sru.setUserId(userId);
            sru.setRoleId(new Integer(r));
            sysUserRoleDao.save(sru);
         }
      } catch (DAOException de) {
         throw new ServiceException("数据库操作错误。");
      } catch (ServiceException se) {
         throw se;
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }

   }

   public void deleteUsers(Serializable[] ids) throws ServiceException {
      try {
         for (int i = 0; i < ids.length; i++) {
            SysUser tmp = sysUserDao.get(ids[i]);
            if (SYSUSER.equals(tmp.getAccountType())) {
               throw new ServiceException("系统用户不能删除。");
            }
         }
         for (int i = 0; i < ids.length; i++) {
            // 删除用户具有的角色
            sysUserRoleDao.deleteByField(SysUserRole.PROP_USER_ID, ids[i]);
            // 删除用户具有的权限
            sysResourceUserDao.deleteByField(SysResourceUser.PROP_USER_ID, ids[i]);
         }
         // 删除用户
         sysUserDao.deleteAll(ids);
      } catch (DAOException e) {
         throw new ServiceException("数据库操作错误。");
      } catch (ServiceException se) {
         throw se;
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public List<Map<String, Object>> queryAllUser() throws ServiceException {
      try {
         return jdbcDao.queryBySqlId("userList");
      } catch (DAOException de) {
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   private void createSqlFilter(PageQuery page) {
      String paras = "";
      Map<String, String> map = page.getParameters();

      String userAccount = map.get("userAccount");
      if (userAccount != null && userAccount.trim().length() > 0) {
         paras += "u.user_account like '%" + userAccount.trim() + "%'";
      }

      String userName = map.get("userName");
      if (userName != null && userName.trim().length() > 0) {
         if (paras.length() > 0) paras += " and ";
         paras += "u.user_name like '%" + userName.trim() + "%'";
      }

      String deptId = map.get("deptId");
      if (deptId != null && deptId.trim().length() > 0) {
         if (paras.length() > 0) paras += " and ";
         paras += "u.dept_id=" + deptId.trim();
      }

      String userStatus = map.get("userStatus");
      if (userStatus != null && userStatus.trim().length() > 0) {
         if (paras.length() > 0) paras += " and ";
         paras += "u.user_status='" + userStatus.trim() + "'";
      }
      if (paras.length() > 0) page.getParameters().put("paras", paras);
   }

   public PageQuery queryUser(PageQuery page) throws ServiceException {
      try {
         createSqlFilter(page);
         return jdbcDao.queryBySqlId("userList", page);
      } catch (DAOException de) {
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public List<SysUser> findAllUser() throws ServiceException {
      try {
         return sysUserDao.findAll();
      } catch (DAOException de) {
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public void saveUserRights(Serializable id, String rights) throws ServiceException {
      String tmp = "," + rights + ",";
      try {
         SysUser sysUser = sysUserDao.get(id);
         if (sysUser == null) throw new ServiceException("该用户不存在。");
         List<SysResourceUser> userRights = sysResourceUserDao.findByField(SysResourceUser.PROP_USER_ID, id);
         for (int i = 0; i < userRights.size(); i++) {
            SysResourceUser sru = (SysResourceUser) userRights.get(i);
            if (tmp.indexOf("," + sru.getResId().toString() + ",") < 0) {
               sysResourceUserDao.delete(sru);
            }
            else {
               tmp = tmp.replace("," + sru.getResId().toString() + ",", ",");// 放弃没有变化的权限
            }
         }
         String[] newRights = tmp.split(",");
         for (int i = 0; i < newRights.length; i++) {
            String r = newRights[i];
            if (r == null || r.equals("")) continue;
            SysResourceUser sru = new SysResourceUser();// 增加权限
            sru.setUserId(sysUser.getId());
            sru.setResId(new Integer(r));
            sysResourceUserDao.save(sru);
         }
      } catch (DAOException e) {
         throw new ServiceException("数据库操作错误。");
      } catch (ServiceException se) {
         throw se;
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }

   }

   public List<SysRole> findUserRoles(Serializable id) throws ServiceException {
      try {
         List<SysUserRole> list = sysUserRoleDao.findByField(SysUserRole.PROP_USER_ID, id);
         List<Serializable> roleIds = new ArrayList<Serializable>();
         for (SysUserRole sur : list) {
            roleIds.add((Serializable) sur.getRoleId());
         }
         return sysRoleDao.findAll(roleIds.toArray(new Serializable[roleIds.size()]));
      } catch (DAOException de) {
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public int maxOrder() throws ServiceException {
      Integer max_order;
      List list = sysUserDao.findByHql("select max(user.orderNo) from SysUser as user");
      if (list != null && !list.isEmpty()) {
         max_order = ((Integer) list.get(0));
         if (max_order == null) {
            max_order = 0;
         }
      }
      else {
         max_order = 0;
      }
      return max_order;
   }

   private void setUserStatus(Serializable[] ids, String status) throws ServiceException {
      try {
         for (int i = 0; i < ids.length; i++) {
            SysUser tmp = sysUserDao.get(ids[i]);
            if (SYSUSER.equals(tmp.getAccountType())) {
               throw new ServiceException("系统用户不能改变状态。");
            }
         }
         List<SysUser> list = sysUserDao.findAll(ids);
         for (SysUser su : list) {
            su.setUserStatus(status);
            sysUserDao.update(su);
         }
      } catch (ServiceException se) {
         throw se;
      } catch (DAOException de) {
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public void startUsers(Serializable[] ids) throws ServiceException {
      setUserStatus(ids, String.valueOf((Const.CODE_YES)));
   }

   public void stopUsers(Serializable[] ids) throws ServiceException {
      setUserStatus(ids, String.valueOf((Const.CODE_NO)));
   }

   public void saveMyPwd(Serializable id, String oldPwd, String pwd) throws ServiceException {
      try {
         SysUser su = sysUserDao.get(id);
         if (!oldPwd.equals(su.getUserPassword())) {
            throw new ServiceException("旧密码不对，不能修改密码。");
         }
         su.setUserPassword(pwd);
         sysUserDao.update(su);
      } catch (ServiceException se) {
         throw se;
      } catch (DAOException de) {
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public void saveUserPwd(Serializable id, String pwd) throws ServiceException {
      try {
         SysUser su = sysUserDao.get(id);
         su.setUserPassword(pwd);
         sysUserDao.update(su);
      } catch (DAOException de) {
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }

   public List<SysResource> findUserResources(Serializable id) throws ServiceException {
      try {
         List<SysResourceUser> list = sysResourceUserDao.findByField(SysResourceUser.PROP_USER_ID, id);
         List<Serializable> resourceIds = new ArrayList<Serializable>();
         for (SysResourceUser sur : list) {
            resourceIds.add((Serializable) sur.getResId());
         }
         return sysResourceDao.findAll(resourceIds.toArray(new Serializable[resourceIds.size()]));
      } catch (DAOException de) {
         throw new ServiceException("数据库操作错误。");
      } catch (Exception e) {
         e.printStackTrace();
         throw new ServiceException("系统错误。");
      }
   }
}
