package com.cg.classpertable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MGR")
public class Manager1 extends Employee1
{
	private static final long SerialVersionUID=1L;
	private String deptName;
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}

