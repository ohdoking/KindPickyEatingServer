package com.yapp.kindpickyeating.dto;

import java.io.Serializable;

public class LoginDto implements Serializable{

	private static final long serialVersionUID = 6619995272398326732L;
	
	private String email;
	private String pw;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
