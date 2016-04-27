package com.work.bean;
/**
 * @author 
 *
 */
public class ChatRecord  {

	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String content;

	/**
	 * 
	 */
	private String user_from;

	/**
	 * 
	 */
	private String user_to;

	/**
	 * 
	 */
	@org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd")
	private java.util.Date create_time;

	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setContent(String content){
		this.content=content;
	}

	public String getContent(){
		return this.content;
	}

	public void setUser_from(String user_from){
		this.user_from=user_from;
	}

	public String getUser_from(){
		return this.user_from;
	}

	public void setUser_to(String user_to){
		this.user_to=user_to;
	}

	public String getUser_to(){
		return this.user_to;
	}

	public void setCreate_time(java.util.Date create_time){
		this.create_time=create_time;
	}

	public java.util.Date getCreate_time(){
		return this.create_time;
	}

}