package com.boyu.kiss.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.boyu.kiss.service.IBaseService;

/**
 * 
 * @author Kiss
 *
 * @param <E>
 * @param <T>
 */
@Transactional(propagation=Propagation.REQUIRED,rollbackFor = Exception.class)
//@Service
public class BaseServiceImpl<E extends BaseMapper<T>, T> implements IBaseService<T>{
	
	@Autowired
	private E mapper;
	
	@Override
	public Integer insert(T entity) {
		// TODO Auto-generated method stub
		return mapper.insert(entity);
	}

	@Override
	public Integer deleteById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.deleteById(id);
	}

	@Override
	public Integer deleteByMap(Map<String, Object> columnMap) {
		// TODO Auto-generated method stub
		return mapper.deleteByMap(columnMap);
	}

	@Override
	public Integer deleteBatchIds(Collection<? extends Serializable> idList) {
		// TODO Auto-generated method stub
		return mapper.deleteBatchIds(idList);
	}

	@Override
	public Integer updateById(T entity) {
		// TODO Auto-generated method stub
		return mapper.updateById(entity);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public T selectById(Serializable id) {
		// TODO Auto-generated method stub
		return mapper.selectById(id);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public List<T> selectByMap(Map<String, Object> columnMap) {
		// TODO Auto-generated method stub
		return mapper.selectByMap(columnMap);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public Integer selectCount(Wrapper<T> wrapper) {
		// TODO Auto-generated method stub
		return mapper.selectCount(wrapper);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public List<Map<String, Object>> selectMaps(Wrapper<T> wrapper) {
		// TODO Auto-generated method stub
		return mapper.selectMaps(wrapper);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public List<T> selectList(Wrapper<T> wrapper) {
		// TODO Auto-generated method stub
		return mapper.selectList(wrapper);
	}

}
