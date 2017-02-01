package com.yapp.kindpickyeating.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yapp.kindpickyeating.dao.UserDao;
import com.yapp.kindpickyeating.dto.LoginDto;
import com.yapp.kindpickyeating.dto.UserDto;
import com.yapp.kindpickyeating.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
    private UserDao userDao;
	
	@Override
	public UserDto login(LoginDto user) {
		return userDao.login(user);
	}

	@Override
	public Integer join(UserDto user) {
		return userDao.join(user);

	}

	@Override
	public void logout() {

	}

}
