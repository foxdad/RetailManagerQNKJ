package com.boyu.kiss.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boyu.kiss.entity.Commodity;
import com.boyu.kiss.service.impl.CommodityServiceImpl;

@RestController
public class CommodityController {

	@Autowired
	private CommodityServiceImpl commodityService;
	//添加商品接口
	@RequestMapping("/addCommodity.do")
	public String addCommodity(Commodity commodity) {
		Integer rows = commodityService.insert(commodity);
		if(rows == 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}
	}
	//商品上下架接口
	@RequestMapping("/commodityUpAndDown.do")
	public String commodityUpAndDown(int commodityId,int action) {
		Commodity commodity = new Commodity();
		commodity.setId(commodityId);
		commodity.setIsShelfs(action);
		Integer rows = commodityService.updateById(commodity);
		if(rows == 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}
	}
	//修改商品信息接口
	@RequestMapping("/updateCommodity.do")
	public String updateCommodity(Commodity commodity) {
		Integer rows = commodityService.updateById(commodity);
		if(rows == 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}
	}
	
	//单个/批量删除商品信息接口
	@RequestMapping("/deletesCommodity.do")
	public String deletesCommodity(Integer [] commodityId) {
		
			List<Integer> idList = Arrays.asList(commodityId);
			Integer rows = commodityService.deleteBatchIds(idList);
			if(rows >= 1)
				return "{\"result\": \"OK\"}";
		
		return "{\"result\": \"failed\"}";
	}
}
