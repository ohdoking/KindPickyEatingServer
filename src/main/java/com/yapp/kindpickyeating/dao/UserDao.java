package com.yapp.kindpickyeating.dao;

import com.yapp.kindpickyeating.dto.LoginDto;
import com.yapp.kindpickyeating.dto.UserDto;

public interface UserDao {

	public UserDto login(LoginDto user);
	public Integer join(UserDto user);
	public void logout();
}
