package com.cg.repository;
import javax.persistence.EntityManager;
import com.cg.entities.College;

public class CollegeRepositoryImpl implements ICollegeRepository
{
	//Start JPA LifeCycle
	private EntityManager entityManager;
	
	public CollegeRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
    // Create operation - Repository/DAO
	@Override
	public College addCollege(College college) 
	{
		entityManager.persist(college);
		return college;
	}

	// Update operation - Repository/DAO
	@Override
	public College updateCollege(College college) 
	{
		entityManager.merge(college);
		return college;
	}

	// Search operation - Repository/DAO
	@Override
	public College searchCollege(int id)
	{
		College college = entityManager.find(College.class, id);
		return college;
	}

	// Delete operation - Repository/DAO
	@Override
	public boolean deleteCollege(int id) 
	{
		College college = entityManager.find(College.class, id);
		entityManager.remove(college);
		return false;
	}
	
	@Override
	public boolean schedulePlacement(College college) 
	{
		return false;
	}

	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();		
	}

	@Override
	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();
	}
}