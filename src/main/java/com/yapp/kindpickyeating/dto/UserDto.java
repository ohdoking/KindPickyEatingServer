package com.yapp.kindpickyeating.dto;

import java.io.Serializable;


public class UserDto implements Serializable{

	private static final long serialVersionUID = 6619995272398326731L;
	
	private String email;
	private String password;
	private String nickname;
	
	private String religion;
	private String user_category;
	
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getUserCategory() {
		return user_category;
	}
	public void setUserCategory(String user_category) {
		this.user_category = user_category;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
