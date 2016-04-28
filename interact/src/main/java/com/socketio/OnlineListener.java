package com.socketio;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.listener.ConnectListener;

public class OnlineListener implements ConnectListener{

	public void onConnect(SocketIOClient client) {
		
		Object username = client.get("username");
		System.out.println(client.getSessionId().toString());
		;
		
		System.out.println(username);
	}

}
