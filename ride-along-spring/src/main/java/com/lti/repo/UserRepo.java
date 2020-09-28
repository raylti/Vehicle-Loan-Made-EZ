package com.lti.repo;

import com.lti.entity.UserDetails;

public interface UserRepo {

void saveUser (UserDetails user);
	
	UserDetails fetchUser(int uid);
	
	
}
