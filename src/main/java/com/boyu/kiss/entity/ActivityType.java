package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;


/**
 * The persistent class for the t_activity_type database table.
 * 
 */

public class ActivityType implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private String activityTheme;

	public ActivityType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivityTheme() {
		return this.activityTheme;
	}

	public void setActivityTheme(String activityTheme) {
		this.activityTheme = activityTheme;
	}

}