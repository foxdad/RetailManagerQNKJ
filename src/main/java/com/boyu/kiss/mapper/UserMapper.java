package com.boyu.kiss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boyu.kiss.entity.Aaa;
import com.boyu.kiss.entity.User;

public interface UserMapper extends BaseMapper<User>{

	public List<User> findUserByRoleAndName(@Param("userName")String userName,@Param("roleId1")int roleId1,@Param("roleId2")int roleId2);
	
	public List<Aaa> test();
}
