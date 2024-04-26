package com.jsp.LoginApplicatio.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.LoginApplicatio.DTO.User;

public interface LoginRepository extends JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.userName=?1 and u.userPassword=?2")
	public User validateUser(String userName, String userPassword);
}
