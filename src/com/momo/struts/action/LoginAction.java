package com.momo.struts.action;

import com.momo.struts.service.UserService;
import com.momo.struts.service.UserServiceImpl;

/**
 * 登录
 * @author MoYalan
 *
 */
public class LoginAction {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private UserService userService = new UserServiceImpl();
	
	public String execute(){
		boolean flag = userService.login(username, password);
		if(flag) return "success";
		return "fail";		
	}

}
