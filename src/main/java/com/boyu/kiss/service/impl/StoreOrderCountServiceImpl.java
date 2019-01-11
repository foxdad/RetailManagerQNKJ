package com.boyu.kiss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.StoreOrderCount;
import com.boyu.kiss.mapper.StoreOrderCountMapper;
import com.boyu.kiss.service.IStoreOrderCountService;

@Service
public class StoreOrderCountServiceImpl extends BaseServiceImpl<StoreOrderCountMapper, StoreOrderCount> implements IStoreOrderCountService{
	
	@Autowired
	private StoreOrderCountMapper smapper;
	
	@Override
	public List<Integer> gOrderCounts(Integer marketid, String date, Integer num) {
		// TODO Auto-generated method stub
		return smapper.gOrderCounts(marketid, date, num);
	}

}
