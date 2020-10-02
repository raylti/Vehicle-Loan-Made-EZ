/**
 * Saves User's personal details.
 * @author: Abhinav
 * @Version:1.0
 * 
 */
package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Employment;
import com.lti.entity.Identity;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;
import com.lti.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo repo;

	@Override
	public void persistsUser(User user) {
		repo.saveUser(user);
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void persistsUserDetails(User user) {
		repo.saveUserDetails(user);
	}

	@Transactional(value = TxType.REQUIRED)
	public void persistsLoanDetails(Loan loan) {
		repo.saveLoanDetails(loan);
	}

	@Transactional(value = TxType.REQUIRED)
	public void persistsVehicleDetails(Vehicle vehicle) {
		repo.saveVehicleDetails(vehicle);
	}

	@Transactional(value = TxType.REQUIRED)
	public void persistsEmploymentDetails(Employment employment) {
		repo.saveEmploymentDetails(employment);
	}

	@Override
	public String fetchUser(int uid) {
		return repo.fetchUser(uid);
	}

	@Override
	public List<Loan> fetchByLoanStatus(String status) {
		return repo.fetchByLoanStatus(status);
	}

	@Override
	public void changeStatus(int lid, String status) {
		repo.changeStatus(lid, status);
	}

	@Transactional(value = TxType.REQUIRED)
	public void persistsIdentityDetails(Identity identity) {
		repo.saveIdentityDetails(identity);
	}

}
