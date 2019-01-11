package com.boyu.kiss.entity;

import java.io.Serializable;


import com.baomidou.mybatisplus.annotations.TableId;
import java.math.BigDecimal;


/**
 * The persistent class for the t_commodity database table.
 * 
 */

public class Commodity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9219318847544351040L;
	
	@TableId
	private Integer id;
	
	private String goodsName;
	
	private BigDecimal wholesalePrice;
	
	private BigDecimal retailPrice;
	
	private BigDecimal marketPrice;
	
	private String image;
	
	private String detailedurl;

	private String unit;
	
	private Integer minNum;

	private String 	shelfLife;
	
	private String brand;
	
	private Integer secondtypeId;
	
	private Integer imported;
	
	private String info;

	private Integer firsttypeId;
	
	private Integer storeId;

	private Integer stocks;

	private Integer isShelfs;
	
	
	public BigDecimal getWholesalePrice() {
		return wholesalePrice;
	}
	public void setWholesalePrice(BigDecimal wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}
	public BigDecimal getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}
	public BigDecimal getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}
	public Integer getStocks() {
		return stocks;
	}
	public void setStocks(Integer stocks) {
		this.stocks = stocks;
	}
	public Integer getIsShelfs() {
		return isShelfs;
	}
	public void setIsShelfs(Integer isShelfs) {
		this.isShelfs = isShelfs;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDetailedurl() {
		return detailedurl;
	}
	public void setDetailedurl(String detailedurl) {
		this.detailedurl = detailedurl;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Integer getMinNum() {
		return minNum;
	}
	public void setMinNum(Integer minNum) {
		this.minNum = minNum;
	}
	public String getShelfLife() {
		return shelfLife;
	}
	public void setShelfLife(String shelfLife) {
		this.shelfLife = shelfLife;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getSecondtypeId() {
		return secondtypeId;
	}
	public void setSecondtypeId(Integer secondtypeId) {
		this.secondtypeId = secondtypeId;
	}
	public Integer getImported() {
		return imported;
	}
	public void setImported(Integer imported) {
		this.imported = imported;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Integer getFirsttypeId() {
		return firsttypeId;
	}
	public void setFirsttypeId(Integer firsttypeId) {
		this.firsttypeId = firsttypeId;
	}
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	
	public Commodity() {
		// TODO 自动生成的构造函数存根
	}
	
	
	

}