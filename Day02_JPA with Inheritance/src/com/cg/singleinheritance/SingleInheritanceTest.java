package com.cg.singleinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleInheritanceTest {

	public static void main(String[] args) {
		//we are using EntityManagerFactory because we have to use it for CRUD operation
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		// we are using EntityManager to create the table
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create first employee
		Employee emp = new Employee();
		emp.setName("Vinod");
		emp.setSalary(30000);
		em.persist(emp); 		//persist is used to add rows
		
		//create second employee
		Employee emp1 = new Employee();
		emp1.setName("Shabnam");
		emp1.setSalary(50000);
		em.persist(emp1);
		
		//create a manager
		Manager m = new Manager();
		m.setName("Raviraj");
		m.setSalary(80000);
		m.setDeptName("IT");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in Database");
		em.close();
		factory.close();
	}

}
