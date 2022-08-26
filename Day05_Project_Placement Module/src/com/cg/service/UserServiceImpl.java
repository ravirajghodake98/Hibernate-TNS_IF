package com.cg.service;

import com.cg.entities.User;
import com.cg.repository.IUserDao;
import com.cg.repository.UserDaoImpl;

public class UserServiceImpl implements IUserService
{
	//Step 1: establishing connection between service and dao
	private IUserDao dao;
	
	public UserServiceImpl()
	{
		dao = new UserDaoImpl();
	}

	//Step2: Service call to perform CRUD operation
	@Override
	public User addNewUser(User user) {
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		System.out.println("Name of user: ");
		return user;
	}

	@Override
	public boolean logOut() {
			
		return false;
	}

}
