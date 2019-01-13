package com.boyu.kiss.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.boyu.kiss.entity.Commodity;
import com.boyu.kiss.mapper.CommodityMapper;
import com.boyu.kiss.service.CommodityService;

@Service
public class CommodityServiceImpl extends BaseServiceImpl<CommodityMapper, Commodity>implements CommodityService{
	
	@Autowired
	private CommodityMapper mapper;
	@Override
	public List<Map<String, Object>> getCommodity(List<Integer> list) {
		return mapper.selectMaps(new EntityWrapper<Commodity>()
				.setSqlSelect("id,Image,wholesalePrice,storeId")
				.in("id", list)
				.eq("isShelfs", 1)
				);
	}
	@Override
	public List<Map<String, Object>> getCommodity(Integer storeId,Integer typeId) {
		return mapper.selectMaps(new EntityWrapper<Commodity>()
				.setSqlSelect("id,goodsName,Image")
				.eq("isShelfs", 1)
				.eq("storeId", storeId)
				.eq("firsttypeId", typeId)
				);
	}
	@Override
	public List<Map<String, Object>> getCommodityInfo(Integer commodityId) {
		return mapper.selectMaps(new EntityWrapper<Commodity>()
				.setSqlSelect("Image,stocks,minNum,ShelfLife,info,Detailedurl,imported")
				.eq("firsttypeId",commodityId)
				.eq("isShelfs", 1)
				);
	}

}
