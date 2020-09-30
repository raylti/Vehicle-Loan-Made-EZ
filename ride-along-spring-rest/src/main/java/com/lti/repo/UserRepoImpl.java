/**
 * Method Definition
 * @author: Rahul
 * @Version:1.0
 * 
 */

package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.Employment;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;

@Repository
public class UserRepoImpl implements UserRepo {

	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void saveUser(User user) {
		em.persist(user);
	}

	public User fetchUser(int uid) {
		User u = em.find(User.class, uid);
		return u;
	}

	@SuppressWarnings("unchecked")
	public List<Loan> fetchByLoanStatus(String status) {
		return em.createNamedQuery("loan_status").setParameter("crl", status).getResultList();
	}

	@Transactional(value = TxType.REQUIRED)
	public void changeStatus(int lid, String status) {
		Loan l1 = em.find(Loan.class,lid);
		l1.setLoanStatus(status);
		em.merge(l1);
	}

	@Transactional(value = TxType.REQUIRED)
	public void saveUserDetails(User user) {
		em.persist(user);
	}

	@Transactional(value = TxType.REQUIRED)
	public void saveLoanDetails(Loan loan) {
		int result = (int) em.createNamedQuery("max_id").getSingleResult();
		User u = em.find(User.class, result);
		u.setLoan(loan);
		loan.setUser(u);
		em.merge(u);
		}

	@Transactional(value = TxType.REQUIRED)
	public void saveVehicleDetails(Vehicle vehicle) {
		int result = (int) em.createNamedQuery("max_id1").getSingleResult();
		User u = em.find(User.class, result);
		u.setVeh(vehicle);
		vehicle.setUser(u);
		em.merge(u);
	}

	@Transactional(value = TxType.REQUIRED)
	public void saveEmploymentDetails(Employment employment) {
		int result = (int) em.createNamedQuery("max_id2").getSingleResult();
		User u = em.find(User.class, result);
		u.setEmp(employment);
		employment.setUser(u);
		em.merge(u);
		}
}
