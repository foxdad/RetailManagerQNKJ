package com.boyu.kiss.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.boyu.kiss.entity.ActivityDetail;
import com.boyu.kiss.entity.ActivityType;
import com.boyu.kiss.entity.Advertisement;
import com.boyu.kiss.entity.Market;
import com.boyu.kiss.service.impl.ActivitydetailServiceImpl;
import com.boyu.kiss.service.impl.ActivitytypeServiceImpl;
import com.boyu.kiss.service.impl.AdvertisementServiceImpl;
import com.boyu.kiss.service.impl.MarketServiceImpl;

@RestController
public class PlbIndexController {

	@Autowired
	private AdvertisementServiceImpl aImpl;
	@Autowired
	private MarketServiceImpl mImpl;
	@Autowired
	private ActivitytypeServiceImpl acImpl;
	@Autowired
	private ActivitydetailServiceImpl adImpl;

	@RequestMapping(value="/appIndex")
	public Map<String, Object> index(String market){
		Map<String,Object> resultMap = new HashMap<>(); //放回结果集
		Map<String, Object> map = new HashMap<>();
		map.put("marketName", market);
		List<Market> markets = mImpl.selectByMap(map);
		Integer marketid = markets.get(0).getId(); //根据市场名获取市场id
		EntityWrapper wrapper = new EntityWrapper<Advertisement>();
		wrapper.setSqlSelect("advertisementId,advertisementURL")
		.eq("marketid",marketid).eq("yxbj", 1);	
		List<Map<String, Object>> adlMaps = aImpl.selectMaps(wrapper);
		resultMap.put("Advertisement", adlMaps); //放入广告信息
		
		//查询首页12条活动主题相关数据
		Map<String, Object> smap = new HashMap<>();
		List<Map<String, Object>> tlMaps = 
				acImpl.selectMaps(new EntityWrapper<ActivityType>()
						.setSqlSelect("id,activity_theme")
						);
		List<Map<String, Object>> aclMaps1 =
				adImpl.selectMaps(new EntityWrapper<ActivityDetail>()
						.setSqlSelect("activityId,activity_item_Name,introduce,ImgURL")
						.eq("marketid", marketid)
						.eq("activityId", 1)
						.eq("yxbj", 1)
						.last("LIMIT 0,6")
						);
		List<Map<String, Object>> aclMaps2 =
				adImpl.selectMaps(new EntityWrapper<ActivityDetail>()
						.setSqlSelect("activityId,activity_item_Name,introduce,ImgURL")
						.eq("marketid", marketid)
						.eq("activityId", 2)
						.eq("yxbj", 1)
						.last("LIMIT 0,6")
						);
		List<Map<String, Object>> aclMaps3 =
				adImpl.selectMaps(new EntityWrapper<ActivityDetail>()
						.setSqlSelect("activityId,ImgURL")
						.eq("marketid", marketid)
						.eq("activityId", 3)
						.eq("yxbj", 1)
						.last("LIMIT 0,4")
						);
		smap.put("type", tlMaps);		//活动类型数据	
		smap.put("data1", aclMaps1);  //活动主题类型1的数据
		smap.put("data2", aclMaps2);  //活动主题类型2的数据
		smap.put("data3", aclMaps3);  //活动主题类型3的数据(4张活动图片)
		resultMap.put("Activity",smap);
		
		
		return resultMap;
	}
}
