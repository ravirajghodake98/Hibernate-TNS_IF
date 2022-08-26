package com.cg.service;

import java.util.Scanner;

import com.cg.entities.Admin;
import com.cg.repository.AdminRepositoryImpl;

public class AdminServiceImpl implements IAdminService
{
	
	private AdminRepositoryImpl aao;
	
	Scanner s=new Scanner(System.in);
		
	
		public AdminServiceImpl() 
		{
			aao=new AdminRepositoryImpl();
		}
		
	//Service calls to perform CRUD Operation
	@Override
	public Admin addNewAdmin(Admin admin) 
	{
		aao.beginTransaction();
		aao.addNewAdmin(admin);
		aao.commitTransaction();
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) 
	{
		aao.beginTransaction();
		aao.updateAdmin(admin);
		aao.commitTransaction();
		return admin;
	}

	@Override
	public Admin login(Admin admin) 
	{
		System.out.println("Enter the admin name:");
		String aname=s.nextLine();
		System.out.println("Enter the Password :");
		String apsw=s.nextLine();
		if(aname==admin.getName() && apsw==admin.getPassword()) {
			return admin;
	}
	
	else 
	{
		System.out.println("Invalid admin name or password :");
		return null;
	}
	
	}
	@Override
	public boolean logout() 
	{
		System.exit(0);
		return true;
	}

}

