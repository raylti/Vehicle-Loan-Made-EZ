/**
 * Declare methods 
 * @author: Rahul
 * @Version:1.0
 * 
 */
package com.lti.repo;

import java.util.List;

import com.lti.entity.Employment;
import com.lti.entity.Identity;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;

public interface UserRepo {

	void saveUser (User user);
	
	void saveUserDetails(User user);
	
	void saveLoanDetails(Loan loan);
	
	void saveVehicleDetails(Vehicle vehicle);
	
	void saveEmploymentDetails(Employment employment);
	
	void saveIdentityDetails(Identity identity);
	
	User fetchUser(int uid);
	
	List<Loan> fetchByLoanStatus(String status);
	
	void changeStatus(int lid, String status);
	
	User fetchLogin(String email, String password);
	
}
