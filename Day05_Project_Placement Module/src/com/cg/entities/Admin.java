package com.cg.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Admin")

public class Admin implements Serializable {
private static final long serialVersionUID = 1L;

@Id
private long ID;
private String Name;
private String Password;
public Admin() {
super();
}


public long getID() {
return ID;
}
public void setID(long iD) {
ID = iD;
}
public String getName() {
return Name;
}
public void setName(String name) {
Name = name;
}
public String getPassword() {
return Password;
}
public void setPassword(String password) {
Password = password;
}



}