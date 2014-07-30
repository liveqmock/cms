package com.liusy.common.web.login;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.liusy.common.service.login.LoginService;
import com.liusy.core.util.Const;
import com.liusy.core.web.UserSession;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction implements Action {

   private static final long serialVersionUID = 1L;

   private String            action;

   private String            userName;

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   private String password;

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getAction() {
      return action;
   }

   public void setAction(String action) {
      this.action = action;
   }

   private LoginService        loginService;
   private Map<String, Object> request;
   private Map<String, Object> session;

   public LoginService getLoginService() {
      return loginService;
   }

   public void setLoginService(LoginService loginService) {
      this.loginService = loginService;
   }

   public void setSession(Map<String, Object> session) {
      this.session = session;
   }

   @SuppressWarnings("unchecked")
   public String execute() throws Exception {
      String forward = null;
      ActionContext ctx = ActionContext.getContext();
      request = (Map<String, Object>) ctx.get("request");
      session = ctx.getSession();
      try {
         if (action == null || "".equals(action)) {
            forward = "LOGIN";
         }
         else if ("logout".equalsIgnoreCase(action)) {
            session.remove(Const.SESSION);
            forward = "LOGIN";
         }
         else if ("login".equalsIgnoreCase(action)) {
            validateLogin();
            forward = "SUCESS";
         }
      }
      catch (Exception e) {
         e.printStackTrace();
         request.put("errMsg", e.getMessage());
         forward = "LOGIN";
      }
      return forward;
   }

   public void validateLogin() throws Exception {
      UserSession userSession = loginService.login(userName, password);
      if (userSession != null) {
         session.put(Const.SESSION, userSession);
      }
      else {
         throw new Exception("用户名或密码错误");
      }
   }
}
