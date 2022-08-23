package com.cg.service;

import com.cg.entities.Student;

public interface StudentService {
	public Student  addStudent(Student std);
	public Student updateStudent(Student std);
	public Student searchStudentByID(int Id);
	public Student searchStudentByHALLTICKET(int HALLTICKET);
	public Student addCertificate(Student std);
	public Student updateCertificate(Student std);
	public Student deleteStudent(Student std);

}