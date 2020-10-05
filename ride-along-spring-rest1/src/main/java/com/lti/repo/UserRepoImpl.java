/**
 * Defining methods for the use of User.
 * @author: Rahul
 * @Version:1.0
 * 
 */

package com.lti.repo;

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

	@Override
	public Loan fetchloanByUserId(int id) {
		return (Loan) em.createNamedQuery("userId").setParameter("crl", id).getSingleResult();
	}
}