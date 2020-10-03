package com.lti.service;

import java.util.List;

import com.lti.entity.Loan;
import com.lti.entity.User;

public interface AdminService {

	List<User> fetchUser(int uid);
	
	List<Loan> fetchByLoanStatus(String status);
	
	void changeStatus(int lid, String status);
}
