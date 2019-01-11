package com.boyu.kiss.service;

import java.util.List;

import com.boyu.kiss.entity.OrderVO;

public interface IOrderService {

	public List<OrderVO> getOrderByUserId(int userId);
	
	public List<OrderVO> getOrderByStoreId(int storeId);
}
