package com.boyu.kiss.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boyu.kiss.entity.Advertisement;
import com.boyu.kiss.entity.Market;
import com.boyu.kiss.result.AdvertisementResult;
import com.boyu.kiss.service.impl.ActivityServiceImpl;
import com.boyu.kiss.service.impl.MarketServiceImpl;

@RestController
public class PlbIndexController {

	@Autowired
	private ActivityServiceImpl aImpl;
	@Autowired
	private MarketServiceImpl mImpl;
	
	@RequestMapping(value="/appIndex")
	public Map<String, Object> index(String market,HttpServletRequest request) throws Exception{
		Map<String, Object> map = new HashMap<>();
		map.put("marketName", market);
		List<Market> markets = mImpl.selectByMap(map);
		Integer marketid = markets.get(0).getId(); //根据市场名获取市场id
		List<Advertisement> aList = aImpl.getAdList(marketid, 3);//获取三张轮播广告
		Map<String,Object> resultMap = new HashMap<>();
		List<AdvertisementResult> rList = new ArrayList<>();
		AdvertisementResult aResult = new AdvertisementResult();
		String url = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
		for (Advertisement advertisement : aList) {
			aResult.setAdvertisementId(advertisement.getMarketid());			
			aResult.setAdvertisementURL(url+advertisement.getAdvertisementURL());
			rList.add(aResult);
		}		
		resultMap.put("Advertisement",rList);
		
		return resultMap;		
	}
}
