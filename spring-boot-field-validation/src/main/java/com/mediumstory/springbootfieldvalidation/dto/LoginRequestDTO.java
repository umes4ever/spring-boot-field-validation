package com.mediumstory.springbootfieldvalidation.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginRequestDTO {

	@NotNull(message = "Email is required.")
	@Size(min = 1, message = "Email is required.")
	@Email(message = "Email is not well formatted.")
	private String email;
	
	@NotNull(message = "Password is required.")
	@Size(min = 6, message = "Password should be atleast 6 characters.")
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
