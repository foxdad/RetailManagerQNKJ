package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;


/**
 * The persistent class for the t_role_menu database table.
 * 
 */

public class RoleMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int id;

	private int menuid;

	private int roleid;

	public RoleMenu() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMenuid() {
		return this.menuid;
	}

	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}

	public int getRoleid() {
		return this.roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

}