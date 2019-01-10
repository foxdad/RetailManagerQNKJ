package com.boyu.kiss.result;

import com.boyu.kiss.entity.ShopcartVO;

public class ShopcartResults {

	private int id;
	private String marketName;
	private ShopcartVO shopcartVO;
	private int userId;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
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
	public ShopcartVO getShopcartVO() {
		return shopcartVO;
	}
	public void setShopcartVO(ShopcartVO shopcartVO) {
		this.shopcartVO = shopcartVO;
	}
}
