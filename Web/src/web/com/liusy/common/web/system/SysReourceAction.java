package com.liusy.common.web.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.liusy.common.model.SysResource;
import com.liusy.common.service.system.SysResourceService;
import com.liusy.common.service.system.SysRoleService;
import com.liusy.common.service.system.SysUserService;
import com.liusy.core.util.ConvertUtil;
import com.liusy.core.web.action.BaseAction;

public class SysReourceAction extends BaseAction {

   private final Log log = LogFactory.getLog(SysReourceAction.class);

   @Override
   public String doExecute() throws Exception {
      String forward = "";
      String action = form.getAction();

      if (action == null) action = LIST;
      if (log.isDebugEnabled()) log.debug("action:" + action);
      try {
         if (LIST.equalsIgnoreCase(action)) forward = listReource(); // 打开查询列表页面
         else if ("USERRIGHTS".equalsIgnoreCase(action)) forward = userRights();// 分配用户权限
         else if ("ROLERIGHTS".equalsIgnoreCase(action)) forward = roleRights();// 分配角色权限
      } catch (Exception e) {// 其他系统出错
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         forward = ERROR;
      }
      return forward;
   }

   public String listReource() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'listReource' method");

      try {
         List<SysResource> list = (List<SysResource>) sysResourceService.findAll();
         List<Map<String, String>> listmap = new ArrayList<Map<String, String>>();
         for (SysResource resource : list) {
            Map<String, String> map = new HashMap<String, String>();
            ConvertUtil.objectToMap(map, resource);
            listmap.add(map);
         }
         return "RESOURCES";
      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
   }

   public String roleRights() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'roleRights' method");

      try {
         sysReources = (List<SysResource>) sysResourceService.findAll();
         rights = (List<SysResource>)sysRoleService.findRoleRights(new Integer(id));
         form.getRecord().put("id", id);
         return "ROLERIGHTS";
      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
   }

   public String userRights() throws Exception {
      if (log.isDebugEnabled()) log.debug("Entering 'rightsUser' method");

      try {
         sysReources = (List<SysResource>) sysResourceService.findAll();
         rights = (List<SysResource>) sysUserService.findUserResources(new Integer(id));
         form.getRecord().put("id", id);
         return "USERRIGHTS";
      } catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         return ERROR;
      }
   }

   private SysUserService     sysUserService;
   private SysRoleService     sysRoleService;
   private SysResourceService sysResourceService;
   private List<SysResource>  sysReources;
   private String             id;
   private List<SysResource>  rights;

   public void setSysUserService(SysUserService sysUserService) {
      this.sysUserService = sysUserService;
   }

   public void setSysRoleService(SysRoleService sysRoleService) {
      this.sysRoleService = sysRoleService;
   }

   public void setSysResourceService(SysResourceService sysResourceService) {
      this.sysResourceService = sysResourceService;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setRights(List<SysResource> rights) {
      this.rights = rights;
   }

   public List<SysResource> getRights() {
      return rights;
   }

   public List<SysResource> getSysReources() {
      return sysReources;
   }

   public void setSysReources(List<SysResource> sysReources) {
      this.sysReources = sysReources;
   }

}
