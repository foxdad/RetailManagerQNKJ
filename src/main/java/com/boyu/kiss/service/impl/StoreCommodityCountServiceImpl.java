package com.boyu.kiss.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.StoreCommodityCount;
import com.boyu.kiss.mapper.StoreCommodityCountMapper;
import com.boyu.kiss.service.IStoreCommodityCountService;

@Service
public class StoreCommodityCountServiceImpl extends BaseServiceImpl<StoreCommodityCountMapper, StoreCommodityCount> implements IStoreCommodityCountService{
	@Autowired
	private StoreCommodityCountMapper sMapper;

	@Override
	public List<Integer> getIdList(Integer storeid,Integer num) {
		Map<String, Object> shopmap = new HashMap<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String time = df.format(new Date());
        String newtime = time.substring(0, 7); //获取指定格式日期
		return sMapper.getIdList(storeid, newtime, num);
	}	
}
