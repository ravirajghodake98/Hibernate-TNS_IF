package com.cg.entities;
import javax.persistence.*;

@Entity
@Table(name="college")
public class College 
{
	@Id
	private int Id;
	//private User collegeAdmin;
	private String collegeAdmin;
	private String collegeName;
	private String location;
	
	public long getId() 
	{
		return Id;
	}
	public void setId(int id) 
	{
		Id = id;
	}
	
	public String getCollegeAdmin() 
	{
		return collegeAdmin;
	}
	public void setCollegeAdmin(String collegeAdmin) 
	{
		this.collegeAdmin = collegeAdmin;
	}
	
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) 
	{
		this.collegeName = collegeName;
	}
	
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}
}