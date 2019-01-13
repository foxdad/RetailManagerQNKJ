package com.boyu.kiss.service;

import java.util.List;
import java.util.Map;

public interface IActivitydetailService {
	
	/**
	 * 查询活动详情接口
	 * @param marketid 市场id
	 * @param activityId 活动类型id
	 * @param num 查询的数量
	 * @return
	 */
	public List<Map<String, Object>> getActivitydetail(Integer marketid,Integer activityId,Integer num);
	
	/**
	 * 根据市场id和活动id获取更多活动信息
	 * @param marketid
	 * @param activityId
	 * @return
	 */
	public List<Map<String, Object>> getMoreActivity(Integer marketid,Integer activityId);
}
