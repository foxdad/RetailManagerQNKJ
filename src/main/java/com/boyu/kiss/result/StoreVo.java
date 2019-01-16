package com.boyu.kiss.result;

import java.io.Serializable;

public class StoreVo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String ownerName;//店主姓名
	
	private String storeName;//店铺名字
	
	private String storeType;//店铺类型
	
	private Integer type;
	
	private Integer shtg;
	
	private String shzt;//审核状态

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreType() {
		if(this.getType() == 1){
			this.storeType = "零售商";
		}else if (this.getType() == 2) {
			this.storeType = "批发商";
		}
		return storeType;
	}


	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getShtg() {
		return shtg;
	}

	public void setShtg(Integer shtg) {
		this.shtg = shtg;
	}

	public String getShzt() {
		if(this.getShtg() == 1){
			this.shzt = "审核通过";
		}else if (this.getType() == 0) {
			this.shzt = "审核未通过";
		}else if (this.getType() == 2) {
			this.shzt = "审核中";
		}
		return shzt;
	}
	
}
