package com.boyu.kiss.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.Orderitem;
import com.boyu.kiss.entity.Store;
import com.boyu.kiss.entity.User;
import com.boyu.kiss.entity.UserInfo;
import com.boyu.kiss.mapper.UserMapper;

import com.boyu.kiss.service.IUserService;

/**
 * 
 * @author Kiss
 *
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper,User> implements IUserService{

	@Autowired
	private OrderitemServiceImpl orderitemService;
	@Autowired
	private UserInfoServiceImpl userInfoService;
	@Autowired
	private StoreServiceImpl storeService;
	public Map<String, Object> login(String username, String password, int roleId) {
		//根据用户名和角色id查询用户是否存在
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("userName", username);
		map.put("roleId", roleId);
		List<User> list = this.selectByMap(map);
		Map<String, Object> resultMap = new HashMap<String,Object>();
		//测试
		if(list!=null&&list.size()>=1) {
			//存在则比较密码是否正确
			User user = list.get(0);
			String pwd = user.getPassword();
			
			if(!pwd.equals(password)) {
				resultMap.put("result","用户名或密码错误");
			}
			else {
				if(roleId == 2) {
					int storeId = user.getStoreId();
					List<Orderitem> orderitemList = orderitemService.selectByStoreId(storeId);
					
					int userId = list.get(0).getId();
					UserInfo userInfo = userInfoService.selectById(userId);
					
					Store store = storeService.selectById(storeId);
					
					resultMap.put("user", user);
					resultMap.put("userInfo", userInfo);
					resultMap.put("orderitemList", orderitemList);
					resultMap.put("store", store);
				}
				else if(roleId == 1) {
					
				}
				// maps.put("userlist", list);
			}
			
		} 
		//不存在则返回相应错误信息
		else {
			resultMap.put("result","用户名不存在");
		}
		
		return resultMap;
	}

}