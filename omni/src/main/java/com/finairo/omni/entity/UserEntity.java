package com.finairo.omni.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="userEntity")
public class UserEntity {
	

	@Id
	@Column(name = "userName", nullable = false, unique = true) 
	private String userName = "";
	
	@Column(nullable = false, length = 255) 
	private String password = "";
	
	@Column(nullable = false, length = 100) 
	private String emailId  = "";
	
	@Column(nullable = false, length = 10) 
	private String contactNo = "";	
	
	@Column(nullable = false, length = 10) 
	private String gender  = "";


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	
	
}
