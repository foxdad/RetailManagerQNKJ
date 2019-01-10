package com.boyu.kiss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.boyu.kiss.entity.ActivityDetail;
import com.boyu.kiss.entity.Advertisement;

public interface ActivityMapper {
	
	/**
	 * 查询指定个数活动首页广告
	 * @param marketid 市场id
	 * @param total 查询个数  total为空则查询所有
	 * @return
	 */
	public List<Advertisement> getAdList(@Param("marketid")Integer marketid,@Param("total")Integer total);
	
	/**
	 * 查询指定个数特价或热销商品
	 * @param marketid  市场id
	 * @param activityid 活动类型id
	 * @param total 查询个数  total为空则查询所有
	 * @return
	 */
	public List<ActivityDetail> getAcList(@Param("marketid")Integer marketid,
			@Param("activityid")Integer activityid,@Param("total")Integer total);
	
}
