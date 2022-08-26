package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "certificate1")
public class Certificate
{

	@Id
	@Column(name = "certificate_id")
	private int id;
	private int year;
//	private String college;
	@OneToOne(mappedBy = "certificate")
	private Student student;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	/*
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	*/
	public void setstd(Student std) {
		// TODO Auto-generated method stub
		
	}
	
}
