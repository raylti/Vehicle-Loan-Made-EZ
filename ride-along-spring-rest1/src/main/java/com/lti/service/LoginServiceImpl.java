/**
 * Method Definition Service Class
 * @author: Rahul
 * @Version:1.0
 */

package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.User;
import com.lti.pojo.Login;
import com.lti.repo.LoginRepo;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepo repo;
	
	@Override
	public User validate(Login login) {
		return repo.authenticate(login);
	}
}
