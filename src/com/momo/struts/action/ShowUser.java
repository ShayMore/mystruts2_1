package com.momo.struts.action;

import java.util.List;

import com.momo.struts.domain.User;
import com.momo.struts.service.UserService;
import com.momo.struts.service.UserServiceImpl;

public class ShowUser {
	
	private List<User> userList;
	
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	private UserService userService = new UserServiceImpl();
	
	public String execute() {
		userList = userService.getUsers();
		return "fail";
	}

}
