package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;


/**
 * The persistent class for the t_secondary_menu database table.
 * 
 */
public class SecondaryMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private int higher_menuId;

	private String menuName;

	private String pageURL;

	public SecondaryMenu() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHigher_menuId() {
		return this.higher_menuId;
	}

	public void setHigher_menuId(int higher_menuId) {
		this.higher_menuId = higher_menuId;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getPageURL() {
		return this.pageURL;
	}

	public void setPageURL(String pageURL) {
		this.pageURL = pageURL;
	}

}