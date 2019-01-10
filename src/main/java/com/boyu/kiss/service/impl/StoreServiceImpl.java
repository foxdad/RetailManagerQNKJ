package com.boyu.kiss.service.impl;

import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.Store;
import com.boyu.kiss.mapper.StoreMapper;
import com.boyu.kiss.service.IStoreService;

@Service
public class StoreServiceImpl extends BaseServiceImpl<StoreMapper, Store> implements IStoreService{

}
