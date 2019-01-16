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

	private String dpjydUrl;//店铺经营地

	private String dzsfzUrl;//身份证正面

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

	private String yyxkz;//营业许可
	
	private String logoUrl;
	
	private String slogan;
	private int monday;
	private int tuesday;
	private int wednesday;
	private int thursday;
	private int friday;
	private int sunday;
	private int saturday;
	private String handheIdURL;//手持身份证
	private String reverseIdURL;//身份证反面
	
	
	
	public String getHandheIdURL() {
		return handheIdURL;
	}

	public void setHandheIdURL(String handheldIdURL) {
		this.handheIdURL = handheldIdURL;
	}

	public String getReverseIdURL() {
		return reverseIdURL;
	}

	public void setReverseIdURL(String reverseIdURL) {
		this.reverseIdURL = reverseIdURL;
	}

	public int getMonday() {
		return monday;
	}

	public void setMonday(int monday) {
		this.monday = monday;
	}

	public int getTuesday() {
		return tuesday;
	}

	public void setTuesday(int tuesday) {
		this.tuesday = tuesday;
	}

	public int getWednesday() {
		return wednesday;
	}

	public void setWednesday(int wednesday) {
		this.wednesday = wednesday;
	}

	public int getThursday() {
		return thursday;
	}

	public void setThursday(int thursday) {
		this.thursday = thursday;
	}

	public int getFriday() {
		return friday;
	}

	public void setFriday(int friday) {
		this.friday = friday;
	}

	public int getSunday() {
		return sunday;
	}

	public void setSunday(int sunday) {
		this.sunday = sunday;
	}

	public int getSaturday() {
		return saturday;
	}

	public void setSaturday(int saturday) {
		this.saturday = saturday;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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