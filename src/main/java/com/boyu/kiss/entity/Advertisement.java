package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;


public class Advertisement implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int advertisementId;

	private String advertisementURL;

	private String detail;

	private String pageURL;
	
	private Integer marketid;
	
	public Integer getMarketid() {
		return marketid;
	}

	public void setMarketid(Integer marketid) {
		this.marketid = marketid;
	}

	public Advertisement() {
	}

	public int getAdvertisementId() {
		return this.advertisementId;
	}

	public void setAdvertisementId(int advertisementId) {
		this.advertisementId = advertisementId;
	}

	public String getAdvertisementURL() {
		return this.advertisementURL;
	}

	public void setAdvertisementURL(String advertisementURL) {
		this.advertisementURL = advertisementURL;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPageURL() {
		return this.pageURL;
	}

	public void setPageURL(String pageURL) {
		this.pageURL = pageURL;
	}

}