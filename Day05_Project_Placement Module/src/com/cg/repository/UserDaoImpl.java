package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.User;

public class UserDaoImpl implements IUserDao
{
	//Step1: Start JPA LifeCycle
	private EntityManager em;
		
	//default constructor
	public UserDaoImpl() {
	em = JPAUtil.getEntityManager();
	}
	
	@Override
	public User addNewUser(User user) {
		em.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		em.merge(user);
		return user;
	}

	@Override
	public User deleteUser(int id) 
	{
		User user = em.find(User.class, id);
		em.remove(user);
		return user;
	}
	
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}
	
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
	}

}
