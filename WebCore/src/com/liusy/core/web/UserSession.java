package com.liusy.core.web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: 数据管理中心</p>
 * 
 * <p>Description:Session对象</p>
 * 
 * <p>Copyright: Copyright (c) 2009-2011</p>
 * 
 * <p>Company: </p>
 * 
 * @author liusy
 * @version 1.0
 */

public class UserSession {

   private String userId;// 用户表主键

   private String userCode;// 用户代码

   private String userName;// 用户姓名

   private String accountName;// 用户账号

   private String address;//

   private String zipCode;//

   private String telephone;//

   private String moblie;//

   private String email;//

   private String description;//

   private String orgId;// 单位表主键

   private String orgCode;// 单位编号

   private String orgName;// 单位名称

   private String orgShortName;// 单位简称

   private String orgNumber;// 单位树代码

   private String deptId;// 部门表主键

   private String deptCode;// 部门编号

   private String deptName;// 部门名称

   private String deptShortName;// 部门简称

   private String deptNumber;// 部门树代码

   private Date loginTime;// 登录时间

   // 用户包含角色
   // 角色表主键/角色名称
   private Map<Integer, String> roles = new HashMap<Integer, String>();

   // 用户包含功能模块
   // 功能表主键/功能名称
   private Map<Integer, String> modules = new HashMap<Integer, String>();

   // 用户包含功能模块
   // 权限表主键/权限名称
   private Map<String, String> privileges = new HashMap<String, String>();

   // 用户所属组
   // 用户组表主键/用户组名称
   private Map<Integer, String> groups = new HashMap<Integer, String>();

   public Map<Integer, String> getGroups() {
      return groups;
   }

   public void setGroups(Map<Integer, String> groups) {
      this.groups = groups;
   }

   public boolean hasRole(String key) {
      return roles.containsKey(key);
   }

   public boolean hasModule(String key) {
      return modules.containsKey(key);
   }

   public boolean hasPrivilege(String key) {
      return privileges.containsKey(key);
   }

   public String getAccountName() {
      return accountName;
   }

   public void setAccountName(String accountName) {
      this.accountName = accountName;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getDeptCode() {
      return deptCode;
   }

   public void setDeptCode(String deptCode) {
      this.deptCode = deptCode;
   }

   public String getDeptId() {
      return deptId;
   }

   public void setDeptId(String deptId) {
      this.deptId = deptId;
   }

   public String getDeptName() {
      return deptName;
   }

   public void setDeptName(String deptName) {
      this.deptName = deptName;
   }

   public String getDeptNumber() {
      return deptNumber;
   }

   public void setDeptNumber(String deptNumber) {
      this.deptNumber = deptNumber;
   }

   public String getDeptShortName() {
      return deptShortName;
   }

   public void setDeptShortName(String deptShortName) {
      this.deptShortName = deptShortName;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Date getLoginTime() {
      return loginTime;
   }

   public void setLoginTime(Date loginTime) {
      this.loginTime = loginTime;
   }

   public String getMoblie() {
      return moblie;
   }

   public void setMoblie(String moblie) {
      this.moblie = moblie;
   }

   public Map<Integer, String> getModules() {
      return modules;
   }

   public void setModules(Map<Integer, String> modules) {
      this.modules = modules;
   }

   public String getOrgCode() {
      return orgCode;
   }

   public void setOrgCode(String orgCode) {
      this.orgCode = orgCode;
   }

   public String getOrgId() {
      return orgId;
   }

   public void setOrgId(String orgId) {
      this.orgId = orgId;
   }

   public String getOrgName() {
      return orgName;
   }

   public void setOrgName(String orgName) {
      this.orgName = orgName;
   }

   public String getOrgNumber() {
      return orgNumber;
   }

   public void setOrgNumber(String orgNumber) {
      this.orgNumber = orgNumber;
   }

   public String getOrgShortName() {
      return orgShortName;
   }

   public void setOrgShortName(String orgShortName) {
      this.orgShortName = orgShortName;
   }

   public Map<String, String> getPrivileges() {
      return privileges;
   }

   public void setPrivileges(Map<String, String> privileges) {
      this.privileges = privileges;
   }

   public Map<Integer, String> getRoles() {
      return roles;
   }

   public void setRoles(Map<Integer, String> roles) {
      this.roles = roles;
   }

   public String getTelephone() {
      return telephone;
   }

   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }

   public String getUserCode() {
      return userCode;
   }

   public void setUserCode(String userCode) {
      this.userCode = userCode;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getZipCode() {
      return zipCode;
   }

   public void setZipCode(String zipCode) {
      this.zipCode = zipCode;
   }
}
