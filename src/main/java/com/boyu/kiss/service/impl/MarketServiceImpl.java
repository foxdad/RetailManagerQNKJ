package com.boyu.kiss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.Market;
import com.boyu.kiss.mapper.MarketMapper;
import com.boyu.kiss.result.MarketVo;
import com.boyu.kiss.service.IMarketService;

@Service
public class MarketServiceImpl extends BaseServiceImpl<MarketMapper, Market> implements IMarketService{
	
	@Autowired
	private MarketMapper mapper;
	@Override
	public List<MarketVo> getMarkets() {
		return mapper.getMarkets();
	}
	
}
