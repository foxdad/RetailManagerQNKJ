package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;

import java.util.Date;


/**
 * The persistent class for the t_comment_order database table.
 * 
 */

public class CommentOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private String appendComment;

	private String appendCommentImg1;

	private String appendCommentImg2;

	private String appendCommentImg3;

	private String comment;

	private String commentImg1;

	private String commentImg2;

	private String commentImg3;

	private Date commentTime;

	private int commentUser;

	private int orderitemid;

	private String reply;

	private float score;

	public CommentOrder() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppendComment() {
		return this.appendComment;
	}

	public void setAppendComment(String appendComment) {
		this.appendComment = appendComment;
	}

	public String getAppendCommentImg1() {
		return this.appendCommentImg1;
	}

	public void setAppendCommentImg1(String appendCommentImg1) {
		this.appendCommentImg1 = appendCommentImg1;
	}

	public String getAppendCommentImg2() {
		return this.appendCommentImg2;
	}

	public void setAppendCommentImg2(String appendCommentImg2) {
		this.appendCommentImg2 = appendCommentImg2;
	}

	public String getAppendCommentImg3() {
		return this.appendCommentImg3;
	}

	public void setAppendCommentImg3(String appendCommentImg3) {
		this.appendCommentImg3 = appendCommentImg3;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommentImg1() {
		return this.commentImg1;
	}

	public void setCommentImg1(String commentImg1) {
		this.commentImg1 = commentImg1;
	}

	public String getCommentImg2() {
		return this.commentImg2;
	}

	public void setCommentImg2(String commentImg2) {
		this.commentImg2 = commentImg2;
	}

	public String getCommentImg3() {
		return this.commentImg3;
	}

	public void setCommentImg3(String commentImg3) {
		this.commentImg3 = commentImg3;
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

	public int getOrderitemid() {
		return this.orderitemid;
	}

	public void setOrderitemid(int orderitemid) {
		this.orderitemid = orderitemid;
	}

	public String getReply() {
		return this.reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public float getScore() {
		return this.score;
	}

	public void setScore(float score) {
		this.score = score;
	}

}