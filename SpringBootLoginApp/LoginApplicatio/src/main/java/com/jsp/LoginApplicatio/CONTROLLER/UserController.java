package com.jsp.LoginApplicatio.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.LoginApplicatio.DAO.UserDao;
import com.jsp.LoginApplicatio.DTO.User;

@RestController
public class UserController {
	
	@Autowired
	UserDao dao;
	
	@PostMapping("/user")
	public User insert(@RequestBody User user) {
		return dao.register(user);
	}
	
	@GetMapping("/login")
	public String validate(@RequestParam String userName, @RequestParam String userPassword) {
		return dao.loginValidation(userName, userPassword);
	}
	
	
}
