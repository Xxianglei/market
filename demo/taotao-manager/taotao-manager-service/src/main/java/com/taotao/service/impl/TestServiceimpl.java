package com.taotao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.TestMapper;
import com.taotao.service.TestService;

@Service
public class TestServiceimpl implements TestService {

	@Autowired
	TestMapper testmapper;
	public String queryNow() {
		// TODO Auto-generated method stub
		return testmapper.queryNow();
	}

}
