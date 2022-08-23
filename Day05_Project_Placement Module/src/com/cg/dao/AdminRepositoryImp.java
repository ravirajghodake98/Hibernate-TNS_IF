package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Admin;

public  class AdminRepositoryImp implements IAdminRepository{
private EntityManager entityManager;

    public AdminRepositoryImp() {
    entityManager=JPAUtil.getEntityManager();
    }

@Override
public Admin addNeAdmin(Admin admin) {
entityManager.persist(admin);
return admin;
}

@Override
public Admin updateAdmin(Admin admin) {
entityManager.merge(admin);
return admin;

}

@Override
public Admin deleteAdmin(long id) {
entityManager.remove(id);
return null;
}

public void beginTransaction() {
entityManager.getTransaction().begin();

}
public void commitTransaction() {
entityManager.getTransaction().commit();


}


}
