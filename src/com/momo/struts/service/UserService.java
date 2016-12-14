package com.momo.struts.service;

import java.util.List;

import com.momo.struts.domain.User;

public interface UserService {
	
	public boolean saveUser(User user);
	
	public List<User> getUsers();
	
	public boolean login(String username, String password);

}
