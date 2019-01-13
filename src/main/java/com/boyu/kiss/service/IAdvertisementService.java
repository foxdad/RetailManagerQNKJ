package com.boyu.kiss.service;

import java.util.List;
import java.util.Map;

public interface IAdvertisementService {
	
	/**
	 * 根据市场id获取对应广告信息
	 * @param marketid
	 * @return
	 */
	public List<Map<String, Object>> getAdvertisement(Integer marketid);
}
