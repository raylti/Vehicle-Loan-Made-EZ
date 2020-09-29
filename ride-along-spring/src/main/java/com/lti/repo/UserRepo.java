package com.lti.repo;

import java.util.List;

import com.lti.entity.EmploymentDetail;
import com.lti.entity.LoanDetail;
import com.lti.entity.UserDetail;
import com.lti.entity.VehicleDetail;

public interface UserRepo {

	void saveUser (UserDetail user);
	
	void saveUserDetails(UserDetail user);
	
	void saveLoanDetails(LoanDetail loan);
	
	void saveVehicleDetails(VehicleDetail vehicle);
	
	void saveEmploymentDetails(EmploymentDetail employment);
	
	UserDetail fetchUser(int uid);
	
	List<LoanDetail> fetchByLoanStatus(String status);
	
	void changeStatus(int lid, String status);
	
}
