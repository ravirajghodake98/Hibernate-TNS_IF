package com.cg.repository;

import com.cg.entities.User;

public interface IUserDao
{
	public User addNewUser(User user);
	public User updateUser(User user);
	public User deleteUser(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
