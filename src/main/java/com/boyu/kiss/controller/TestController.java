package com.boyu.kiss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boyu.kiss.entity.ActivityDetail;
import com.boyu.kiss.mapper.ActivityMapper;

@RestController
public class TestController {
	
	@Autowired
	private ActivityMapper aMapper;
	
	@RequestMapping(value="/Test")
	public List<ActivityDetail> getlist(){		
		return aMapper.getAcList(1, 1, 6);		
	}
}
