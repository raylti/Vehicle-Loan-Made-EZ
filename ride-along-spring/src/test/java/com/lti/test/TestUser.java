package com.lti.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.entity.EmploymentDetails;
import com.lti.entity.LoanDetails;
import com.lti.entity.UserDetails;
import com.lti.entity.VehicleDetails;
import com.lti.repo.UserRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestUser {
	
	@Autowired
	private UserRepo repo;
	
	@Test
	public void testSave() {
		UserDetails u1 = new UserDetails();
		u1.setName("Rahul");
		u1.setAddress("Rajeev Nagar");
		u1.setAge(22);
		u1.setCity("Patna");
		u1.setEmail("email");
		u1.setGender("Male");
		u1.setMobileNo("7003397408");
		u1.setPincode("80020");
		u1.setPassword("gygbhjk");
		u1.setState("Bihar");
		
		
		VehicleDetails v1 = new VehicleDetails();
		v1.setCarMake("Honda");
		v1.setCarModel("Honda");
		v1.setExPrice(20000);
		
		LoanDetails l1 = new LoanDetails();
		l1.setLoanAmount(5000);
		l1.setInterestRate(8.5);
		l1.setTenure(5);
		
		EmploymentDetails e1 =  new EmploymentDetails();
		e1.setExistingEmi(5000);
		e1.setAnnualSal(50000);
		e1.setEmploymentType("Salaried");
		
		v1.setV(u1);
		l1.setL(u1);
		e1.setE(u1);
		
		u1.setVeh(v1);
		u1.setLoan(l1);
		u1.setEmp(e1);
		
		repo.saveUser(u1);
	}
	
	
	
	

}
