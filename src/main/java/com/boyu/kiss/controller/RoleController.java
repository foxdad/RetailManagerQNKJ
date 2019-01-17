package com.boyu.kiss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.boyu.kiss.service.impl.RoleServiceImpl;

@Controller
public class RoleController {

	@Autowired
	private RoleServiceImpl roleService;
	/*@RequestMapping("/getRole")
	public String getRole() {
		roleService.se
	}*/
}
