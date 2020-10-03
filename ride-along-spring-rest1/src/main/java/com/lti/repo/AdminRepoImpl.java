package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;

@Repository
public class AdminRepoImpl implements AdminRepo {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<User> fetchUser(int uid) {
//		User u = em.find(User.class, uid);
//		Loan l = new Loan();
//		Vehicle v = new Vehicle();
//
//		l = u.getLoan();
//		v = u.getVeh();
		

//		return u.getName() + "\t" + l.getLoanAmount() + "\t" + v.getVehicleMake();
		return em.createNamedQuery("uDetail").setParameter("crl", uid).getResultList();
	}

	@Override
	public List<Loan> fetchByLoanStatus(String status) {
		return em.createNamedQuery("loan_status").setParameter("crl", status).getResultList();
	}

	@Override
	public void changeStatus(int lid, String status) {
		Loan l1 = em.find(Loan.class, lid);
		l1.setLoanStatus(status);
		em.merge(l1);
	}
}
