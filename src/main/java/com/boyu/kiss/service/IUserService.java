package com.boyu.kiss.service;

import java.util.List;
import java.util.Map;

import com.boyu.kiss.entity.User;

/**
 * 
 * @author Kiss
 *
 */
public interface IUserService{

	public Map<String, Object> login(String username, String password, int roleId);
	
	public User selectUser(String username, String password);
}
