package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;



public class ActivityDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private String activity_item_Name;

	private int activityId;

	private String imgURL;

	private String introduce;

	private String pageURL;
	
	private Integer marketid;
	
	private ActivityType activityType;
	
	private Integer yxbj;
	
	public Integer getMarketid() {
		return marketid;
	}

	public void setMarketid(Integer marketid) {
		this.marketid = marketid;
	}

	public ActivityDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivity_item_Name() {
		return this.activity_item_Name;
	}

	public void setActivity_item_Name(String activity_item_Name) {
		this.activity_item_Name = activity_item_Name;
	}

	public int getActivityId() {
		return this.activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public String getImgURL() {
		return this.imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getPageURL() {
		return this.pageURL;
	}

	public void setPageURL(String pageURL) {
		this.pageURL = pageURL;
	}

	public ActivityType getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityType activityType) {
		this.activityType = activityType;
	}

	public Integer getYxbj() {
		return yxbj;
	}

	public void setYxbj(Integer yxbj) {
		this.yxbj = yxbj;
	}

}