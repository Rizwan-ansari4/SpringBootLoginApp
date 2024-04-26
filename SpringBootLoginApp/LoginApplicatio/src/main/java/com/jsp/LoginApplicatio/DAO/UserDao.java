package com.jsp.LoginApplicatio.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.LoginApplicatio.DTO.User;
import com.jsp.LoginApplicatio.REPOSITORY.LoginRepository;

@Repository
public class UserDao {
	 
	@Autowired
	LoginRepository repository;
	
	//To register the user
	public User register(User user) {
		return repository.save(user);
	}
	
	
	//To login user
	public String loginValidation(String userName, String userPassword) {
		User u = repository.validateUser(userName, userPassword);
		if(u != null) {
			return "Login Succssfull...!";
		}else {
			return "Invalid user name and password...!";
		}
	}
	
	
	
}
