
package com.work.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.work.bean.Friendship;
import com.work.mapper.BasicDao;
import com.work.mapper.FriendshipDao;

@Controller
@RequestMapping("/friendship")
public class FriendshipController extends BasicController<Friendship>{
	
	@Resource
	private FriendshipDao FriendshipDao;
	
	public static final String PREFIX="Friendship/";

	@Override
	protected String getPrefix() {
		return PREFIX;
	}

	@Override
	protected BasicDao<Friendship> getDao() {
		return FriendshipDao;
	}


}
    