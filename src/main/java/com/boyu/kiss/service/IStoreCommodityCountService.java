package com.boyu.kiss.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IStoreCommodityCountService {
	/**
	 * 根据条件查询商品id列表
	 * @param storeid
	 * @return
	 */
	public List<Integer> getIdList(Integer storeid,String date,Integer num);
}
