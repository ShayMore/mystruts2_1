package com.momo.struts.service;

import java.util.List;

import com.momo.struts.dao.UserDao;
import com.momo.struts.dao.UserDaoImpl;
import com.momo.struts.domain.User;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao = new UserDaoImpl();

	@Override
	public boolean saveUser(User user) {
		return false;	
	}

	@Override
	public List<User> getUsers() {
		List<User> uList = userDao.getUsers();
		return uList;
	}

	@Override
	public boolean login(String username, String password) {
		return userDao.login(username, password);
	}

}
