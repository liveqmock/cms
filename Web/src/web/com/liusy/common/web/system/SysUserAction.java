package com.liusy.common.web.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.liusy.common.model.SysDept;
import com.liusy.common.model.SysOrg;
import com.liusy.common.model.SysResource;
import com.liusy.common.model.SysRole;
import com.liusy.common.model.SysUser;
import com.liusy.common.service.system.SysDeptService;
import com.liusy.common.service.system.SysOrgService;
import com.liusy.common.service.system.SysResourceService;
import com.liusy.common.service.system.SysRoleService;
import com.liusy.common.service.system.SysUserService;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.ServiceException;
import com.liusy.core.util.ConvertUtil;
import com.liusy.core.web.UserSession;
import com.liusy.core.web.action.BaseAction;
import com.liusy.core.web.form.QueryForm;

public class SysUserAction extends BaseAction {

   private final Log log = LogFactory.getLog(SysUserAction.class);

   @Override
   public String doExecute() throws Exception {
      String forward = "";
      String action = form.getAction();

      if (action == null) action = LIST;
      if (log.isDebugEnabled()) log.debug("action:" + action);
      try {
         if (LIST.equalsIgnoreCase(action)) forward = listUser(); // 打开查询列表页面
         else if (ADD.equalsIgnoreCase(action)) forward = addUser();// 打开增加页面
         else if (SAVE.equalsIgnoreCase(action)) forward = saveUser();// 保存增加数据
         else if (EDIT.equalsIgnoreCase(action)) forward = editUser();// 打开修改页面
         else if (UPDATE.equalsIgnoreCase(action)) forward = updateUser();// 保存修改数据
         else if (DELETE.equalsIgnoreCase(action)) forward = deleteUser();// 删除
         else if (VIEW.equalsIgnoreCase(action)) forward = viewUser();// 查看用户
         else if ("START".equalsIgnoreCase(action)) forward = startUser();// 启用
         else if ("STOP".equalsIgnoreCase(action)) forward = stopUser();// 暂停
         else if ("MYPWD".equalsIgnoreCase(action)) forward = pwdMyUser();// 修改用户密码
         else if ("SAVEMYPWD".equalsIgnoreCase(action)) forward = saveMyPwd();// 保存密码
         else if ("PWD".equalsIgnoreCase(action)) forward = pwdUser();// 重置用户密码
         else if ("SAVEPWD".equalsIgnoreCase(action)) forward = savePwd();// 保存密码
         else if ("CHECKUSER".equalsIgnoreCase(action)) forward = checkUser();// 检测用户是否可以分配权限
         else if ("RIGHTS".equalsIgnoreCase(action)) forward = userRights();// 分配用户权限
         else if ("SAVERIGHTS".equalsIgnoreCase(action)) forward = saveRights();// 保存权限
         else forward = ERROR;
      } catch (Exception e) {// 其他系统出错
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         forward = ERROR;
      }
      return forward;
   }

   public String listUser() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'listUser' method");
      try {
         initForm(form, LIST);

         PageQuery pq = form.getQuery() == null ? new PageQuery() : form.getQuery();
         pq = sysUserService.queryUser(pq);
         form.setQuery(pq);
         List<Map<String, Object>> listUser = pq.getRecordSet();
         if (listUser != null) {
            List<Map<String, Object>> listmap = new ArrayList<Map<String, Object>>();
            for (int i = 0; i < listUser.size(); i++) {
               Map<String, Object> user = listUser.get(i);
               String us = findCodeName(form, "USER_STATUS", user.get("status").toString());

               Map<String, Object> map = new HashMap<String, Object>();
               map.put("id", user.get("id"));
               String link = "^javascript:view(" + user.get("id") + ");^_self";
               map.put("data", new Object[] { user.get("id"), user.get("name") + link, user.get("account"), user.get("orgname"),
                     user.get("deptname"), us, user.get("remark") });
               listmap.add(map);
            }
            JSONArray jsonObject = JSONArray.fromObject(listmap);
            userList = jsonObject.toString();
         }
         else userList = "{}";
      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
      return LIST;
   }

