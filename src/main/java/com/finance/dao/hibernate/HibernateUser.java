package com.finance.dao.hibernate;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.finance.dao.UserDao;
import com.finance.model.User;

@Component
public class HibernateUser implements UserDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Autowired
	public HibernateUser(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional(readOnly = true)
	public Collection<User> findUsers() {
		return hibernateTemplate.loadAll(User.class);
	}
	
}
