package com.boyu.kiss.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boyu.kiss.entity.Shopcart;
import com.boyu.kiss.result.ShopcartResults;

public interface ShopcartMapper extends BaseMapper<Shopcart>{

	public List<ShopcartResults> getRetailShopcartByUserId(int userId);
	
	public List<ShopcartResults> getWholesalersShopcartByUserId(int userId);
}
