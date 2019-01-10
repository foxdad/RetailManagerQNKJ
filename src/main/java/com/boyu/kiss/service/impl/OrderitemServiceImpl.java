package com.boyu.kiss.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.Orderitem;
import com.boyu.kiss.mapper.OrderitemMapper;
import com.boyu.kiss.service.IOrderitemService;
@Service
public class OrderitemServiceImpl extends BaseServiceImpl<OrderitemMapper,Orderitem> implements IOrderitemService{

	//根据店铺id查找所有属于这个店铺的订单项
	public List<Orderitem> selectByStoreId(int storeId){
		Map<String, Object> mapBystore = new HashMap<String,Object>();
		mapBystore.put("storeId", storeId);
		List<Orderitem> orderitemList = this.selectByMap(mapBystore);
		return orderitemList;
	}
}
