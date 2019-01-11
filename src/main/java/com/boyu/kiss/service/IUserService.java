package com.boyu.kiss.service;

import java.util.Map;

/**
 * 
 * @author Kiss
 *
 */
public interface IUserService{

	public Map<String, Object> login(String username, String password, int roleId);
}
