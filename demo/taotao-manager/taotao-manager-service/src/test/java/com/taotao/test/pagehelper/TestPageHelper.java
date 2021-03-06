package com.taotao.test.pagehelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.container.page.PageHandler;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;

public class TestPageHelper {

	@Test
	public void testHelper() {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		TbItemMapper itemMapper = context.getBean(TbItemMapper.class);
		// 配置分页信息   
		PageHelper.startPage(1, 3);
		TbItemExample example = new TbItemExample();
		List<TbItem> selectByExample = itemMapper.selectByExample(example);
		//取分页信息
		PageInfo<TbItem> info = new PageInfo<>(selectByExample);
		System.out.println("总记录:" + info.getTotal());
		for (TbItem tbItem : selectByExample) {
			System.out.println(tbItem.getId());
		}
	}
}
