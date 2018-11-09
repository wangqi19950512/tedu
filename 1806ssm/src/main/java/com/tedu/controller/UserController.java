package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.mybatis.pojo.User;
import com.tedu.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/user/find")
	public List<User> findAll(){
		return userService.findAll();
	}
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String Insert(User user){
		return userService.Insert(user);
		
	}
}
