package com.cg.service;

import com.cg.entities.Admin;

public interface IAdminService {
Admin addNewadmin(Admin admin);
Admin updateAdmin(Admin admin);
Admin login(Admin admin);
Boolean logout();

}
