package com.boyu.kiss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boyu.kiss.entity.Store;
import com.boyu.kiss.result.StoreVo;

public interface StoreMapper extends BaseMapper<Store>{
	/**
	 * 查询店铺列表分页
	 * @param ownerName
	 * @param storeName
	 * @param begin
	 * @param end
	 * @return
	 */
	public List<StoreVo> getStoreVo(@Param("ownerName")String ownerName,
			@Param("storeName")String storeName,@Param("begin")Integer begin,@Param("end")Integer end);
	/**
	 * 查询店铺列表总数
	 * @param ownerName
	 * @param storeName
	 * @return
	 */
	public int getCountStore(@Param("ownerName")String ownerName,@Param("storeName")String storeName);
}
