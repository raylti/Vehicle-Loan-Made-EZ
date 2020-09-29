package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.EmploymentDetails;
import com.lti.entity.LoanDetails;
import com.lti.entity.UserDetails;
import com.lti.entity.VehicleDetails;

@Repository
public class UserRepoImpl implements UserRepo {

	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void saveUser(UserDetails user) {
		em.persist(user);
	}

	public UserDetails fetchUser(int uid) {
		UserDetails u = em.find(UserDetails.class, uid);
		return u;
	}

	@Override
	public List<LoanDetails> fetchByLoanStatus(String status) {
		return em.createNamedQuery("loan_status").setParameter("crl", status).getResultList();
	}

	@Transactional(value = TxType.REQUIRED)
	public void changeStatus(int lid, String status) {
		LoanDetails l1 = em.find(LoanDetails.class,lid);
		l1.setLoanStatus(status);
		em.merge(l1);
	}

	@Transactional(value = TxType.REQUIRED)
	public void saveUserDetails(UserDetails user) {
		em.persist(user);
	}

	@Transactional(value = TxType.REQUIRED)
	public void saveLoanDetails(LoanDetails loan) {
		int result = (int) em.createNamedQuery("max_id").getSingleResult();
		UserDetails u = em.find(UserDetails.class, result);
		u.setLoan(loan);
		loan.setL(u);
		em.merge(u);
		}

	@Transactional(value = TxType.REQUIRED)
	public void saveVehicleDetails(VehicleDetails vehicle) {
		int result = (int) em.createNamedQuery("max_id1").getSingleResult();
		UserDetails u = em.find(UserDetails.class, result);
		u.setVeh(vehicle);
		vehicle.setV(u);
		em.merge(u);
	}

	@Transactional(value = TxType.REQUIRED)
	public void saveEmploymentDetails(EmploymentDetails employment) {
		int result = (int) em.createNamedQuery("max_id2").getSingleResult();
		UserDetails u = em.find(UserDetails.class, result);
		u.setEmp(employment);
		employment.setE(u);
		em.merge(u);
		}
}
