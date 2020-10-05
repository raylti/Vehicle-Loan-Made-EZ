/**
 * Defining methods for the use of Admin.
 * @author: Rahul
 * @Version:1.0
 */

package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Loan;
import com.lti.entity.User;

@Repository
public class AdminRepoImpl implements AdminRepo {

	@PersistenceContext
	private EntityManager em;

	@Override
	public User fetchUser(int uid) {
		return em.find(User.class, uid);
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
