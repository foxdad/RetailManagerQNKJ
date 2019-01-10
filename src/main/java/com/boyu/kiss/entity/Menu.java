package com.boyu.kiss.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotations.TableId;


/**
 * The persistent class for the t_menu database table.
 * 
 */
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private String menuName;

	public Menu() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

}