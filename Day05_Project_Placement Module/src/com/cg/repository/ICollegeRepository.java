package com.cg.repository;
import com.cg.entities.College;

public interface ICollegeRepository 
{
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(int id);
	public boolean deleteCollege(int id);
	public boolean schedulePlacement(College college);
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}