package com.lti.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.entity.EmploymentDetail;
import com.lti.entity.LoanDetail;
import com.lti.entity.UserDetail;
import com.lti.entity.VehicleDetail;
import com.lti.repo.UserRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestUser {
	
	@Autowired
	private UserRepo repo;
	
	@Test
	public void testSave() {
		UserDetail u1 = new UserDetail();
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
		
		
		VehicleDetail v1 = new VehicleDetail();
		v1.setCarMake("Honda");
		v1.setCarModel("Honda");
		v1.setExPrice(20000.0);
		
		LoanDetail l1 = new LoanDetail();
		l1.setLoanAmount(5000.0);
		l1.setInterestRate(8.5);
		l1.setTenure(5);
		l1.setLoanStatus("Pending");
		
		EmploymentDetail e1 =  new EmploymentDetail();
		e1.setExistingEmi(5000.0);
		e1.setAnnualSal(50000.0);
		e1.setEmploymentType("Salaried");
		
		v1.setUser(u1);
		l1.setUser(u1);
		e1.setUser(u1);
		
		u1.setVeh(v1);
		u1.setLoan(l1);
		u1.setEmp(e1);
		
		repo.saveUser(u1);
	}
	
	@Test
	public void fetchUser() {
		UserDetail u = repo.fetchUser(101);
		EmploymentDetail e1 = u.getEmp();
		VehicleDetail v1 = u.getVeh();
		LoanDetail l1 = u.getLoan();
		
		System.out.println(u.getName() + "\t" + e1.getEmploymentType() + "\t" + v1.getCarModel() + "\t" + l1.getLoanAmount());
	}
	
	@Test
	public void fetchByLoanStatus() {
		List<LoanDetail> result = repo.fetchByLoanStatus("Pending");
		for(LoanDetail l: result) {
			System.out.println(l.getLoanAmount() + "\t" + l.getTenure());
			System.out.println(l.getUser().getName());
		}
	}
	
	@Test
	public void changeLoanStatus() {
		repo.changeStatus(101,"Rejected");
	}
	
	@Test
	public void saveUserDetails() {
		UserDetail u1 = new UserDetail();
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
		LoanDetail l1 = new LoanDetail();
		l1.setLoanAmount(6000.0);
		l1.setInterestRate(8.5);
		l1.setTenure(3);
		l1.setLoanStatus("Rejected");
		
		repo.saveLoanDetails(l1);
	}
	
	@Test
	public void saveVehicleDetails() {
		VehicleDetail v1 = new VehicleDetail();
		v1.setCarMake("Honda");
		v1.setCarModel("Honda");
		v1.setExPrice(20000.0);
		
		repo.saveVehicleDetails(v1);
	}
	
	@Test
	public void saveEmploymentDetails() {
		EmploymentDetail e1 =  new EmploymentDetail();
		e1.setExistingEmi(5000.0);
		e1.setAnnualSal(50000.0);
		e1.setEmploymentType("Salaried");
		
		repo.saveEmploymentDetails(e1);
	}
}
