package com.socketio;

public class ChatObject {
    private String fromUser;
    private String message;
    private String toUser;
    private String time;
    public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	/**
     * single|group
     */
    private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFromUser() {
		return fromUser;
	}
	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getToUser() {
		return toUser;
	}
	public void setToUser(String toUser) {
		this.toUser = toUser;
	}


}
