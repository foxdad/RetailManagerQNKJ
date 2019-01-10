package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;


/**
 * The persistent class for the t_user_follow_store database table.
 * 
 */
public class UserFollowStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private int storeid;

	private int userid;

	public UserFollowStore() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStoreid() {
		return this.storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}