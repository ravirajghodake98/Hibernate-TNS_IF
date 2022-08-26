package com.cg.repository;
import com.cg.entities.Student;

public interface IStudentRepository 
{
	public Student addStudent(Student std);
//	public Student addCertificate(Student std);
	public Student updateStudent(Student std);
//	public Student updateCertificate(Student std);
	public Student searchStudentByID(int ID);
	public Student searchStudentByHallticket(int HALLTICKET);
	public boolean deleteStudent(int ID);
//	public Student deleteStudent(Student std);
	
	void beginTransaction();
	void commitTransaction();
	
}