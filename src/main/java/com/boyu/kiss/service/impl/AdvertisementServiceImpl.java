package com.boyu.kiss.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.boyu.kiss.entity.Advertisement;
import com.boyu.kiss.mapper.AdvertisementMapper;
import com.boyu.kiss.service.IAdvertisementService;

@Service
public class AdvertisementServiceImpl extends BaseServiceImpl<AdvertisementMapper, Advertisement> implements IAdvertisementService{
	
	@Autowired
	private AdvertisementMapper mapper;
	@Override
	public List<Map<String, Object>> getAdvertisement(Integer marketid) {
		return mapper.selectMaps(new EntityWrapper<Advertisement>()
				.setSqlSelect("advertisementId,advertisementURL")
				.eq("marketid",marketid)
				.eq("yxbj", 1)
				);
	}
	
}
