package com.boyu.kiss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.CommodityType;
import com.boyu.kiss.mapper.CommodityTypeMapper;
import com.boyu.kiss.result.CommodityTypeVo;
import com.boyu.kiss.service.ICommodityTypeService;

@Service
public class CommodityTypeServiceImpl extends BaseServiceImpl<CommodityTypeMapper, CommodityType> implements ICommodityTypeService{
	
	@Autowired
	private CommodityTypeMapper mapper;
	
	@Override
	public List<CommodityTypeVo> geTypeVos(String market, String storeName) {
		return mapper.geTypeVos(market, storeName);
	}
	
}
