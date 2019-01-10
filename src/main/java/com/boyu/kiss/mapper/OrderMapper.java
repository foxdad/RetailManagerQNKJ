package com.boyu.kiss.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boyu.kiss.entity.Order;
import com.boyu.kiss.entity.OrderVO;

public interface OrderMapper extends BaseMapper<Order>{

	public List<OrderVO> getOrderByUserId(int userId);
}
