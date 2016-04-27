
package com.work.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.work.bean.Groupship;
import com.work.mapper.BasicDao;
import com.work.mapper.GroupshipDao;

@Controller
@RequestMapping("/groupship")
public class GroupshipController extends BasicController<Groupship>{
	
	@Resource
	private GroupshipDao GroupshipDao;
	
	public static final String PREFIX="Groupship/";

	@Override
	protected String getPrefix() {
		return PREFIX;
	}

	@Override
	protected BasicDao<Groupship> getDao() {
		return GroupshipDao;
	}


}
    