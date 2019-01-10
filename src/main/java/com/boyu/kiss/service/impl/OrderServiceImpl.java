package com.boyu.kiss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.Order;
import com.boyu.kiss.entity.OrderVO;
import com.boyu.kiss.mapper.OrderMapper;
import com.boyu.kiss.service.IOrderService;

@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderMapper,Order> implements IOrderService{
	@Autowired
	private OrderMapper orderMapper;
	
	public List<OrderVO> getOrderByUserId(int userId){
		List<OrderVO> list = orderMapper.getOrderByUserId(userId);
		return list;
	}
}
