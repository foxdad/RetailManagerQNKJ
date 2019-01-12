package com.boyu.kiss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boyu.kiss.entity.ActivityDetail;
import com.boyu.kiss.mapper.ActivityMapper;
import com.boyu.kiss.service.impl.UserServiceImpl;

@RestController
public class TestController {
	
	@Autowired
	private UserServiceImpl uImpl;
	
}
