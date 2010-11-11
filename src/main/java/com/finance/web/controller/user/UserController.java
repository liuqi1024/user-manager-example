package com.finance.web.controller.user;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.finance.model.User;
import com.finance.service.UserService;

@Controller
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="/users", method = RequestMethod.GET)
	public String list(User user, BindingResult result, Model model) {
		Collection<User> users;
		
		users = userService.findUsers();
		logger.info("user list = [" + users.size() + "]");

		model.addAttribute("users", users);
		return "users/list";
	}
}
