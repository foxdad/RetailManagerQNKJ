package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;


/**
 * The persistent class for the t_user_address database table.
 * 
 */
public class UserAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private String address;

	private int isdefault;

	private int userid;

	public UserAddress() {
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

	public int getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(int isdefault) {
		this.isdefault = isdefault;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}