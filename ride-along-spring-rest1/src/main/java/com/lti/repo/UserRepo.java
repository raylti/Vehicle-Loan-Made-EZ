/**
 * Declare methods 
 * @author: Rahul
 * @Version:1.0
 * 
 */
package com.lti.repo;

import com.lti.entity.Employment;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;
import com.lti.entity.Identity;

public interface UserRepo {

	void saveUser (User user);
	
	void saveUserDetails(User user);
	
	void saveLoanDetails(Loan loan);
	
	void saveVehicleDetails(Vehicle vehicle);
	
	void saveEmploymentDetails(Employment employment);
	
	void saveIdentityDetails(Identity identity);
}