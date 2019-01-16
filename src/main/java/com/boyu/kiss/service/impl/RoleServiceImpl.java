package com.boyu.kiss.service.impl;

import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.Role;
import com.boyu.kiss.mapper.RoleMapper;
import com.boyu.kiss.service.RoleService;

@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, Role>implements RoleService{

}
