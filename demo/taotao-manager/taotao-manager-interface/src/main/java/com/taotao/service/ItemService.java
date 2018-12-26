package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;

/**
 * 商品处理接口
 * 
 * @author 丽丽超可爱
 *
 */
public interface ItemService {
	public EasyUIDataGridResult getItemList(Integer page ,Integer rows );
}
