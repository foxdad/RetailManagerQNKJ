package com.boyu.kiss.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.boyu.kiss.entity.ActivityDetail;
import com.boyu.kiss.mapper.ActivitydetailsMapper;
import com.boyu.kiss.service.IActivitydetailService;

@Service
public class ActivitydetailServiceImpl extends BaseServiceImpl<ActivitydetailsMapper,ActivityDetail> implements IActivitydetailService{
	
	@Autowired
	private ActivitydetailsMapper mapper;

	@Override
	public List<Map<String, Object>> getActivitydetail(Integer marketid, Integer activityId, Integer num) {
		return mapper.selectMaps(new EntityWrapper<ActivityDetail>()
			.setSqlSelect("activityId,activity_item_Name,introduce,ImgURL")
			.eq("marketid", marketid)
			.eq("activityId", activityId)
			.eq("yxbj", 1)
			.last("LIMIT 0,"+num.toString())
			);
	}

	@Override
	public List<Map<String, Object>> getMoreActivity(Integer marketid, Integer activityId) {
		return mapper.selectMaps(new EntityWrapper<ActivityDetail>()
			.setSqlSelect("activityId,activity_item_Name,introduce,ImgURL")
			.eq("marketid", marketid)
			.eq("activityId", activityId)
			.eq("yxbj", 1)
			);
	}
	
}
