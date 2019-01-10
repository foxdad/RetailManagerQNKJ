package com.boyu.kiss.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.UserInfo;
import com.boyu.kiss.mapper.UserInfoMapper;
import com.boyu.kiss.service.IUserInfoService;

@Service
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfoMapper,UserInfo> implements IUserInfoService{

}
