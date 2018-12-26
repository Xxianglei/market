package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.service.TestService;
@Controller
public class TestController {
	
	// 把TestService的依赖加进来
	@Autowired
	TestService testservice;
	@RequestMapping("/test/qureyNow")
	@ResponseBody
	public String  queryNow()
	/**
	 * 1.引入服务
	 * 2.注入服务
	 * 3.调用服务
	 */
	{
		
		testservice.queryNow();
		return testservice.queryNow();
	}
}
