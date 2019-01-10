package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;

import java.util.Date;


/**
 * The persistent class for the t_comment_store database table.
 * 
 */
public class CommentStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private Date commentTime;

	private int commentUser;

	private float fwtd;

	private float msxf;

	private int storeid;

	private float wlsd;

	public CommentStore() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCommentTime() {
		return this.commentTime;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

	public int getCommentUser() {
		return this.commentUser;
	}

	public void setCommentUser(int commentUser) {
		this.commentUser = commentUser;
	}

	public float getFwtd() {
		return this.fwtd;
	}

	public void setFwtd(float fwtd) {
		this.fwtd = fwtd;
	}

	public float getMsxf() {
		return this.msxf;
	}

	public void setMsxf(float msxf) {
		this.msxf = msxf;
	}

	public int getStoreid() {
		return this.storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public float getWlsd() {
		return this.wlsd;
	}

	public void setWlsd(float wlsd) {
		this.wlsd = wlsd;
	}

}