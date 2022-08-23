package com.cg.service;

import com.cg.dao.CertificateRepositoryImpl;
import com.cg.dao.ICertificateRepository;
import com.cg.dao.IUserDao;
import com.cg.dao.UserDaoImpl;
import com.cg.entities.Certificate;

public class CertificateServiceImpl implements ICertificateService
{
	//Step 1: establishing connection between service and dao
		private ICertificateRepository dao;
		
		public CertificateServiceImpl()
		{
			dao = new CertificateRepositoryImpl();
		}
	
	//Step2: Service call to perform CRUD operation
	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate = dao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id) {
		dao.beginTransaction();
		dao.deleteCertificate(id);
		dao.commitTransaction();
		return null;
	}
	
}
