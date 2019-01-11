package com.boyu.kiss.service;

import java.util.List;

import com.boyu.kiss.result.ShopcartResults;

public interface IShopcartService {

	public List<ShopcartResults> getRetailShopcartByUserId(int userId);
	
	public List<ShopcartResults> getWholesalersShopcartByUserId(int userId);
}
