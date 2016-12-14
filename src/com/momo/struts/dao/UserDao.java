package com.momo.struts.dao;

import java.util.List;

import com.momo.struts.domain.User;

public interface UserDao {
	
	public boolean addUser(User user);
	
	public List<User> getUsers();
	
	public boolean login(String username, String password);

}
