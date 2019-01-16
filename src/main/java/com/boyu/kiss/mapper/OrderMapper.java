package com.boyu.kiss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boyu.kiss.entity.Order;
import com.boyu.kiss.entity.OrderVO;

public interface OrderMapper extends BaseMapper<Order>{

	public List<OrderVO> getOrderByUserId(int userId);
	
	public List<OrderVO> getOrderByStoreId(int storeId);
	
	public List<OrderVO> getOrderByTime(@Param("storeId")int storeId,
			@Param("startTime")String startTime,
			@Param("endTime")String endTime);
}
