package com.cg.joininheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinInheritanceTest {

	public static void main(String[] args) {
		//we are using EntityManagerFactory because we have to use it for CRUD operation
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		// we are using EntityManager to create the table
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create first employee
		Employee2 emp = new Employee2();
		emp.setName("Siddhi");
		emp.setSalary(30000);
		em.persist(emp); 		//persist is used to add rows
		
		//create second employee
		Employee2 emp1 = new Employee2();
		emp1.setName("Mahendra");
		emp1.setSalary(50000);
		em.persist(emp1);
		
		//create a manager
		Manager2 m = new Manager2();
		m.setName("Janhvi");
		m.setSalary(80000);
		m.setDeptName("HR");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in Database");
		em.close();
		factory.close();
	}

}

