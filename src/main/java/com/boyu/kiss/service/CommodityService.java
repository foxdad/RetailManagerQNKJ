package com.boyu.kiss.service;

import java.util.List;
import java.util.Map;

public interface CommodityService {
	
	/**
	 * 根据商品id查询商品信息
	 * @param list
	 * @return
	 */
	public List<Map<String, Object>> getCommodity(List<Integer> list);
}
