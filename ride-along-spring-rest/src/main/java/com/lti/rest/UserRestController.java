package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.lti.entity.Employment;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;
import com.lti.service.UserService;

@CrossOrigin
@RestController
public class UserRestController {
	
	@Autowired
	private UserService service;
	
//	http://localhost:8080/ride_along-spring-rest/rest/add_user_detail
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
	
	@PostMapping(value = "/add_loan_detail" , consumes = "application/json")
	public String addLoanDetails(@RequestBody Loan loan) {
		service.persistsLoanDetails(loan);
		return "Loan Details added successfully";
	}
	
	@GetMapping(value = "/fetch/{id}", produces = "application/json")
	public User fetchUser(@PathVariable int id) {
		return service.fetchUser(id);
	}
	
	@GetMapping(value="/fetch_by_loan_status/{status}",produces="application/json")
	public List<Loan> fetchByLoanStatus(@PathVariable String status) {
		return service.fetchByLoanStatus(status);
	}
	
//	http://localhost:8080/ride-along-spring-rest/rest/change_loan_status/101/lid/Approved/status
	@PostMapping(value="/change_loan_status/{lid}/lid/{status}/status}",produces="application/json")
	public void changeLoanStatus(@PathVariable("status") String status , @PathVariable("lid")int lid) {
		service.changeStatus(lid, status);
	}
	
	
	

}
