package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;

import java.util.Date;


/**
 * The persistent class for the t_store_commodity_count database table.
 * 
 */
public class StoreCommodityCount implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private int commodityid;

	private int counts;

	private Date date;

	private int storeid;

	public StoreCommodityCount() {
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

	public int getCounts() {
		return this.counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getStoreid() {
		return this.storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

}