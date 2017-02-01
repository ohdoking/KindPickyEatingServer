package com.yapp.kindpickyeating.service;

import com.yapp.kindpickyeating.dto.LoginDto;
import com.yapp.kindpickyeating.dto.UserDto;

public interface UserService {

	public UserDto login(LoginDto user);
	public Integer join(UserDto user);
	public void logout();
}
