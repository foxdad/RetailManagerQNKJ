package com.boyu.kiss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.boyu.kiss.entity.ActivityDetail;
import com.boyu.kiss.entity.Advertisement;
import com.boyu.kiss.mapper.ActivityMapper;
import com.boyu.kiss.service.ActivityService;

@Service
@Transactional(propagation=Propagation.REQUIRED,rollbackFor = Exception.class)
public class ActivityServiceImpl implements ActivityService{
	
	@Autowired
	private ActivityMapper aMapper;

	@Override
	public List<Advertisement> getAdList(Integer marketid, Integer total) {
		return aMapper.getAdList(marketid, total);
	}

	@Override
	public List<ActivityDetail> getAcList(Integer marketid, Integer activityid, Integer total) {
		return aMapper.getAcList(marketid, activityid, total);
	}
	
	
}
