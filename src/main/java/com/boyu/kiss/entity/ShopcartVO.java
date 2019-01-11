package com.boyu.kiss.entity;

import java.math.BigDecimal;

public class ShopcartVO {

	private int id;

	private String goodsName;

	private String image;

	private int imported;

	private String info;

	private int minNum;

	private BigDecimal price;

	private int storeId;

	private String unit;

	private int commodityid;

	private int num;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getImported() {
		return imported;
	}

	public void setImport_(int import_) {
		this.imported = import_;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getMinNum() {
		return minNum;
	}

	public void setMinNum(int minNum) {
		this.minNum = minNum;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}


	public int getCommodityid() {
		return commodityid;
	}

	public void setCommodityid(int commodityid) {
		this.commodityid = commodityid;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
}
