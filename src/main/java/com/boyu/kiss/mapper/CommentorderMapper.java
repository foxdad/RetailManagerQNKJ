package com.boyu.kiss.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boyu.kiss.entity.CommentOrder;
import com.boyu.kiss.result.CommentOrderVO;

public interface CommentorderMapper extends BaseMapper<CommentOrder>{

	public List<CommentOrderVO> getCommentList(int storeId);
}
