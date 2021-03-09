package com.huynhbaoloc.demo.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class UserDTO {
	
	
	private Long id;
	
	@NotEmpty(message = "First name is mandatory")
	private String firstName;
	
	@NotEmpty(message = "Middle name is mandatory")
	private String middleName;
	
	@NotEmpty(message = "Last name is mandatory")
	private String lastName;
	
	@NotEmpty(message = "Phone number is mandatory")
	private String phoneNumber;
	
	@NotEmpty(message = "Email is mandatory")
	@Email
	private String email;
	
	@NotEmpty(message = "Current address is mandatory")
	private String currentAddress;
	
	
	private String company;
	
	@NotEmpty(message = "Password is mandatory")
	private String password;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
