/**
 * Controller class for rest connection of User's methods.
 * @author: Abhinav
 * @Version:1.0
 * 
 */
package com.lti.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	//	http://localhost:8080/ride-along-spring-rest1/rest/fetch_by_userId/{id}
	@GetMapping(value = "/fetch_by_userId/{id}", produces = "application/json")
	public Loan fetchLoanByUserId(@PathVariable int id) {
		return service.fetchloanByUserId(id);
	}
}
