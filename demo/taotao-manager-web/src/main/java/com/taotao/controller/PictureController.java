package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import com.taotao.common.pojo.PictureResult;
import com.taotao.service.PictureService;
import com.taotao.utils.JsonUtils;

@Controller
public class PictureController {

	@Autowired
	private PictureService pictureService;
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public String uploadFile(MultipartFile uploadFile) {
		PictureResult result = pictureService.uploadPic(uploadFile);
		// 解决浏览器兼容  要求文本类型
		String json=JsonUtils.objectToJson(result);
		return json;
	}
}
