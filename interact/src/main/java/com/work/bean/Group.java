package com.work.bean;
/**
 * @author 
 *
 */
public class Group  {

	/**
	 * 
	 */
	private Integer id;

	/**
	 * 组名
	 */
	private String name;

	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}

}