/**
 * Controller class for rest connection of Login validation.
 * @author: Rahul
 * @Version:1.0
 * 
 */

package com.lti.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.User;
import com.lti.pojo.Login;
import com.lti.service.LoginService;

@CrossOrigin
@RestController
public class LoginRestController {
	
	@Autowired
	private LoginService service;
	
	@GetMapping(value ="/login", produces = "application/json")
	public User login(@RequestParam("email") String email,
			@RequestParam("password") String password) {
		
		Login login = new Login(email,password);
		User user = service.validate(login);
		System.out.println(user.getEmail() + "\t" + user.getPassword());
		return user;
	}

}
