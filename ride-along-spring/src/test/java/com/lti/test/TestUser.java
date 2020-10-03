/**
 * Test User
 * @author: Rahul
 * @Version:1.0
 * 
 */

package com.lti.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.entity.Employment;
import com.lti.entity.Identity;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;
import com.lti.repo.UserRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestUser {
	
	@Autowired
	private UserRepo repo;
	
	@Test
	public void testSave() {
		User u1 = new User();
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
		
		
		Vehicle v1 = new Vehicle();
		v1.setVehicleMake("Honda");
		v1.setVehicleModel("Honda");
		v1.setExShowroomPrice(20000.0);
		
		Loan l1 = new Loan();
		l1.setLoanAmount(5000.0);
		l1.setInterestRate(8.5);
		l1.setTenure(5);
		l1.setLoanStatus("Pending");
		
		Employment e1 =  new Employment();
		e1.setExistingEmi(5000.0);
		e1.setAnnualIncome(50000.0);
		e1.setEmploymentType("Salaried");
		
		Identity i1 = new Identity();
		i1.setAadhaarNo("125214563214");
		i1.setPanNo("ESDRF0120K");
		
		v1.setUser(u1);
		l1.setUser(u1);
		e1.setUser(u1);
		i1.setUser(u1);
		
		u1.setVeh(v1);
		u1.setLoan(l1);
		u1.setEmp(e1);
		u1.setIdentity(i1);
		
		repo.saveUser(u1);
	}
	
	@Test
	public void saveUserDetails() {
		User u1 = new User();
		u1.setName("Abhinav");
		u1.setAddress("Rajeev Nagar");
		u1.setAge(22);
		u1.setCity("Gaya");
		u1.setEmail("email");
		u1.setGender("Male");
		u1.setMobileNo("7003397408");
		u1.setPincode("80020");
		u1.setPassword("gygbhjk");
		u1.setState("MP");
		
		repo.saveUserDetails(u1);
	}
	
	@Test
	public void saveLoanDetails() {
		Loan l1 = new Loan();
		l1.setLoanAmount(6000.0);
		l1.setInterestRate(8.5);
		l1.setTenure(3);
		l1.setLoanStatus("Rejected");
		
		repo.saveLoanDetails(l1);
	}
	
	@Test
	public void saveVehicleDetails() {
		Vehicle v1 = new Vehicle();
		v1.setVehicleMake("Honda");
		v1.setVehicleModel("Honda");
		v1.setExShowroomPrice(20000.0);
		
		repo.saveVehicleDetails(v1);
	}
	
	@Test
	public void saveEmploymentDetails() {
		Employment e1 =  new Employment();
		e1.setExistingEmi(5000.0);
		e1.setAnnualIncome(50000.0);
		e1.setEmploymentType("Salaried");
		
		repo.saveEmploymentDetails(e1);
	}
	
	@Test
	public void saveIdentityDetails() {
		Identity i1 = new Identity();
		i1.setAadhaarNo("125214563214");
		i1.setPanNo("ESDRF0120K");
		
		repo.saveIdentityDetails(i1);
	}
}
