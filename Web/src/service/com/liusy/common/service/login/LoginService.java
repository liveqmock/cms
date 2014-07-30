package com.liusy.common.service.login;

import com.liusy.core.exception.ServiceException;
import com.liusy.core.web.UserSession;

public interface LoginService {
   public UserSession login(String accountName, String password) throws ServiceException;
}
