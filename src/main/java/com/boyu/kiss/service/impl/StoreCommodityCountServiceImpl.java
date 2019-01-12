package com.boyu.kiss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.StoreCommodityCount;
import com.boyu.kiss.mapper.StoreCommodityCountMapper;
import com.boyu.kiss.service.IStoreCommodityCountService;

@Service
public class StoreCommodityCountServiceImpl extends BaseServiceImpl<StoreCommodityCountMapper, StoreCommodityCount> implements IStoreCommodityCountService{
	@Autowired
	private StoreCommodityCountMapper sMapper;

	@Override
	public List<Integer> getIdList(Integer storeid, String date, Integer num) {
		return sMapper.getIdList(storeid, date, num);
	}	
}
