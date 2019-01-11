package com.boyu.kiss.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotations.TableId;


/**
 * The persistent class for the t_store database table.
 * 
 */
public class Store implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int storeId;

	private String address;

	private String closeTime;

	private String dpjydUrl;

	private String dzsfzUrl;

	private String license;

	private int marketId;

	private String openTime;

	private String ownerName;

	private String phone;

	private int shtg;

	private int state;

	private String storeName;

	private String storeType;

	private int type;

	private String yxzsUrl;

	private String yyxkz;
	
	private String logoUrl;
	
	private String slogan;
	
	public Store() {
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCloseTime() {
		return this.closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public String getDpjydUrl() {
		return this.dpjydUrl;
	}

	public void setDpjydUrl(String dpjydUrl) {
		this.dpjydUrl = dpjydUrl;
	}

	public String getDzsfzUrl() {
		return this.dzsfzUrl;
	}

	public void setDzsfzUrl(String dzsfzUrl) {
		this.dzsfzUrl = dzsfzUrl;
	}

	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public int getMarketId() {
		return this.marketId;
	}

	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}

	public String getOpenTime() {
		return this.openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getShtg() {
		return this.shtg;
	}

	public void setShtg(int shtg) {
		this.shtg = shtg;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreType() {
		return this.storeType;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getYxzsUrl() {
		return this.yxzsUrl;
	}

	public void setYxzsUrl(String yxzsUrl) {
		this.yxzsUrl = yxzsUrl;
	}

	public String getYyxkz() {
		return this.yyxkz;
	}

	public void setYyxkz(String yyxkz) {
		this.yyxkz = yyxkz;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	
	
}