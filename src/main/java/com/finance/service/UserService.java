package com.finance.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.finance.dao.UserDao;
import com.finance.model.User;

@Service
public class UserService {
	
	private final UserDao userDao;
	
	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	/**
	 * 
	 * @return
	 * @throws DataAccessException
	 */
	public Collection<User> findUsers() throws DataAccessException {
		
		return userDao.findUsers();
	}
	
	User findUser(int id) throws DataAccessException {
		return null;
	}
	
	void createUser(User user) throws DataAccessException {
	}
	
	void deleteUser(User user) throws DataAccessException {
	}
}
