package com.finairo.omni.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="customer")
public class customerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id", nullable = false, unique = true) 
    private Long custNo;
	
	@Column(nullable = false, length = 50) 
	private String Firstname = "";
	
	@Column(nullable = false, length = 50) 
	private String middleName = "";
	
	@Column(nullable = false, length = 50) 
	private String lastName = "";	
	
	@Column(nullable = false, length = 100) 
	private String emailId  = "";
	
	@Column(nullable = false, length = 12) 
	private String mobileNo = "";	
	
	@Column(nullable = false, length = 20) 
	private String country  = "";
	
	@Column(nullable = false, length = 20) 
	private String state    = "";
	
	@Column(nullable = false, length = 8) 
	private String pinCode  = "";
	
	@Column(nullable = false, length = 20) 
	private String panNo  = "";

	public Long getCustNo() {
		return custNo;
	}

	public void setCustNo(Long custNo) {
		this.custNo = custNo;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	
	
	
}
