package com.boyu.kiss.entity;

import java.io.Serializable;

import com.alibaba.druid.pool.ha.selector.RandomDataSourceValidateThread;
import com.baomidou.mybatisplus.annotations.TableId;

import java.math.BigDecimal;
import java.security.interfaces.RSAMultiPrimePrivateCrtKey;


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
	private float wholesalePrice;
	private float retailPrice;
	private float marketPrice;
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
	private Integer stock;
	private Integer isShelf;
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
	public float getWholesalePrice() {
		return wholesalePrice;
	}
	public void setWholesalePrice(float wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}
	public float getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(float retailPrice) {
		this.retailPrice = retailPrice;
	}
	public float getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(float marketPrice) {
		this.marketPrice = marketPrice;
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
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getIsShelf() {
		return isShelf;
	}
	public void setIsShelf(Integer isShelf) {
		this.isShelf = isShelf;
	}
	public Commodity(Integer id, String goodsName, float wholesalePrice, float retailPrice, float marketPrice,
			String image, String detailedurl, String unit, Integer minNum, String shelfLife, String brand,
			Integer secondtypeId, Integer imported, String info, Integer firsttypeId, Integer storeId, Integer stock,
			Integer isShelf) {
		this.id = id;
		this.goodsName = goodsName;
		this.wholesalePrice = wholesalePrice;
		this.retailPrice = retailPrice;
		this.marketPrice = marketPrice;
		this.image = image;
		this.detailedurl = detailedurl;
		this.unit = unit;
		this.minNum = minNum;
		this.shelfLife = shelfLife;
		this.brand = brand;
		this.secondtypeId = secondtypeId;
		this.imported = imported;
		this.info = info;
		this.firsttypeId = firsttypeId;
		this.storeId = storeId;
		this.stock = stock;
		this.isShelf = isShelf;
	}
	public Commodity() {
		// TODO 自动生成的构造函数存根
	}
	
	
	

}