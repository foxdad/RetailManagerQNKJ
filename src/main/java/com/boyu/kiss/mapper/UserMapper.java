package com.boyu.kiss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.boyu.kiss.entity.User;
import com.boyu.kiss.result.UserVO;

public interface UserMapper extends BaseMapper<User>{

	public List<User> findUserByRoleAndName(@Param("userName")String userName,@Param("roleId1")int roleId1,@Param("roleId2")int roleId2);
	
	/**
	 * 后台登录查询
	 * @param username
	 * @param password
	 * @return
	 */
	public User selectUser(@Param("username")String username,@Param("password")String password);
	
	public List<UserVO> selectUserList();
	
}
