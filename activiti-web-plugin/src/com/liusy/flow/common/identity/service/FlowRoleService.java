package com.liusy.flow.common.identity.service;

import com.liusy.common.model.SysRole;
import com.liusy.common.model.SysUser;
import com.liusy.common.service.system.SysRoleService;

public interface FlowRoleService extends SysRoleService{
	
	public void addActivitiRole(SysRole sysRole);
	public void deleteActivitiRole(String roleid);
	public void updateActivitiRole(String userid, String name);
	
}
