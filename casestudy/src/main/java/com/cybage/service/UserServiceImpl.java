package com.cybage.service;

import java.util.List;

import com.cybage.dao.UserDao;
import com.cybage.model.User;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	private int generateId() {
		return (int)Math.round(Math.random()*99999);
	}
	public int addUser(User user) throws Exception {
		user.setId(generateId());
		return userDao.addUser(user);
		
	}

	public List<User> findUser() throws Exception {
		
		return userDao.findUser();
	}

	public User findUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		return userDao.findUserById(id);
	}

	public int deleteUser(int id) throws Exception {
		
		return userDao.deleteUser(id);
	}

	public int updateUser(User user) throws Exception {
		
		return userDao.updateUser(user);
	}

}
