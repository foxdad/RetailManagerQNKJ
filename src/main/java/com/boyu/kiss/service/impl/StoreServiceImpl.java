package com.boyu.kiss.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.boyu.kiss.entity.Store;
import com.boyu.kiss.mapper.StoreMapper;
import com.boyu.kiss.service.IStoreService;

@Service
public class StoreServiceImpl extends BaseServiceImpl<StoreMapper, Store> implements IStoreService{
	
	@Autowired
	private StoreMapper smapper;
	
	@Override
	public List<Map<String, Object>> getStore(Integer marketId) {
		return smapper.selectMaps(new EntityWrapper<Store>()
				.setSqlSelect("storeId,storeName")
				.eq("marketId", marketId)
				.eq("type", 2)
				);
	}

	@Override
	public List<Map<String, Object>> getTopStore(List<Integer> list) {
		return smapper.selectMaps(new EntityWrapper<Store>()
				.setSqlSelect("storeId,storeName,openTime,closeTime,logoUrl,slogan")
				.in("storeId", list)
				);
	}
	
	
}
