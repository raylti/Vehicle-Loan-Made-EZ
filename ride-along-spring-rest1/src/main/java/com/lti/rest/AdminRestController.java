package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.service.AdminService;

@CrossOrigin
@RestController
public class AdminRestController {

	@Autowired
	public AdminService service;
	
//	http://localhost:8080/ride-along-spring-rest/rest/fetch/{id}
	@GetMapping(value = "/fetch/{id}", produces = "application/json")
	public List<User> fetchUser(@PathVariable int id) {
		return service.fetchUser(id);
	}
	
//	http://localhost:8080/ride-along-spring-rest/rest/fetch_by_loan_status/{status}
	@GetMapping(value="/fetch_by_loan_status/{status}",produces="application/json")
	public List<Loan> fetchByLoanStatus(@PathVariable String status) {
		return service.fetchByLoanStatus(status);
	}
	
//	http://localhost:8080/ride-along-spring-rest/rest/change_loan_status/101/Approved
	@GetMapping(value="/change_loan_status/{lid}/{status}", produces ="application/json")
	public String changeLoanStatus(@PathVariable int lid, @PathVariable String status) {
		service.changeStatus(lid,status);
		return "Loan Application " + status;
	}
}
