package com.boyu.kiss.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.boyu.kiss.result.CommodityTypeVo;

public interface ICommodityTypeService {
	/**
	 * 根据市场名和店铺名查询商品分类信息
	 * @param market
	 * @param storeName
	 * @return
	 */
	public List<CommodityTypeVo> geTypeVos(String market,String storeName);
	
	/**
	 * 根据市场id和店铺id查询商品分类id
	 * @param marketId
	 * @param storeId
	 * @return
	 */
	public List<Integer> getTypeIds(Integer marketId,Integer storeId);
}
