package com.work.bean.layim;

import java.util.List;

public class FriendCategory {

	private String name;
	
	private Integer id;
	
	private Integer nums;
	
	private List<Friend> item;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNums() {
		return nums;
	}

	public void setNums(Integer nums) {
		this.nums = nums;
	}

	public List<Friend> getItem() {
		return item;
	}

	public void setItem(List<Friend> item) {
		this.item = item;
	}
}
