package com.work.bean.layim;

import java.util.List;

public class FriendWrapper {

	private Integer status;
	
	private String msg;
	
	private List<FriendCategory> data;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<FriendCategory> getData() {
		return data;
	}

	public void setData(List<FriendCategory> data) {
		this.data = data;
	}
}
