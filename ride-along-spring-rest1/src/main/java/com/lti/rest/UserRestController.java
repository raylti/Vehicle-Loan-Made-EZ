/**
 * Saves User's personal details.
 * @author: Abhinav
 * @Version:1.0
 * 
 */
package com.lti.rest;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.lti.entity.Employment;
import com.lti.entity.Identity;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;
import com.lti.service.UserService;

@CrossOrigin
@RestController
public class UserRestController {
	
	@Autowired
	private UserService service;
	
//	http://localhost:8080/ride-along-spring-rest/rest/add_user_detail
	@PostMapping(value = "/add_user_detail" , consumes = "application/json")
	public String addUserDetail(@RequestBody User user) {
		service.persistsUserDetails(user);
		return "User Details added successfully";
	}
	
	@PostMapping(value = "/add_vehicle_detail" , consumes = "application/json")
	public String addVehicleDetail(@RequestBody Vehicle vehicle) {
		service.persistsVehicleDetails(vehicle);
		return "Vehicle Details added successfully";
	}
	
	@PostMapping(value = "/add_employment_detail" , consumes = "application/json")
	public String addEmploymentDetails(@RequestBody Employment emp) {
		service.persistsEmploymentDetails(emp);
		return "Employement Details added successfully";
	}
	
	@PostMapping(value = "/add_identity_detail" , consumes = "application/json")
	public String addIdentityDetails(@RequestBody Identity identity) {
		service.persistsIdentityDetails(identity);;
		return "Identity Details added successfully";
	}
	
	@PostMapping(value = "/add_loan_detail" , consumes = "application/json")
	public String addLoanDetails(@RequestBody Loan loan) {
		service.persistsLoanDetails(loan);
		return "Loan Details added successfully";
	}
//	http://localhost:8080/ride-along-spring-rest/rest/fetch/{id}
	@GetMapping(value = "/fetch/{id}", produces = "application/json")
	public String fetchUser(@PathVariable int id) {
		return service.fetchUser(id);
	}
//	http://localhost:8080/ride-along-spring-rest/rest/fetch_by_loan_status/{status}
	@GetMapping(value="/fetch_by_loan_status/{status}",produces="application/json")
	public List<Loan> fetchByLoanStatus(@PathVariable String status) {
		return service.fetchByLoanStatus(status);
	}
	
//	http://localhost:8080/ride-along-spring-rest/rest/change_loan_status/Rejected
	@PutMapping(value="/change_loan_status/Rejected",consumes ="application/json")
	public String changeLoanStatus(@RequestBody Loan loan) {
		loan.setLoanStatus("Rejected");
		service.persistsLoanDetails(loan);
		return "updated successfully";
	}
	
	
	

}
