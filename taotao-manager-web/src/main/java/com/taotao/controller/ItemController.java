package com.taotao.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.service.ItemService;

@Controller
public class ItemController {
  @Autowired
   ItemService item;
	@RequestMapping(value="/item/list",method=RequestMethod.GET)
	@ResponseBody
	public EasyUIDataGridResult getItemList(HttpServletRequest rqRequest){
		Integer page=Integer.parseInt(rqRequest.getParameter("page"));
		Integer rows=Integer.parseInt(rqRequest.getParameter("rows"));
		System.out.println(page+rows+"------->");
		return item.getItemList(page, rows);
		
	}
}
