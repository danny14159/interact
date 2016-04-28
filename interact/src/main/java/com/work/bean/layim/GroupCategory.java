package com.work.bean.layim;

import java.util.List;

import com.work.bean.Group;

public class GroupCategory {

	private String name;
	
	private Integer nums;
	
	private Integer id;
	
	private List<Group> item;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNums() {
		return nums;
	}

	public void setNums(Integer nums) {
		this.nums = nums;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Group> getItem() {
		return item;
	}

	public void setItem(List<Group> item) {
		this.item = item;
	}
}
