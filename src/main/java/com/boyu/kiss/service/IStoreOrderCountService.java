package com.boyu.kiss.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IStoreOrderCountService {
	/**
	 * 获取指定条件的店铺排行id
	 * @param marketid 市场ID
	 * @param date 时间
	 * @param num 前几个店铺
	 * @return
	 */
	public List<Integer> gOrderCounts(Integer marketid,Integer num);
}
