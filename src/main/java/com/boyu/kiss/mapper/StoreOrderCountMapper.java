package com.boyu.kiss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boyu.kiss.entity.StoreOrderCount;

public interface StoreOrderCountMapper extends BaseMapper<StoreOrderCount>{
	/**
	 * 获取指定条件的店铺排行id
	 * @param marketid 市场ID
	 * @param date 时间
	 * @param num 前几个店铺
	 * @return
	 */
	public List<Integer> gOrderCounts(@Param("marketid")Integer marketid
			,@Param("date")String date,@Param("num")Integer num);
}
