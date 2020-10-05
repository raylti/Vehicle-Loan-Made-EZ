/**
 * Defining methods for Login authentication
 * @author: Rahul
 * @Version:1.0
 */

package com.lti.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.User;
import com.lti.pojo.Login;

@Repository
public class LoginRepoImpl implements LoginRepo{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public User authenticate(Login login) {
		Query query = em.createNamedQuery("login");
		query.setParameter("uemail", login.getEmail());
		query.setParameter("pwd", login.getPassword());
		
		return (User) query.getSingleResult();
	}

}
