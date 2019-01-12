package com.boyu.kiss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boyu.kiss.entity.Commodity;
import com.boyu.kiss.service.impl.CommodityServiceImpl;

@Controller
public class CommodityController {

	@Autowired
	private CommodityServiceImpl commodityService;
	
	@ResponseBody
	@RequestMapping("/addCommodity")
	public String addCommodity(Commodity commodity) {
		Integer rows = commodityService.insert(commodity);
		if(rows == 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}
	}
}
