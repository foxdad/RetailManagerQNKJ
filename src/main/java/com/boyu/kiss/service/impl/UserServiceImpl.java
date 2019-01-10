package com.boyu.kiss.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.OrderVO;
import com.boyu.kiss.entity.Orderitem;
import com.boyu.kiss.entity.Store;
import com.boyu.kiss.entity.User;
import com.boyu.kiss.entity.UserInfo;
import com.boyu.kiss.mapper.OrderMapper;
import com.boyu.kiss.mapper.UserMapper;
import com.boyu.kiss.result.ShopcartResults;
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
	@Autowired
	private OrderServiceImpl orderService;
	@Autowired
	private ShopcartServiceImpl shopcartService;
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
			int storeId = user.getStoreId();
			int userId = user.getId();
			if(!pwd.equals(password)) {
				resultMap.put("result","用户名或密码错误");
			}
			else {
				if(roleId == 2) {
					
					List<Orderitem> orderitemList = orderitemService.selectByStoreId(storeId);
					
					
					UserInfo userInfo = userInfoService.selectById(userId);
					
					Store store = storeService.selectById(storeId);
					
					resultMap.put("user", user);
					resultMap.put("userInfo", userInfo);
					resultMap.put("orderitemList", orderitemList);
					resultMap.put("store", store);
				}
				else if(roleId == 1) {
					//根据用户id,查询属于这个用户的所有订单
					List<OrderVO> order = orderService.getOrderByUserId(userId);
					//根据店铺id查询店铺信息
					Store store = storeService.selectById(storeId);
					
					UserInfo userInfo = userInfoService.selectById(userId);
					
					List<ShopcartResults> shopcartList = shopcartService.getShopcartByUserId(userId);
					
					resultMap.put("order", order);
					resultMap.put("user", user);
					resultMap.put("store", store);
					resultMap.put("userInfo", userInfo);
					resultMap.put("shopcartList", shopcartList);
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
