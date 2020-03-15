package com.bhaiti.bL.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhaiti.dl.repositories.UserRepository;
import com.bhaiti.entities.User;

@Component
public class UserManager {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> retrieveAllUsers(){
		
		return userRepository.findAll();
	}
	
}
