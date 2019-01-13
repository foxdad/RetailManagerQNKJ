package com.boyu.kiss.service;

import java.util.List;
import java.util.Map;

public interface IStoreService{
	
	/**
	 * 根据市场id获取店铺
	 * @param marketId
	 * @return
	 */
	public List<Map<String, Object>> getStore(Integer marketId);
	
	/**
	 * 查询推荐店铺信息
	 * @param list
	 * @return
	 */
	public List<Map<String, Object>> getTopStore(List<Integer> list);
	
}
