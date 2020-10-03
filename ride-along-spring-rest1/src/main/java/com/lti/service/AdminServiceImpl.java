package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.repo.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepo repo;
	
	@Override
	public List<User> fetchUser(int uid) {
		 return repo.fetchUser(uid);
	}

	@Override
	public List<Loan> fetchByLoanStatus(String status) {
		return repo.fetchByLoanStatus(status);
	}

	@Transactional(value = TxType.REQUIRED)
	@Override
	public void changeStatus(int lid, String status) {
		repo.changeStatus(lid, status);
	}
}
