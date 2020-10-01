
/**
 *
 * @author: Abhinav
 * @Version:1.0
 * 
 */
package com.lti.service;

import java.util.List;

import com.lti.entity.Employment;
import com.lti.entity.Identity;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;

public interface UserService {
	
	void persistsUser(User user);
	
	void persistsUserDetails(User user);
	
	void persistsLoanDetails(Loan loan);
	
	void persistsVehicleDetails(Vehicle vehicle);
	
	void persistsEmploymentDetails(Employment employment);
	
	String fetchUser(int uid);
	
	List<Loan> fetchByLoanStatus(String status);
	
	void changeStatus(int lid, String status);
	
	void persistsIdentityDetails(Identity identity);
	
	
	

}
