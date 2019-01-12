package com.boyu.kiss.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boyu.kiss.entity.Market;
import com.boyu.kiss.entity.MarketVo;

public interface MarketMapper extends BaseMapper<Market>{
	/**
	 * 获取市场列表
	 * @return
	 */
	public List<MarketVo> getMarkets();
}
