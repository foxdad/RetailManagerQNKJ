package com.boyu.kiss.service;

import java.util.List;

import com.boyu.kiss.entity.OrderVO;

public interface IOrderService {

	//根据用户id查询订单
	public List<OrderVO> getOrderByUserId(int userId);
	//根据店铺id查询属于这个店铺的订单
	public List<OrderVO> getOrderByStoreId(int storeId);
	//根据店铺id，时间段查询属于这个店铺的某个时间段的订单
	public List<OrderVO> getOrderByTime(int storeId,String startTime,String endTime);
}
