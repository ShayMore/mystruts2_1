package com.momo.struts.dao;

import java.util.ArrayList;
import java.util.List;

import com.momo.struts.domain.User;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getUsers() {
		List<User> userList = new ArrayList<User>();
		User u = new User();
		u.setAge(12);
		u.setSex("男");
		u.setUsername("Tao");
		u.setPassword("124");
		u.setOpttime("2016/12/8 12:12");
		userList.add(u);
		User u1 = new User();
		u1.setAge(22);
		u1.setSex("女");
		u1.setUsername("Blue");
		u1.setPassword("134");
		u1.setOpttime("2016/12/6 12:12");
		userList.add(u1);
		return userList;
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return true;
	}

}
