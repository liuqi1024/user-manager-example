package com.finance.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class UserTests {

	@Test
	public void testUser() {
		User user = new User();
		user.setName("jack");
		assertNotNull(user.getName());
		assertEquals("jack", user.getName());
	}
}
