package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;


/**
 * The persistent class for the t_market database table.
 * 
 */
public class Market implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private String city;

	private String coordinate;

	private String county;

	private String marketName;

	private String province;
	
	private Double longitude;
	
	private Double latitude;
	
	public Market() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCoordinate() {
		return this.coordinate;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getMarketName() {
		return this.marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
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