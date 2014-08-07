package com.liusy.flow.common.identity.service.impl;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;

import com.liusy.common.model.SysRole;
import com.liusy.common.service.system.impl.SysRoleServiceImpl;
import com.liusy.core.exception.ServiceException;
import com.liusy.flow.common.identity.service.FlowRoleService;

public class FlowRoleServiceImpl extends SysRoleServiceImpl implements FlowRoleService{

	private IdentityService identityService;
	

	
	
	
	public IdentityService getIdentityService() {
		return identityService;
	}

	public void setIdentityService(IdentityService identityService) {
		this.identityService = identityService;
	}



	@Override
	public void createRole(SysRole sysRole) throws ServiceException {
		// TODO Auto-generated method stub
		super.createRole(sysRole);
		addActivitiRole(sysRole);
		
	}

	@Override
	public void updateRole(SysRole sysRole) throws ServiceException {
		// TODO Auto-generated method stub
		super.updateRole(sysRole);
		SysRole r = super.getRole(sysRole.getId());
		updateActivitiRole(r.getId().toString(),r.getRoleName());
	}



	@Override
	public void addActivitiRole(SysRole sysRole) {
		// TODO Auto-generated method stub
	    if (identityService.createGroupQuery().groupId(sysRole.getId().toString()).count() == 0) {
	        Group newGroup = identityService.newGroup(sysRole.getId().toString());
	        newGroup.setName(sysRole.getRoleName());
	        newGroup.setType("assignment");
	        identityService.saveGroup(newGroup);
	      }
	}

	@Override
	public void deleteActivitiRole(String userid) {
		
	}
	
	
	@Override
	public void updateActivitiRole(String userid,String name) {
		
		jdbcDao.getJdbcTemplate().execute("update act_id_group set name_='"+name+"' where id_='"+userid+"'");
	}
	
	
	
}
