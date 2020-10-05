/**
 * Declaring methods for the use of Admin.
 * @author: Rahul
 * @Version:1.0
 */

package com.lti.repo;

import java.util.List;

import com.lti.entity.Loan;
import com.lti.entity.User;

public interface AdminRepo {
	
	User fetchUser(int uid);
	
	List<Loan> fetchByLoanStatus(String status);
	
	void changeStatus(int lid, String status);

}
