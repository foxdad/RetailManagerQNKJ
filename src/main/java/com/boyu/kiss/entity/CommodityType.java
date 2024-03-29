package com.boyu.kiss.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;


/**
 * The persistent class for the t_commodity_type database table.
 * 
 */
public class CommodityType implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private int classificationId;

	private String classificationName;

	private int parentId;

	private int type;

	private String typeDescribe;
	
	private int storeId;
	
	
	public String getTypeDescribe() {
		return typeDescribe;
	}

	public void setTypeDescribe(String typeDescribe) {
		this.typeDescribe = typeDescribe;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CommodityType() {
	}

	public int getClassificationId() {
		return this.classificationId;
	}

	public void setClassificationId(int classificationId) {
		this.classificationId = classificationId;
	}

	public String getClassificationName() {
		return this.classificationName;
	}

	public void setClassificationName(String classificationName) {
		this.classificationName = classificationName;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}