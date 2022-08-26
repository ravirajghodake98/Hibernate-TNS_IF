package com.cg.client;

import com.cg.entities.Certificate;
import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.service.CertificateServiceImpl;
import com.cg.service.CollegeServiceImpl;
import com.cg.service.ICertificateService;
import com.cg.service.ICollegeService;
import com.cg.service.IPlacementService;
import com.cg.service.IPlacementServiceImpl;
import com.cg.service.IUserService;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;
import com.cg.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		Student std = new Student();
		StudentService service = new StudentServiceImpl();
		
		std.setID(2001);
		std.setNAME("Vishwanath");
		std.setROLLNO(101);
		std.setQUALIFICATION("BE");
		std.setCOURSE("CSE");
		std.setYEAR(2022);
		std.setHALLTICKET(1001);
//		service.addStudent(std);
		
		Certificate c = new Certificate();
//		ICertificateService service1 = new CertificateServiceImpl();
		
		c.setId(502);
		c.setYear(2020);
//		service.addCertificate(c);
		
		std.setCertificate(c);
		c.setstd(std);
		
		System.out.println("data is inserted");
	}
	
}
		
		
		
		
		
		
		
		/*
//		Student
		
		Student std = new Student();
		StudentService service = new StudentServiceImpl();
	// creating DB
	
		std.setID(7);
		std.setNAME("Vishwanath");
		std.setROLLNO(101);
		std.setQUALIFICATION("BE");
		std.setCOURSE("CSE");
		std.setYEAR(2022);
		std.setCERTIFICATE("JAVA-Full Stack");
		std.setHALLTICKET(1001);
		std.setCOLLEGE("JSCOE");
		service.addStudent(std);
		
		//Retrieve
		/*std =service.searchStudentByID(2);
		System.out.println("ID is " +std.getID());
		System.out.println("NAME is "+std.getNAME());
		System.out.println("COLLEGE is "+std.getCOLLEGE());*/
		
		//Update
		/*std = service.searchStudentByID(7);
		std.setROLLNO(109);
		service.updateStudent(std);*/
				
		//Delete
		/*std= service.searchStudentByID(7);
		service.deleteStudent(std);*/
		
		
		
		
		
		//CRUD operation calling activity
		/*
		 * User
		 * 
		User user = new User();
		IUserService service = new UserServiceImpl();
			
		
		//CRUD
		user.setId(401);
		user.setName("Raviraj");
		user.setType("");
		user.setPassword("12345678");
		
		service.addNewUser(user);
		*/
		
		
		
		
		
		/*
		//Certificate
		 * 
		Certificate certificate = new Certificate();
		ICertificateService service = new CertificateServiceImpl();
		 
		certificate.setId(502);
		certificate.setYear(2020);
		certificate.setCollege("MIT");
		System.out.println("updated successfully");
		
		service.addCertificate(certificate);
		*/
		
		
		
		
		/*
//		 Placement 
		 
		IPlacementService pla= new IPlacementServiceImpl();
		Placement p=new Placement();
		p.setId(12l);
		p.setName("Sidhhi");
		p.setCollege(null);
		p.setQualification("B.Tech");
		p.setYear(4);
		p.setDate(null);
		pla.addPlacement(p);
		
	/*	p=pla.searchPlacement(12l);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getQualification());
		*/
		
		
		
		
		/*
//		 college
		College college = new College();
		ICollegeService service= new CollegeServiceImpl();
		
		//Create Operation
		college.setId(001);
		college.setCollegeAdmin("Shabnam");
		college.setCollegeName("PCCOE");
		college.setLocation("Pune");
		
		service.addCollege(college);
		
	}

}
*/