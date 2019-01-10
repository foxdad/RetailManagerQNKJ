package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;

import java.math.BigDecimal;


/**
 * The persistent class for the t_commodity database table.
 * 
 */

public class Commodity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	
	private int _isShelf;

	private int _stock;

	private String brand;

	private String detailedurl;

	private int firsttypeId;

	private String goodsName;

	private String image;


	private int import_;

	private String info;

	private BigDecimal marketPrice;

	private int minNum;

	private BigDecimal retailPrice;

	private int secondtypeId;

	private String shelfLife;

	private int storeId;

	private String unit;

	private BigDecimal wholesalePrice;

	public Commodity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int get_isShelf() {
		return this._isShelf;
	}

	public void set_isShelf(int _isShelf) {
		this._isShelf = _isShelf;
	}

	public int get_stock() {
		return this._stock;
	}

	public void set_stock(int _stock) {
		this._stock = _stock;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDetailedurl() {
		return this.detailedurl;
	}

	public void setDetailedurl(String detailedurl) {
		this.detailedurl = detailedurl;
	}

	public int getFirsttypeId() {
		return this.firsttypeId;
	}

	public void setFirsttypeId(int firsttypeId) {
		this.firsttypeId = firsttypeId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getImport_() {
		return this.import_;
	}

	public void setImport_(int import_) {
		this.import_ = import_;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public BigDecimal getMarketPrice() {
		return this.marketPrice;
	}

	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}

	public int getMinNum() {
		return this.minNum;
	}

	public void setMinNum(int minNum) {
		this.minNum = minNum;
	}

	public BigDecimal getRetailPrice() {
		return this.retailPrice;
	}

	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}

	public int getSecondtypeId() {
		return this.secondtypeId;
	}

	public void setSecondtypeId(int secondtypeId) {
		this.secondtypeId = secondtypeId;
	}

	public String getShelfLife() {
		return this.shelfLife;
	}

	public void setShelfLife(String shelfLife) {
		this.shelfLife = shelfLife;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public BigDecimal getWholesalePrice() {
		return this.wholesalePrice;
	}

	public void setWholesalePrice(BigDecimal wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

}