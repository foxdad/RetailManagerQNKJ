package com.boyu.kiss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boyu.kiss.entity.CommentOrder;
import com.boyu.kiss.mapper.CommentorderMapper;
import com.boyu.kiss.result.CommentOrderVO;
import com.boyu.kiss.service.CommentorderService;

@Service
public class CommentorderServiceImpl extends BaseServiceImpl<CommentorderMapper, CommentOrder> implements CommentorderService {

	@Autowired
	private CommentorderMapper commentorderMapper;
	
	public List<CommentOrderVO> getCommentList(int storeId){
		List<CommentOrderVO> list = commentorderMapper.getCommentList(storeId);
		return list;
	}
}
