package com.bhaiti.services.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhaiti.bL.managers.UserManager;
import com.bhaiti.entities.User;
import com.bhaiti.exceptions.CustomException;
import com.bhaiti.exceptions.NoDataFoundException;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserManager userManager;
	
	@GetMapping("/")
	public List<User> index() throws NoDataFoundException, CustomException{
		
		return userManager.retrieveAllUsers();
	}

}