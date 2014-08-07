package com.liusy.flow.common.identity.service;

import com.liusy.common.model.SysUser;
import com.liusy.common.service.system.SysUserService;

public interface FlowIdentityUserService extends SysUserService {
	
	public void addActivitiUser(SysUser sysUser, String roleIds);
	public void deleteActivitiUser(String userid);
	public void saveActivitiUserPwd(String userid,String pwd);
	
}
