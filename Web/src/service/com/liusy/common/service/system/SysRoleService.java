package com.liusy.common.service.system;

import java.io.Serializable;
import java.util.List;

import com.liusy.common.model.SysResource;
import com.liusy.common.model.SysRole;
import com.liusy.common.model.SysUser;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.ServiceException;

public interface SysRoleService {
	
	public static String	SYSROLE	= "1";
	
	public SysRole getRole(Serializable id) throws ServiceException;
	
	public void createRole(SysRole sysRole) throws ServiceException;

	public void updateRole(SysRole sysRole) throws ServiceException;

	public void deleteRole(Serializable id) throws ServiceException;

	public PageQuery querySysRole(PageQuery pageQuery) throws ServiceException;

	public void deleteRoles(Serializable[] ids) throws ServiceException;
	
	public void startRoles(Serializable[] ids) throws ServiceException;

	public void stopRoles(Serializable[] ids) throws ServiceException;
	
	public List<SysRole> findAllRole() throws ServiceException;
	
   //查询一个角色具有的权限
   public List<SysResource> findRoleRights(Serializable id) throws ServiceException;
   
   //查询一个角色拥有的用户
   public List<SysUser>  findRoleUsers(Serializable id) throws ServiceException;
	
	//保存角色具有的权限
	public void saveRights(Integer id, String rights) throws ServiceException;

}
