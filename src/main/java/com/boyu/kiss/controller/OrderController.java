package com.boyu.kiss.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boyu.kiss.entity.OrderVO;
import com.boyu.kiss.service.impl.OrderServiceImpl;
@RestController
public class OrderController {

	@Autowired
	private OrderServiceImpl orderServiceImpl;
	
	//根据时间获取订单
	@RequestMapping("/getOrderByTime")
	public Map<String,Object> getOrderByTime(Integer storeId,String startTime,String endTime){
		Map<String,Object> map = new HashMap<String,Object>();
		if(storeId!=null&&startTime!=null&&endTime!=null) {
			List<OrderVO> orderList = orderServiceImpl.getOrderByTime(storeId, startTime, endTime);
			map.put("result", orderList);
			return map;
		}
		else {
			map.put("result", "failed");
			return map;
		}
	}
}
