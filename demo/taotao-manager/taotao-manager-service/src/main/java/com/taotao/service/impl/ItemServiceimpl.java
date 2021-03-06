package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;

@Service
public class ItemServiceimpl implements ItemService {
	@Autowired
	TbItemMapper map;
	@Override
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		// 设置分页信息
		// 注入mapper
		// 创建对象 example
		// 查数据库
		// 获取分页信息
		// 封装到EasyUIDataGridResult
		// 返回
		if (page == null)
			page = 1;
		if (rows == null)
			rows = 30;
		PageHelper.startPage(page, rows);
		TbItemExample example=new TbItemExample();
		List<TbItem> selectByExample = map.selectByExample(example);
		PageInfo<TbItem> info =new PageInfo<>(selectByExample);
		EasyUIDataGridResult result=new EasyUIDataGridResult();
		result.setTotal((int) info.getTotal());
		result.setRows(info.getList());
		return result;
	}

}
