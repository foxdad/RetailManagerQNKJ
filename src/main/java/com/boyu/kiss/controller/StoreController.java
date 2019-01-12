package com.boyu.kiss.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
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
	@Autowired
	private StoreServiceImpl sImpl;
	
	/**
	 * 根据市场id查询批发商接口
	 * @param marketId
	 * @return
	 */
	@RequestMapping(value = "/selectStore")
	public Map<String, Object> getStore(Integer marketId) {
		Map<String, Object> resultMap = new HashMap<>(); // 返回结果集
		List<Map<String, Object>> sList = sImpl
				.selectMaps(new EntityWrapper<Store>()
				.setSqlSelect("storeId,storeName")
				.eq("marketId", marketId)
				.eq("type", 2)
				);
		if (sList != null && sList.size() != 0) {
			resultMap.put("Store", sList);
		} else {
			resultMap.put("result", "failed");
		}
		return resultMap;
	}
}
