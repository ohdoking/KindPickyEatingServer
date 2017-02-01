package com.yapp.kindpickyeating.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yapp.kindpickyeating.dao.UserDao;
import com.yapp.kindpickyeating.dto.LoginDto;
import com.yapp.kindpickyeating.dto.UserDto;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
    private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }

	@Override
	public UserDto login(LoginDto user) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getUser",user);
	}

	@Override
	public Integer join(UserDto user) {
		return sqlSession.insert("insertUser",user);
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub

	}

}
