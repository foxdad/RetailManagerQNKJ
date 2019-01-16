package com.boyu.kiss.service;

import java.util.List;

import com.boyu.kiss.result.CommentOrderVO;

public interface CommentorderService {

	public List<CommentOrderVO> getCommentList(int storeId);
}
