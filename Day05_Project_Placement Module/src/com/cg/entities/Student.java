package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")

public class Student {
	
	
	@Id
	private int ID;
	private int  ROLLNO;
	private int HALLTICKET;
	private int YEAR;
	private String NAME;
	private String COLLEGE;
	private String COURSE;
	private String CERTIFICATE;
	private String QUALIFICATION;
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
	public String getCOLLEGE() {
		return COLLEGE;
	}
	public void setCOLLEGE(String cOLLEGE) {
		COLLEGE = cOLLEGE;
	}
	public String getCOURSE() {
		return COURSE;
	}
	public void setCOURSE(String cOURSE) {
		COURSE = cOURSE;
	}
	public String getCERTIFICATE() {
		return CERTIFICATE;
	}
	public void setCERTIFICATE(String cERTIFICATE) {
		CERTIFICATE = cERTIFICATE;
	}
	public String getQUALIFICATION() {
		return QUALIFICATION;
	}
	public void setQUALIFICATION(String qUALIFICATION) {
		QUALIFICATION = qUALIFICATION;
	}
	
	
	
}