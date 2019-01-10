package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the t_order database table.
 * 
 */
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private String address;

	private String consignee;

	private int freightInsurance;

	private String leave_message;

	private BigDecimal money;

	private int orderid;

	private Date orderTime;

	private String phone;

	private int state;

	private int userId;

	public Order() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public int getFreightInsurance() {
		return this.freightInsurance;
	}

	public void setFreightInsurance(int freightInsurance) {
		this.freightInsurance = freightInsurance;
	}

	public String getLeave_message() {
		return this.leave_message;
	}

	public void setLeave_message(String leave_message) {
		this.leave_message = leave_message;
	}

	public BigDecimal getMoney() {
		return this.money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public int getOrderid() {
		return this.orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}