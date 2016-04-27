
package com.work.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.work.bean.ChatRecord;
import com.work.mapper.BasicDao;
import com.work.mapper.ChatRecordDao;

@Controller
@RequestMapping("/chatrecord")
public class ChatRecordController extends BasicController<ChatRecord>{
	
	@Resource
	private ChatRecordDao ChatRecordDao;
	
	public static final String PREFIX="ChatRecord/";

	@Override
	protected String getPrefix() {
		return PREFIX;
	}

	@Override
	protected BasicDao<ChatRecord> getDao() {
		return ChatRecordDao;
	}


}
    