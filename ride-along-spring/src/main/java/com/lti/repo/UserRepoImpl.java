package com.lti.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.UserDetails;

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
}
