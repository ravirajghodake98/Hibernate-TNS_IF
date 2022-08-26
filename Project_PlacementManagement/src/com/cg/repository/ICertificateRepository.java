package com.cg.repository;

import com.cg.entities.Certificate;

public interface ICertificateRepository 
{
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(long id);
	public Certificate deleteCertificate(long id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}

