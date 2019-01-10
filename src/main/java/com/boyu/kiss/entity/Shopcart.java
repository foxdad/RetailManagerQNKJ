package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;


/**
 * The persistent class for the t_shopcart database table.
 * 
 */
public class Shopcart implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private int commodityid;

	private int marketid;

	private int num;

	private int userId;

	public Shopcart() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCommodityid() {
		return this.commodityid;
	}

	public void setCommodityid(int commodityid) {
		this.commodityid = commodityid;
	}

	public int getMarketid() {
		return this.marketid;
	}

	public void setMarketid(int marketid) {
		this.marketid = marketid;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}