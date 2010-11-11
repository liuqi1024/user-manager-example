package com.finance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String login;
	private String name;
	private String email;
	private String phone;
	
	public long getId() {
  	return id;
  }
	public void setId(long id) {
  	this.id = id;
  }
	public String getLogin() {
  	return login;
  }
	public void setLogin(String login) {
  	this.login = login;
  }
	public String getName() {
  	return name;
  }
	public void setName(String name) {
  	this.name = name;
  }
	public String getEmail() {
  	return email;
  }
	public void setEmail(String email) {
  	this.email = email;
  }
	public String getPhone() {
  	return phone;
  }
	public void setPhone(String phone) {
  	this.phone = phone;
  }
}
