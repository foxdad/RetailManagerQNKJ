package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;

import java.util.Date;


/**
 * The persistent class for the t_store_examine database table.
 * 
 */
public class StoreExamine implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private int auditor;

	private Date examineDate;

	private String reason;

	private int state;

	private int storeid;

	public StoreExamine() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAuditor() {
		return this.auditor;
	}

	public void setAuditor(int auditor) {
		this.auditor = auditor;
	}

	public Date getExamineDate() {
		return this.examineDate;
	}

	public void setExamineDate(Date examineDate) {
		this.examineDate = examineDate;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getStoreid() {
		return this.storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

}