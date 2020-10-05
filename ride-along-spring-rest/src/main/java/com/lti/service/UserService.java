/**
 * Method Declaration Service Class
 * @author: Abhinav
 * @Version:1.0
 */
package com.lti.service;

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
	
	void persistsIdentityDetails(Identity identity);
	
}
