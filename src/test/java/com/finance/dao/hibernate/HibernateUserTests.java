package com.finance.dao.hibernate;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.finance.dao.UserDao;
import com.finance.model.User;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class HibernateUserTests extends AbstractTransactionalJUnit4SpringContextTests {
	@Autowired
	@Qualifier("hibernateUser")
	protected UserDao userDao;
	
	@Test
	public void testFindUsers() {
		Collection<User> users = userDao.findUsers();
		assertEquals(1, users.size());
	}
}
