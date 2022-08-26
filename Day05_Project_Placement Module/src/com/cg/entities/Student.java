package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student1")

 public class Student{
	
	@Id
	//identity is used because it identifies that whatever the persistent provider
	//must assign the primary key for the entity using the database entity column
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private int ROLLNO;
	private int HALLTICKET;
	private int YEAR;
	private String NAME;
//	private String COLLEGE;
	private String COURSE;
//	private String CERTIFICATE;
	private String QUALIFICATION;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "certificate_id")
	private Certificate certificate;
	
	//getters and setters
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getROLLNO() {
		return ROLLNO;
	}
	public void setROLLNO(int rOLLNO) {
		ROLLNO = rOLLNO;
	}
	public int getHALLTICKET() {
		return HALLTICKET;
	}
	public void setHALLTICKET(int hALLTICKET) {
		HALLTICKET = hALLTICKET;
	}
	public int getYEAR() {
		return YEAR;
	}
	public void setYEAR(int yEAR) {
		YEAR = yEAR;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	/*
	public String getCOLLEGE() {
		return COLLEGE;
	}
	public void setCOLLEGE(String cOLLEGE) {
		COLLEGE = cOLLEGE;
	}
	*/
	public String getCOURSE() {
		return COURSE;
	}
	public void setCOURSE(String cOURSE) {
		COURSE = cOURSE;
	}
	/*
	public String getCERTIFICATE() {
		return CERTIFICATE;
	}
	public void setCERTIFICATE(String cERTIFICATE) {
		CERTIFICATE = cERTIFICATE;
	}
	*/
	public String getQUALIFICATION() {
		return QUALIFICATION;
	}
	public void setQUALIFICATION(String qUALIFICATION) {
		QUALIFICATION = qUALIFICATION;
	}
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	
	
	
}