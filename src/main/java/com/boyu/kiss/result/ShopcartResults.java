package com.boyu.kiss.result;

import java.util.List;

import com.boyu.kiss.entity.ShopcartVO;

public class ShopcartResults {

	private int id;
	private String marketName;
	private List<ShopcartVO> shopcartVO;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public List<ShopcartVO> getShopcartVO() {
		return shopcartVO;
	}
	public void setShopcartVO(List<ShopcartVO> shopcartVO) {
		this.shopcartVO = shopcartVO;
	}
	
}
