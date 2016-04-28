package com.work.bean.layim;

import java.util.List;

public class GroupWrapper {

	private Integer status;
	
	private String msg;
	
	private List<GroupCategory> data;

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

	public List<GroupCategory> getData() {
		return data;
	}

	public void setData(List<GroupCategory> data) {
		this.data = data;
	}
}
