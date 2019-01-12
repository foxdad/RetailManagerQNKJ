package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;

public class MarketVo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@TableId
	private int id;
	
	private String marketName;
	
	private Double longitude;
	
	private Double latitude;

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

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	
}
