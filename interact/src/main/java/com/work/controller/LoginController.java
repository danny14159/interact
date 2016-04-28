package com.work.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.WebUtils;

@RequestMapping("/u")
@Controller
public class LoginController {
	
	@Resource
	private HttpServletRequest request;

	@RequestMapping("/online")
	public Object online(String username){
		WebUtils.setSessionAttribute(request, "me", username);
		return true;
	}
	
	@RequestMapping("/offline")
	public Object offline(){
		WebUtils.setSessionAttribute(request, "me", null);
		return true;
	}
	
}
