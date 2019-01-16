package com.boyu.kiss.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Null;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.boyu.kiss.entity.Store;
import com.boyu.kiss.service.impl.StoreServiceImpl;
import com.boyu.kiss.utils.ImgsUtil;

@RestController
public class StoreController {

	@Autowired
	private StoreServiceImpl storeServiceImpl;

	//修改店铺营业时间或修改店铺营业状态
	@RequestMapping("/updateShopHours")
	public String updateShopHours(Store store) {
		int rows = storeServiceImpl.updateById(store);
		if(rows == 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}
	}

	//上传营业执照 ----数据库未修改
	@RequestMapping("/storeCertification")
	public String storeCertification(Store store,HttpServletRequest request) {
		String dpjydUrl = ImgsUtil.upImgs(store.getDpjydUrl(), "store", request);
		String dzsfzUrl = ImgsUtil.upImgs(store.getDzsfzUrl(), "store", request);
		String handheldIdURL = ImgsUtil.upImgs(store.getHandheIdURL(), "store", request);
		String reverseIdURL = ImgsUtil.upImgs(store.getReverseIdURL(), "store", request);
		String yxzsUrl = ImgsUtil.upImgs(store.getYxzsUrl(), "store", request);
		String yyxkz = ImgsUtil.upImgs(store.getYyxkz(), "store", request);
		if(dpjydUrl!=null&& dzsfzUrl!=null&&handheldIdURL !=null 
				&&reverseIdURL !=null&&yxzsUrl!=null&&yyxkz!=null) {
			store.setDpjydUrl(dpjydUrl);
			store.setDzsfzUrl(dzsfzUrl);
			store.setHandheIdURL(handheldIdURL);
			store.setReverseIdURL(reverseIdURL);
			store.setYxzsUrl(yxzsUrl);
			store.setYyxkz(yyxkz);
			
			int rows = storeServiceImpl.insert(store);
			if(rows == 1)
				return "{\"result\": \"OK\"}";
			else {
				return "{\"result\": \"failed\"}";
			}
		}
		else {
			return "{\"result\": \"failed\"}";
		}
	}
	/**
	 * 根据市场id查询批发商店铺接口
	 * @param marketId
	 * @return
	 */
	@RequestMapping(value = "/selectStore")
	public Map<String, Object> getStore(Integer marketId) {
		Map<String, Object> resultMap = new HashMap<>(); // 返回结果集
		List<Map<String, Object>> sList = storeServiceImpl.getStore(marketId);
		if (sList != null && sList.size() != 0) {
			resultMap.put("Store", sList);
		} else {
			resultMap.put("result", "没有查询到相关商店");
		}
		return resultMap;
	}
}
