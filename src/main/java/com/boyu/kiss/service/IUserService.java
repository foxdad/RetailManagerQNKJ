package com.boyu.kiss.service;

import java.util.List;
import java.util.Map;

import com.boyu.kiss.entity.User;
import com.boyu.kiss.result.UserVO;

/**
 * 
 * @author Kiss
 *
 */
public interface IUserService{

	public Map<String, Object> login(String username, String password, int roleId);
	
	public User selectUser(String username, String password);
	
	
	public List<UserVO> selectUserList(int begin,int end);
	
	public int selectUserListCount();
}
