package com.cg.dao;
import com.cg.entities.Student;

public interface StudentDao {
	public Student addStudent(Student std);
	public Student addCertificate(Student std);
	public Student updateStudent(Student std);
	public Student updateCertificate(Student std);
	public Student searchStudentByID(int ID);
	public Student searchStudentByHallticket(int HALLTICKET);
	public Student deleteStudent(Student std);
	void commitTransaction();
	void beginTransaction();
}