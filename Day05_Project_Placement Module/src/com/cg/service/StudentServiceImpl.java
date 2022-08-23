package com.cg.service;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpl;
import com.cg.entities.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao dao;
	

	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public Student addStudent(Student std) {
		dao.beginTransaction();
		dao.addStudent(std);
		dao.commitTransaction();
		return std;
	}

	@Override
	public Student updateStudent(Student std) {
		dao.beginTransaction();
		dao.updateStudent(std);
		dao.commitTransaction();
		return std;
	}

	@Override
	public Student searchStudentByID(int Id) {
		Student std= dao.searchStudentByID(Id);
		return std;
	}

	@Override
	public Student searchStudentByHALLTICKET(int HALLTICKETD) {
		Student std=  dao.searchStudentByHallticket(HALLTICKETD);
		return std;
	}

	@Override
	public Student addCertificate(Student std) {
		dao.beginTransaction();
		dao.addCertificate(std);
		dao.commitTransaction();
		return std;
	}

	@Override
	public Student updateCertificate(Student std) {
		dao.beginTransaction();
		dao.addCertificate(std);
		dao.commitTransaction();
		return std;
	}

	@Override
	public Student deleteStudent(Student std) {
		dao.beginTransaction();
		dao.deleteStudent(std);
		dao.commitTransaction();
		return std;
		
	}

	

}