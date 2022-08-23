package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
	
	private EntityManager entityManager;
	
	public StudentDaoImpl() {
		entityManager =JPAUtil.getEntityManager();
	}

	@Override
	public Student addStudent(Student std) {
		entityManager.persist(std);
		return std;
	}

	@Override
	public Student updateStudent(Student std) {
		entityManager.merge(std);
		return std;
	}

	@Override
	public Student searchStudentByID(int ID) {
		Student std = entityManager.find(Student.class, ID);
		return std;
	}

	@Override
	public Student searchStudentByHallticket(int HALLTICKET) {
		Student std = entityManager.find(Student.class, HALLTICKET);
		return std;
	}

	@Override
	public Student deleteStudent(Student std) {
	entityManager.remove(std);
		return std;
	}

	@Override
	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();
			}

	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
		}

	@Override
	public Student addCertificate(Student std) {
		entityManager.persist(std);
		return std;
	}

	@Override
	public Student updateCertificate(Student std) {
		entityManager.merge(std);
		return std;
	}

}