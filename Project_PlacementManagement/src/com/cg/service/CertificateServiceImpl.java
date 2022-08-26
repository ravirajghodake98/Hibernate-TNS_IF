package com.cg.service;

import com.cg.entities.Certificate;
import com.cg.repository.CertificateRepositoryImpl;
import com.cg.repository.ICertificateRepository;

public class CertificateServiceImpl implements ICertificateService
{
	
	private ICertificateRepository cao;
	
	
	public CertificateServiceImpl() 
	{
		super();
		cao =new CertificateRepositoryImpl();
	}

	

	@Override
	public Certificate addCertificate(Certificate certificate) 
	{
		cao.beginTransaction();
		cao.addCertificate(certificate);
		cao.commitTransaction();	
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) 
	{
		cao.beginTransaction();
		cao.updateCertificate(certificate);
		cao.commitTransaction();	
		return certificate;
	}

	@Override
	public Certificate searchCertificate(long id) 
	{
		Certificate certificate =cao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(long id) 
	{
		cao.beginTransaction();
		Certificate certificate = cao.deleteCertificate(id);
		cao.commitTransaction();	
		return certificate;
	}
}