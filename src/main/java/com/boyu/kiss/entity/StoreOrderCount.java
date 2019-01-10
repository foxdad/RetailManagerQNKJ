package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;

import java.util.Date;


/**
 * The persistent class for the t_store_order_count database table.
 * 
 */
public class StoreOrderCount implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private int counts;

	private Date date;

	private int marketid;

	private int storeid;

	public StoreOrderCount() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getMarketid() {
		return this.marketid;
	}

	public void setMarketid(int marketid) {
		this.marketid = marketid;
	}

	public int getStoreid() {
		return this.storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

}