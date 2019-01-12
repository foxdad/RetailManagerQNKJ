package com.boyu.kiss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boyu.kiss.entity.StoreCommodityCount;

public interface StoreCommodityCountMapper extends BaseMapper<StoreCommodityCount>{
	/**
	 * 根据条件查询商品id列表
	 * @param storeid
	 * @return
	 */
	public List<Integer> getIdList(@Param("storeid")Integer storeid,@Param("date")String date
			,@Param("num")Integer num);
}
