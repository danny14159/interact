package com.work.bean;
/**
 * @author 
 *
 */
public class User  {

	/**
	 * 用户名
	 */
	private String name;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 头像
	 */
	private String avatar;

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}

	public void setPassword(String password){
		this.password=password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setAvatar(String avatar){
		this.avatar=avatar;
	}

	public String getAvatar(){
		return this.avatar;
	}

}