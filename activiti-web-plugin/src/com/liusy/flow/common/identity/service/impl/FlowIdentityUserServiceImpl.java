package com.liusy.flow.common.identity.service.impl;

import java.io.Serializable;
import java.util.Map;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;

import com.liusy.common.model.SysRole;
import com.liusy.common.model.SysUser;
import com.liusy.common.service.system.SysRoleService;
import com.liusy.common.service.system.impl.SysUserServiceImpl;
import com.liusy.core.exception.ServiceException;
import com.liusy.flow.common.identity.service.FlowIdentityUserService;
import com.liusy.flow.common.identity.service.FlowRoleService;

public class FlowIdentityUserServiceImpl extends SysUserServiceImpl  implements FlowIdentityUserService{


	private IdentityService identityService;
	
	private SysRoleService sysRoleService;
	

	public IdentityService getIdentityService() {
		return identityService;
	}

	public void setIdentityService(IdentityService identityService) {
		this.identityService = identityService;
	}



	public SysRoleService getSysRoleService() {
		return sysRoleService;
	}

	public void setSysRoleService(SysRoleService sysRoleService) {
		this.sysRoleService = sysRoleService;
	}

	@Override
	public void createUser(SysUser sysUser, String roleIds)
			throws ServiceException {
		super.createUser(sysUser, roleIds);
		addActivitiUser(sysUser, roleIds);

	}

	public void addActivitiUser(SysUser sysUser, String roleIds)
	{
		   if (identityService.createUserQuery().userId(sysUser.getUserAccount()).count() == 0) {
			      
			      // Following data can already be set by demo setup script
			      
			      User user = identityService.newUser(sysUser.getUserAccount());
			      user.setFirstName("");
			      user.setLastName(sysUser.getUserName());
			      user.setPassword(sysUser.getUserPassword());
			   //   user.setEmail(sysUser.get);
			      identityService.saveUser(user);
			      
			      
			      	String[] ids = roleIds.split(";");
			         for (int i = 0; i < ids.length; i++) {
			            if (ids[i].trim().equals("")) continue;
			            Group g = identityService.createGroupQuery().groupId(ids[i].trim()).singleResult();
			            SysRole r = sysRoleService.getRole(Integer.parseInt(ids[i]));
			            if(null==g)
			            {
			            	((FlowRoleService)sysRoleService).addActivitiRole(r);
			            }
			            	identityService.createMembership(sysUser.getUserAccount(),r.getRoleCode());
			         }
			         

			    }
			    
			    // Following data is not set by demo setup script
			      
			    // image
//			    if (imageResource != null) {
//			      byte[] pictureBytes = IoUtil.readInputStream(this.getClass().getClassLoader().getResourceAsStream(imageResource), null);
//			      Picture picture = new Picture(pictureBytes, "image/jpeg");
//			      identityService.setUserPicture(userId, picture);
//			    }
			      
			    // user info
//			    if (userInfo != null) {
//			      for(int i=0; i<userInfo.size(); i+=2) {
//			        identityService.setUserInfo(userId, userInfo.get(i), userInfo.get(i+1));
//			      }
//			    }
			    	}
	public void deleteActivitiUser(String userid)
	{
		jdbcDao.getJdbcTemplate().execute("delete from act_id_membership where user_id_='"+userid+"'");
		jdbcDao.getJdbcTemplate().execute("delete from act_id_user where id_='"+userid+"'");
	}
	public void saveActivitiUserPwd(String userid,String pwd)
	{
		jdbcDao.getJdbcTemplate().execute("update act_id_user set pwd_='"+pwd+"' where id_='"+userid+"'");
	}
	
	@Override
	public void updateUser(Map<String, String> user) throws ServiceException {
		SysUser u = super.getUser(Integer.parseInt(user.get(SysUser.PROP_ID)));
		super.updateUser(user);
		String roleIds = user.get("roleIds");
		deleteActivitiUser(u.getUserAccount());
		u = super.getUser(Integer.parseInt(user.get(SysUser.PROP_ID)));
		addActivitiUser(u,roleIds);
	}

	@Override
	public void deleteUsers(Serializable[] ids) throws ServiceException {
		super.deleteUsers(ids);
		SysUser u = null;
		for (int i = 0; i < ids.length; i++) {
			u = super.getUser(ids[i]);
			deleteActivitiUser(u.getUserAccount());
		}
	}
	@Override
	public void saveUserPwd(Serializable id, String pwd)
			throws ServiceException {
		super.saveUserPwd(id, pwd);
		SysUser u = super.getUser(id);
		saveActivitiUserPwd(u.getUserAccount(),pwd);
		
		
	}

	@Override
	public void saveMyPwd(Serializable id, String oldPwd, String pwd)
			throws ServiceException {
		super.saveMyPwd(id, oldPwd, pwd);
		SysUser u = super.getUser(id);
		saveActivitiUserPwd(u.getUserAccount(),pwd);
		
	}
	

}
