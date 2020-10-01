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

import org.springframework.stereotype.Repository;

import com.lti.entity.Employment;
import com.lti.entity.Identity;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;

@Repository
public class UserRepoImpl implements UserRepo {

	
	@PersistenceContext
	private EntityManager em;
	

	public void saveUser(User user) {
		em.persist(user);
	}

	public String fetchUser(int uid) {
		User u = em.find(User.class, uid);
		Loan l = new Loan();
		Vehicle v = new Vehicle();
		
		l = u.getLoan();
		
		return u.getName()+ "\t"+ l.getLoanAmount()+"\t" + l.getTenure();
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List fetchByLoanStatus(String status) {
		return em.createNamedQuery("loan_status").setParameter("crl", status).getResultList();
	}

	
	public void changeStatus(int lid, String status) {
		Loan l1 = em.find(Loan.class,lid);
		l1.setLoanStatus(status);
		em.merge(l1);
	}


	public void saveUserDetails(User user) {
		em.persist(user);
	}


	public void saveLoanDetails(Loan loan) {
		int result = (int) em.createNamedQuery("max_id").getSingleResult();
		User u = em.find(User.class, result);
		u.setLoan(loan);
		loan.setUser(u);
		em.merge(u);
		}

	
	public void saveVehicleDetails(Vehicle vehicle) {
		int result = (int) em.createNamedQuery("max_id1").getSingleResult();
		User u = em.find(User.class, result);
		u.setVeh(vehicle);
		vehicle.setUser(u);
		em.merge(u);
	}


	public void saveEmploymentDetails(Employment employment) {
		int result = (int) em.createNamedQuery("max_id2").getSingleResult();
		User u = em.find(User.class, result);
		u.setEmp(employment);
		employment.setUser(u);
		em.merge(u);
		}
	
	
	public void saveIdentityDetails(Identity identity) {
		int result = (int) em.createNamedQuery("max_id3").getSingleResult();
		User u = em.find(User.class, result);
		u.setIdentity(identity);
		identity.setUser(u);
		em.merge(u);
		}
}
