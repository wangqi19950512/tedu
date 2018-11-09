package com.tedu.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mapper.UserMapper;
import com.tedu.mybatis.pojo.User;
import com.tedu.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	public List<User> findAll(){
		return userMapper.findAll();
	}
	@Override
	public String Insert(User user) {
		try {
			userMapper.insert(user);
			return "cheng gong";
		} catch (Exception e) {
			e.printStackTrace();
			return "shi bai";
		}
		
	}
}
