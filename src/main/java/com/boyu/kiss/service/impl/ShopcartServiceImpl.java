package com.boyu.kiss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.Shopcart;

import com.boyu.kiss.mapper.ShopcartMapper;
import com.boyu.kiss.result.ShopcartResults;
import com.boyu.kiss.service.IShopcartService;

@Service
public class ShopcartServiceImpl extends BaseServiceImpl<ShopcartMapper,Shopcart> implements IShopcartService{

	@Autowired
	private ShopcartMapper shopcartMapper;
	
	public List<ShopcartResults> getShopcartByUserId(int userId){
		List<ShopcartResults> list = shopcartMapper.getShopcartByUserId(userId);
		return list;
	}
}
