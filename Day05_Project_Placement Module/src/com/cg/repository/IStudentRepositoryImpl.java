package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.Student;

public class IStudentRepositoryImpl implements IStudentRepository {
	
//	private static final Student std = null;
	private EntityManager em;
	
	//constructor
	public IStudentRepositoryImpl() {
//		super();
		em =JPAUtil.getEntityManager();
	}

	@Override
	public Student addStudent(Student std) {
		em.persist(std);
		return std;
	}

	@Override
	public Student updateStudent(Student std) {
		em.merge(std);
		return std;
	}

	@Override
	public Student searchStudentByID(int ID) {
		Student std = em.find(Student.class, ID);
		return std;
	}

	@Override
	public Student searchStudentByHallticket(int HALLTICKET) {
		Student std = em.find(Student.class, HALLTICKET);
		return std;
	}



	@Override
	public boolean deleteStudent(int ID) {
		em.remove(ID);
		return false;
	}
		/*
		@Override
		public void commitTransaction() 
		{
			em.getTransaction().commit();
				}

		@Override
		public void beginTransaction() 
		{
			em.getTransaction().begin();
			}
	*/
	
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

}