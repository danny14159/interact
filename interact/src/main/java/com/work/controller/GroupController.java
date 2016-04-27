
package com.work.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.work.bean.Group;
import com.work.mapper.BasicDao;
import com.work.mapper.GroupDao;

@Controller
@RequestMapping("/group")
public class GroupController extends BasicController<Group>{
	
	@Resource
	private GroupDao GroupDao;
	
	public static final String PREFIX="Group/";

	@Override
	protected String getPrefix() {
		return PREFIX;
	}

	@Override
	protected BasicDao<Group> getDao() {
		return GroupDao;
	}


}
    