   public String addUser() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'addUser' method");

      try {
         initForm(form, ADD);
         return ADD;
      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
   }

   public String saveUser() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'saveUser' method");

      try {
         SysUser sysUser = new SysUser();
         ConvertUtil.mapToObject(sysUser, form.getRecord(), false);
         sysUser.setUpdatedate(new Date());
         String roleIds = form.getRecord().get("roleIds");
         sysUserService.createUser(sysUser, roleIds);
         return returnForward(RETURN_NORMAL);
      } catch (ServiceException e) {
         addMessage(form, e.getMessage());
         initForm(form, ADD);
         return ADD;
      } catch (Exception e) {
         e.printStackTrace();
         addMessage(form, "保存操作失败!");
         initForm(form, ADD);
         return ADD;
      }
   }
   
   public String pwdMyUser() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'pwdMyUser' method");

      try {
         form.getRecord().put(SysUser.PROP_ID, currentUser.getUserId());
         return "MYPWD";
      } catch (ServiceException e) {
         request.put("errMsg", e.getMessage());
         return ERROR;
      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
   }
   
   public String pwdUser() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'pwdUser' method");

      try {
         form.getRecord().put(SysUser.PROP_ID, ids);
         return "PWD";
      } catch (ServiceException e) {
         request.put("errMsg", e.getMessage());
         return ERROR;
      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
   }

   public String saveMyPwd() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'saveMyPwd' method");

      try {
         
         int userid = new Integer(form.getRecord().get("id"));
         sysUserService.saveMyPwd(userid, form.getRecord().get("oldPwd"), form.getRecord().get("pwd"));

         return returnForward(RETURN_NORMAL);
      } catch (ServiceException e) {
         addMessage(form, e.getMessage());
         return "MYPWD";
      } catch (Exception e) {
         e.printStackTrace();
         addMessage(form, "保存操作失败!");
         return "MYPWD";
      }
   }
   
   public String savePwd() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'savePwd' method");

      try {
         int userid = new Integer(form.getRecord().get("id"));
         sysUserService.saveUserPwd(userid, form.getRecord().get("pwd"));

         return returnForward(RETURN_NORMAL);
      } catch (ServiceException e) {
         addMessage(form, e.getMessage());
         return "PWD";
      } catch (Exception e) {
         e.printStackTrace();
         addMessage(form, "保存操作失败!");
         return "PWD";
      }
   }

   public String editUser() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'editUser' method");

      try {
         int userId = new Integer(ids);
         SysUser sysUser = (SysUser) sysUserService.getUser(userId);
         ConvertUtil.objectToMap(form.getRecord(), sysUser);

         List<SysRole> roles = sysUserService.findUserRoles(userId);

         String roleIds = "";
         String roleNames = "";
         for (int i = 0; i < roles.size(); i++) {
            SysRole sur = roles.get(i);
            roleIds += sur.getId() + ";";
            roleNames += sur.getRoleName() + ";";
         }
         form.getRecord().put("roleIds", roleIds);
         form.getRecord().put("roleNames", roleNames);

         initForm(form, EDIT);
         return EDIT;
      } catch (ServiceException e) {
         request.put("errMsg", e.getMessage());
         return ERROR;
      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
   }

   public String updateUser() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'updateUser' method");

      try {
         form.getRecord().put(SysUser.PROP_UPDATEDATE, ConvertUtil.currentDate());
         sysUserService.updateUser(form.getRecord());

         return returnForward(RETURN_NORMAL);
      } catch (ServiceException e) {
         addMessage(form, e.getMessage());
         initForm(form, EDIT);
         return EDIT;
      } catch (Exception e) {
         e.printStackTrace();
         addMessage(form, "保存操作失败!");
         initForm(form, EDIT);
         return EDIT;
      }
   }

   public String startUser() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'startUser' method");
      try {
         if (ids != null && ids.trim().length() > 0) {
            sysUserService.startUsers(parseId(ids.split(",")));
         }
      } catch (ServiceException e) {
         addMessage(form, e.getMessage());
      } catch (Exception e) {
         e.printStackTrace();
         addMessage(form, "启用操作失败!");
      }
      return listUser();
   }

   public String stopUser() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'stopUser' method");
      try {
         if (ids != null && ids.trim().length() > 0) {
            sysUserService.stopUsers(parseId(ids.split(",")));
         }
      } catch (ServiceException e) {
         addMessage(form, e.getMessage());
      } catch (Exception e) {
         e.printStackTrace();
         addMessage(form, "暂停操作失败!");
      }
      return listUser();
   }

   public String deleteUser() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'deleteUser' method");
      try {
         if (ids != null && ids.trim().length() > 0) {
            sysUserService.deleteUsers(parseId(ids.split(",")));
         }
      } catch (ServiceException e) {
         addMessage(form, e.getMessage());
      } catch (Exception e) {
         e.printStackTrace();
         addMessage(form, "删除操作失败!");
      }
      return listUser();
   }

   public String viewUser() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'viewUser' method");

      try {
         int userId = new Integer(ids);
         SysUser sysUser = (SysUser) sysUserService.getUser(userId);
         ConvertUtil.objectToMap(form.getRecord(), sysUser);

         List<SysRole> roles = sysUserService.findUserRoles(userId);

         String roleIds = "";
         String roleNames = "";
         for (int i = 0; i < roles.size(); i++) {
            SysRole sur = roles.get(i);
            roleIds += sur.getId() + ";";
            roleNames += sur.getRoleName() + ";";
         }
         form.getRecord().put("roleIds", roleIds);
         form.getRecord().put("roleNames", roleNames);

         initForm(form, VIEW);
         return VIEW;
      } catch (ServiceException e) {
         request.put("errMsg", e.getMessage());
         return ERROR;
      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
   }

   public String checkUser() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'checkUser' method");
      HttpServletResponse response = ServletActionContext.getResponse();
      response.setContentType("text/xml;charset=UTF-8");
      response.setHeader("Cache_Control", "no-cache");

      try {
         SysUser user = sysUserService.getUser(new Integer(ids));

         if (SysUserService.SYSUSER.equals(user.getAccountType())) response.getWriter().write("系统用户不能分配权限。");
      } catch (Exception e) {
         e.printStackTrace();
         response.getWriter().write("系统错误。");
      }
      response.getWriter().close();
      return null;
   }

   public String userRights() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'rightsUser' method");
      form.getRecord().put("id", ids);

      try {
         List<SysResource> list = (List<SysResource>) sysResourceService.findAll();
         List<Map<String, String>> listmap = new ArrayList<Map<String, String>>();
         for (SysResource resource : list) {
            Map<String, String> map = new HashMap<String, String>();
            ConvertUtil.objectToMap(map, resource);
            listmap.add(map);
         }

         rights = (List<SysResource>) sysUserService.findUserResources(new Integer(ids));

         return "RIGHTS";
      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
   }

   public String saveRights() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'saveRights' method");

      try {
         String id = form.getRecord().get("id");
         String rights = form.getRecord().get("rights");

         sysUserService.saveUserRights(new Integer(id), rights);
         return returnForward(RETURN_NORMAL);
      } catch (Exception e) {
         e.printStackTrace();
         addMessage(form, "保存权限操作失败!");
         return "RIGHTS";
      }
   }

   private String getQueryString(PageQuery pageQuery) {
      StringBuffer buffer = new StringBuffer();
      Map fields = pageQuery.getParameters();
      String str = (String) fields.get("userAccount");
      if (str != null && !"".equals(str)) {
         if (str.contains("%")) buffer.append(" and " + SysUser.COL_USER_ACCOUNT + "  like '" + str + "'");
         else buffer.append(" and " + SysUser.COL_USER_ACCOUNT + "  like '%" + str + "%'");
      }
      str = (String) fields.get("userName");
      if (str != null && !"".equals(str)) {
         buffer.append(" and " + SysUser.COL_USER_NAME + "  like '%" + str + "%'");
      }
      str = (String) fields.get("userStatus");
      if (str != null && !"".equals(str)) {
         buffer.append(" and " + SysUser.COL_USER_STATUS + "='" + str + "'");
      }
      str = (String) fields.get("deptId");
      if (str != null && !"".equals(str)) {
         buffer.append(" and " + SysUser.COL_DEPT_ID + "=" + str + "");
      }
      return buffer.toString();
   }

   private void initForm(QueryForm queryForm, String action) {
      setCode(queryForm, "USER_STATUS");
      queryForm.getRecord().put("orgId", "1");
      List<SysDept> depts = sysDeptService.findAllDept();// findSysDepts(queryForm.getRecord().get("orgId"));
      setCode(queryForm, "depts", depts, SysDept.PROP_DEPT_NAME, SysDept.PROP_ID, true);
      List<SysOrg> orgs = sysOrgService.findSysOrgAll();
      setCode(queryForm, "orgs", orgs, SysOrg.PROP_ORG_NAME, SysOrg.PROP_ID, true);

      if (ADD.equalsIgnoreCase(action)) {
         queryForm.getRecord().put("userStatus", "1");
         int max_order = sysUserService.maxOrder() + 1;
         queryForm.getRecord().put("orderNo", String.valueOf(max_order));
      }
      else if (VIEW.equalsIgnoreCase(action)) {
         queryForm.getRecord().put("orgName", findCodeName(queryForm, "orgs", queryForm.getRecord().get("orgId")));
         queryForm.getRecord().put("deptName", findCodeName(queryForm, "depts", queryForm.getRecord().get("deptId")));
         queryForm.getRecord().put("adminLevelName", findCodeName(queryForm, "ADMIN_LEVEL", queryForm.getRecord().get("adminLevel")));
         queryForm.getRecord().put("userStatusName", findCodeName(queryForm, "USER_STATUS", queryForm.getRecord().get("userStatus")));
         String remark = queryForm.getRecord().get("remark");
         if (remark != null) {
            // remark = remark.replace(" ", "&nbsp;");
            // System.out.println(remark);
            remark = remark.replace("\r", "<br>");
            queryForm.getRecord().put("remark", remark);
         }
      }
   }

   private java.io.Serializable[] parseId(String[] ids) throws Exception {
      if (ids == null || ids.length == 0) {
         throw new Exception("非法操作！");
      }
      java.io.Serializable id[] = null;
      try {
         id = new Integer[ids.length];
         for (int i = 0; i < ids.length; i++) {
            id[i] = new Integer(ids[i]);
         }
      } catch (Exception e) {
         id = ids;
      }
      return id;
   }

   private SysUserService     sysUserService;
   private SysDeptService     sysDeptService;
   private SysOrgService      sysOrgService;
   private SysResourceService sysResourceService;
   private String             userList;
   private List               rights;

   public void setSysUserService(SysUserService sysUserService) {
      this.sysUserService = sysUserService;
   }

   public void setSysDeptService(SysDeptService sysDeptService) {
      this.sysDeptService = sysDeptService;
   }

   public void setSysOrgService(SysOrgService sysOrgService) {
      this.sysOrgService = sysOrgService;
   }

   public void setSysResourceService(SysResourceService sysResourceService) {
      this.sysResourceService = sysResourceService;
   }

   public String getUserList() {
      return userList;
   }

   public void setRights(List rights) {
      this.rights = rights;
   }

   public List getRights() {
      return rights;
   }

}
