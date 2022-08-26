package com.cg.service;

import com.cg.entities.Certificate;
import com.cg.entities.Student;
import com.cg.repository.CertificateRepositoryImpl;
import com.cg.repository.ICertificateRepository;
import com.cg.repository.IStudentRepository;
import com.cg.repository.IStudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
	
	private IStudentRepository dao;
	private ICertificateRepository cao;

	public StudentServiceImpl() {
		dao = new IStudentRepositoryImpl();
		cao = new CertificateRepositoryImpl();
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
	public Student searchStudentByHALLTICKET(int HALLTICKET) {
		Student std=  dao.searchStudentByHallticket(HALLTICKET);
		return std;
	}


	@Override
	public boolean addCertificate(Certificate certificate) {
		dao.beginTransaction();
		cao.addCertificate(certificate);
		dao.commitTransaction();
		return true;
	}


	@Override
	public boolean updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		cao.updateCertificate(certificate);
		dao.commitTransaction();
		return true;
	}


	@Override
	public boolean deleteStudent(int id) {
		dao.beginTransaction();
		boolean res = dao.deleteStudent(id);
		dao.commitTransaction();
		return res;
	}

}