package com.boyu.kiss.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.boyu.kiss.result.StoreVo;

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
	/**
	 * 查询店铺列表分页
	 * @param ownerName
	 * @param storeName
	 * @param begin
	 * @param end
	 * @return
	 */
	public List<StoreVo> getStoreVo(String ownerName,
			String storeName,Integer begin,Integer end);
	/**
	 * 查询店铺列表总数
	 * @param ownerName
	 * @param storeName
	 * @return
	 */
	public int getCountStore(String ownerName,String storeName);
}
