package com.lti.repo;

import java.util.List;

import com.lti.entity.EmploymentDetails;
import com.lti.entity.LoanDetails;
import com.lti.entity.UserDetails;
import com.lti.entity.VehicleDetails;

public interface UserRepo {

	void saveUser (UserDetails user);
	
	void saveUserDetails(UserDetails user);
	
	void saveLoanDetails(LoanDetails loan);
	
	void saveVehicleDetails(VehicleDetails vehicle);
	
	void saveEmploymentDetails(EmploymentDetails employment);
	
	UserDetails fetchUser(int uid);
	
	List<LoanDetails> fetchByLoanStatus(String status);
	
	void changeStatus(int lid, String status);
	
}
