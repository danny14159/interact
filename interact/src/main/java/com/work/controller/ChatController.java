package com.work.controller;

import java.util.Arrays;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import com.work.bean.layim.GroupCategory;
import com.work.bean.layim.GroupWrapper;
import com.work.mapper.GroupDao;
import com.work.util.M;

@RequestMapping("/chat")
@Controller
public class ChatController {
	
	@Resource
	private HttpServletRequest request;
	@Resource
	private GroupDao groupDao;

	@RequestMapping("/online")
	public Object getFriend(String username){
		WebUtils.setSessionAttribute(request, "me", username);
		return true;
	}
	
	@RequestMapping("/room")
	public String chatRoom(){
		
		return "chat/room";
	}
	
	@RequestMapping("/group.json")
	@ResponseBody
	public Object chatGroup(){
		
		GroupWrapper wrapper = new GroupWrapper();
		
		wrapper.setStatus(1);
		wrapper.setMsg("ok");
		
		GroupCategory category = new GroupCategory();
		category.setId(1);
		category.setName("默认分组");
		
		category.setNums(10);
		
		category.setItem(groupDao.list(M.make().asMap()));
		
		wrapper.setData(Arrays.asList(category));
		return wrapper;
	}
}
