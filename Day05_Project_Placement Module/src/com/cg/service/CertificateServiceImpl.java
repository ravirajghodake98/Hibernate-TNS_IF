package com.cg.service;

import com.cg.entities.Certificate;
import com.cg.repository.CertificateRepositoryImpl;
import com.cg.repository.ICertificateRepository;
import com.cg.repository.IUserDao;
import com.cg.repository.UserDaoImpl;

public class CertificateServiceImpl implements ICertificateService
{
	//Step 1: establishing connection between service and cao
		private ICertificateRepository cao;
		
		public CertificateServiceImpl()
		{
			cao = new CertificateRepositoryImpl();
		}
	
	//Step2: Service call to perform CRUD operation
	@Override
	public Certificate addCertificate(Certificate certificate) {
		cao.beginTransaction();
		cao.addCertificate(certificate);
		cao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		cao.beginTransaction();
		cao.updateCertificate(certificate);
		cao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate = cao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id) {
		cao.beginTransaction();
		Certificate certificate = cao.deleteCertificate(id);
		cao.commitTransaction();
		return certificate;
	}
	
}
