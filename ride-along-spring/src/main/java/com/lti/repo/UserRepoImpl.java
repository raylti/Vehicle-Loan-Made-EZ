package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.EmploymentDetail;
import com.lti.entity.LoanDetail;
import com.lti.entity.UserDetail;
import com.lti.entity.VehicleDetail;

@Repository
public class UserRepoImpl implements UserRepo {

	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void saveUser(UserDetail user) {
		em.persist(user);
	}

	public UserDetail fetchUser(int uid) {
		UserDetail u = em.find(UserDetail.class, uid);
		return u;
	}

	@Override
	public List<LoanDetail> fetchByLoanStatus(String status) {
		return em.createNamedQuery("loan_status").setParameter("crl", status).getResultList();
	}

	@Transactional(value = TxType.REQUIRED)
	public void changeStatus(int lid, String status) {
		LoanDetail l1 = em.find(LoanDetail.class,lid);
		l1.setLoanStatus(status);
		em.merge(l1);
	}

	@Transactional(value = TxType.REQUIRED)
	public void saveUserDetails(UserDetail user) {
		em.persist(user);
	}

	@Transactional(value = TxType.REQUIRED)
	public void saveLoanDetails(LoanDetail loan) {
		int result = (int) em.createNamedQuery("max_id").getSingleResult();
		UserDetail u = em.find(UserDetail.class, result);
		u.setLoan(loan);
		loan.setUser(u);
		em.merge(u);
		}

	@Transactional(value = TxType.REQUIRED)
	public void saveVehicleDetails(VehicleDetail vehicle) {
		int result = (int) em.createNamedQuery("max_id1").getSingleResult();
		UserDetail u = em.find(UserDetail.class, result);
		u.setVeh(vehicle);
		vehicle.setUser(u);
		em.merge(u);
	}

	@Transactional(value = TxType.REQUIRED)
	public void saveEmploymentDetails(EmploymentDetail employment) {
		int result = (int) em.createNamedQuery("max_id2").getSingleResult();
		UserDetail u = em.find(UserDetail.class, result);
		u.setEmp(employment);
		employment.setUser(u);
		em.merge(u);
		}
}
