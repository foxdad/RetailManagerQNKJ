package com.boyu.kiss.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.Commodity;
import com.boyu.kiss.entity.OrderVO;
import com.boyu.kiss.entity.Store;
import com.boyu.kiss.entity.User;
import com.boyu.kiss.entity.UserInfo;
import com.boyu.kiss.mapper.UserMapper;
import com.boyu.kiss.result.ShopcartResults;
import com.boyu.kiss.result.UserVO;
import com.boyu.kiss.service.IUserService;

/**
 * 
 * @author Kiss
 *
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper,User> implements IUserService{

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserInfoServiceImpl userInfoService;
	@Autowired
	private StoreServiceImpl storeService;
	@Autowired
	private OrderServiceImpl orderService;
	@Autowired
	private ShopcartServiceImpl shopcartService;
	@Autowired
	private CommodityServiceImpl commodityService;

	public Map<String, Object> login(String username, String password, int roleId) {
		
		List<User> list = null;
		if(roleId == 0) {
			//查询角色为1：零售商或角色为3：普通用户，用户名为username的是否存在
			list = userMapper.findUserByRoleAndName(username, 1, 3);
		}
		else{
			//根据用户名和角色id查询用户是否存在
			Map<String, Object> map = new HashMap<String,Object>();
			map.put("userName", username);
			map.put("roleId", roleId);
			list = this.selectByMap(map);
		}
		Map<String, Object> resultMap = new HashMap<String,Object>();
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
					
					List<OrderVO> orderList = orderService.getOrderByStoreId(storeId);
					
					UserInfo userInfo = userInfoService.selectById(userId);
					
					Store store = storeService.selectById(storeId);
					
					Map<String, Object> commodityMap = new HashMap<String,Object>();
					commodityMap.put("storeId", storeId);
					List<Commodity> commodityList = commodityService.selectByMap(commodityMap);
					resultMap.put("user", user);
					resultMap.put("userInfo", userInfo);
					resultMap.put("orderList", orderList);
					resultMap.put("store", store);
					resultMap.put("commodityList", commodityList);
				}
				else if(roleId == 0) {
					int role = user.getRoleid();
					//根据用户id,查询属于这个用户的所有订单
					List<OrderVO> orderList = orderService.getOrderByUserId(userId);
					//如果是零售商则返回店铺信息，普通用户则不返回
					if(role == 1) {
						//根据店铺id查询店铺信息
						Store store = storeService.selectById(storeId);
						List<ShopcartResults> shopcartList = shopcartService.getWholesalersShopcartByUserId(userId);
						resultMap.put("store", store);
						resultMap.put("shopcartList", shopcartList);
					}
					if(role == 3) {
						List<ShopcartResults> shopcartList = shopcartService.getRetailShopcartByUserId(userId);
						resultMap.put("shopcartList", shopcartList);
					}
					
					UserInfo userInfo = userInfoService.selectById(userId);
					
					resultMap.put("orderList", orderList);
					resultMap.put("user", user);

					resultMap.put("userInfo", userInfo);
					
				}
				// maps.put("userlist", list);
				else {
				}
			}
			
		} 
		//不存在则返回相应错误信息
		else {
			resultMap.put("result","用户名不存在");
		}
		/*Map<String, Object> resultMap = new HashMap<String,Object>();
		List<Aaa> list = userMapper.test();
		resultMap.put("test", list);*/
		return resultMap;
	}
	@Override
	public User selectUser(String username, String password) {
		return userMapper.selectUser(username, password);
	}

	
	public List<UserVO> selectUserList() {
		List<UserVO> list = userMapper.selectUserList();
		return list;
	}

}
