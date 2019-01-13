package com.boyu.kiss.service;

import java.util.List;
import java.util.Map;

public interface CommodityService {
	
	/**
	 * 根据商品id列表查询商品信息
	 * @param list
	 * @return
	 */
	public List<Map<String, Object>> getCommodity(List<Integer> list);
	
	/**
	 * 根据店铺id分类id查询商品信息
	 * @param storeId
	 * @param typeId
	 * @return
	 */
	public List<Map<String, Object>> getCommodity(Integer storeId,Integer typeId);
	
	/**
	 * 根据商品id查询商品详细信息
	 * @param commodityId
	 * @return
	 */
	public List<Map<String, Object>> getCommodityInfo(Integer commodityId);
}
