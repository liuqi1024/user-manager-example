package com.finance.dao;

import java.util.Collection;

import com.finance.model.User;


public interface UserDao {
	
	public Collection<User> findUsers();
	
} 


