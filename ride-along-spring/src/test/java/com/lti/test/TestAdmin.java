package com.lti.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.entity.Employment;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;
import com.lti.repo.UserRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestAdmin {

	@Autowired
	private UserRepo repo;
	
	@Test
	public void fetchUser() {
		User u = repo.fetchUser(101);
		Employment e1 = u.getEmp();
		Vehicle v1 = u.getVeh();
		Loan l1 = u.getLoan();
		
		System.out.println(u.getName() + "\t" + e1.getEmploymentType() + "\t" + v1.getVehicleModel() + "\t" + l1.getLoanAmount());
	}
	
	@Test
	public void fetchByLoanStatus() {
		List<Loan> result = repo.fetchByLoanStatus("Pending");
		for(Loan l: result) {
			System.out.println(l.getLoanAmount() + "\t" + l.getTenure());
			System.out.println(l.getUser().getName());
		}
	}
	
	@Test
	public void changeLoanStatus() {
		repo.changeStatus(101,"Rejected");
	}
}
