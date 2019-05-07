package com.wipro.cakeshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class LoginModel {
	@Column(columnDefinition="VARCHAR(25)")
	  private String username;
	  @Column(columnDefinition="VARCHAR(25)")
	  private String password;
	  @Column(columnDefinition="VARCHAR(25)")
	  private String email;
	  @Column(columnDefinition="VARCHAR(10)")
	  private String phno;
	  @Column(columnDefinition="VARCHAR(50)")
	  private String quantity;
	  @Column(columnDefinition="VARCHAR(50)")
	  private String location;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	  
}
