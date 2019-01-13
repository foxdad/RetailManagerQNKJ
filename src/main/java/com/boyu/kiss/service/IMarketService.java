package com.boyu.kiss.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.boyu.kiss.result.MarketVo;

public interface IMarketService{
	/**
	 * 获取市场列表
	 * @return
	 */
	public List<MarketVo> getMarkets();
}
