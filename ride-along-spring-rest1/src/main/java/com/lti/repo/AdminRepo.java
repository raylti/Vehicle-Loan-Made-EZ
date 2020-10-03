package com.lti.repo;

import java.util.List;

import com.lti.entity.Loan;
import com.lti.entity.User;

public interface AdminRepo {
	
	List<User> fetchUser(int uid);
	
	List<Loan> fetchByLoanStatus(String status);
	
	void changeStatus(int lid, String status);

}
