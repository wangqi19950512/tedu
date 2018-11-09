package com.tedu.service;

import java.util.List;

import com.tedu.mybatis.pojo.User;

public interface UserService {
	public List<User> findAll();
	public String Insert(User user);
}
