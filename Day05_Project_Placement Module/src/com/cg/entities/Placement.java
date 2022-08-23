package com.cg.entities;

import java.io.Serializable;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@SuppressWarnings("serial")
@Entity
@Table(name="placement")

public class Placement implements Serializable
{
	private static final long SerialVersionUID=1L;
	@Id
	
	private Long id;
	private String name;
	private College college;
	private LocalDate date;
	private String qualification;
	private int year;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}