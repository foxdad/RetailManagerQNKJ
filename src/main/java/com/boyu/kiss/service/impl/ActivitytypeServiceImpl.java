package com.boyu.kiss.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.boyu.kiss.entity.ActivityType;
import com.boyu.kiss.mapper.ActivitytypeMapper;
import com.boyu.kiss.service.IActivitytypeService;

@Service
public class ActivitytypeServiceImpl extends BaseServiceImpl<ActivitytypeMapper, ActivityType>
		implements IActivitytypeService {

	@Autowired
	private ActivitytypeMapper mapper;

	@Override
	public List<Map<String, Object>> queryActivitytype() {
		return mapper.selectMaps(new EntityWrapper<ActivityType>().setSqlSelect("id,activity_theme"));
	}
}
