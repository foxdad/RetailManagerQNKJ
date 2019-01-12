package com.boyu.kiss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boyu.kiss.entity.Store;
import com.boyu.kiss.service.impl.StoreServiceImpl;

@RestController
public class StoreController {
	@Autowired
	private StoreServiceImpl storeServiceImpl;

	//修改店铺营业时间
	@RequestMapping("/updateShopHours")
	public String updateShopHours(Store store) {
		int rows = storeServiceImpl.updateById(store);
		if(rows == 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}
	}
}
