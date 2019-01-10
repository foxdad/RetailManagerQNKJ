package com.boyu.kiss.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boyu.kiss.entity.User;
import com.boyu.kiss.service.impl.UserServiceImpl;


@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl serviceImpl;
	
	
	@RequestMapping("/getUser.do")
	@ResponseBody
	public User getUser(Integer id){
		User user = serviceImpl.selectById(id);
		int i = 0;

		return user;
	}
	
	@RequestMapping("/save.do")
	@ResponseBody
	public String save(User user){
		serviceImpl.insert(user);
		return "success";
	}
	
	@RequestMapping("/login.do")
	@ResponseBody
	public Map<String, Object> login(String username,String password,int roleId) {
		Map<String, Object> map = serviceImpl.login(username,password,roleId);
		return map;
	}
}
