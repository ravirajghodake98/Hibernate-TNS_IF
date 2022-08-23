package com.cg.dao;

import com.cg.entities.Admin;

public interface IAdminRepository {
Admin addNeAdmin(Admin admin);
Admin updateAdmin(Admin admin);
Admin deleteAdmin(long id);
void beginTransaction();
void commitTransaction();


}