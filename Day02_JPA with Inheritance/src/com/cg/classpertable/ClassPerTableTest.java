package com.cg.classpertable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClassPerTableTest {

	public static void main(String[] args) {
		//we are using EntityManagerFactory because we have to use it for CRUD operation
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		// we are using EntityManager to create the table
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create first employee
		Employee1 emp = new Employee1();
		emp.setName("Bhakti");
		emp.setSalary(30000);
		em.persist(emp); 		//persist is used to add rows
		
		//create second employee
		Employee1 emp1 = new Employee1();
		emp1.setName("Vishwanath");
		emp1.setSalary(50000);
		em.persist(emp1);
		
		//create a manager
		Manager1 m = new Manager1();
		m.setName("Shweta");
		m.setSalary(80000);
		m.setDeptName("IT");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in Database");
		em.close();
		factory.close();
	}

}
