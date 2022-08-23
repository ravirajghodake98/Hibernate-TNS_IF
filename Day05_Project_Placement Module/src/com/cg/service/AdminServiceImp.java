package com.cg.service;

import java.util.Scanner;

import com.cg.dao.AdminRepositoryImp;
import com.cg.entities.Admin;

public class AdminServiceImp implements IAdminService{
private AdminRepositoryImp dao;

Scanner s= new Scanner(System.in);

@Override
public Admin addNewadmin(Admin admin) {
dao.beginTransaction();
dao.addNeAdmin(admin);
dao.commitTransaction();
return admin;
}

@Override
public Admin updateAdmin(Admin admin) {
dao.beginTransaction();
dao.addNeAdmin(admin);
dao.commitTransaction();
return admin;
}

@Override
public Admin login(Admin admin) {
System.out.println("The Name of Admine: ");
String dname=s.nextLine();
System.out.println("Enter the Password: ");
String dpassword=s.nextLine();
if (dname==admin.getName()&& dpassword==admin.getPassword())
{
return admin;
}
else {
System.out.println("Invalid Name or password");
return null;
}
}

@Override
public Boolean logout() {
return null;
}
}