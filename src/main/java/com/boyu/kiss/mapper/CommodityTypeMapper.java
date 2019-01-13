package com.boyu.kiss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boyu.kiss.entity.CommodityType;
import com.boyu.kiss.result.CommodityTypeVo;

public interface CommodityTypeMapper extends BaseMapper<CommodityType>{
	/**
	 * 根据市场名和店铺名查询商品分类信息
	 * @param market
	 * @param storeName
	 * @return
	 */
	public List<CommodityTypeVo> geTypeVos(@Param("market")String market,@Param("storeName")String storeName);
}
