package com.boyu.kiss.result;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;

public class CommodityTypeVo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@TableId
	private int classificationId;

	private String classificationName;

	public int getClassificationId() {
		return classificationId;
	}

	public void setClassificationId(int classificationId) {
		this.classificationId = classificationId;
	}

	public String getClassificationName() {
		return classificationName;
	}

	public void setClassificationName(String classificationName) {
		this.classificationName = classificationName;
	}
	
	
}
