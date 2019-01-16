package com.boyu.kiss.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boyu.kiss.result.CommentOrderVO;
import com.boyu.kiss.service.impl.CommentorderServiceImpl;

@RestController
public class CommentorderController {

	@Autowired
	private CommentorderServiceImpl commentorderServiceImpl;
	@RequestMapping("/getCommentList")
	public Map<String, Object> getCommentList(int storeId){
		Map<String, Object> map = new HashMap<String,Object>();
		List<CommentOrderVO> commentOrderList = commentorderServiceImpl.getCommentList(storeId);
		if(commentOrderList!= null) {
			map.put("result", commentOrderList);
			return map;
		}
		else {
			map.put("result", "failure");
			return map;
		}
		
	}
}