package com.socketio;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;

public class ApplicationTest {

	public static void main(String[] args) throws InterruptedException {
		Configuration config = new Configuration();
		//config.setHostname("localhost");
		config.setPort(9092);

		SocketIOServer server = new SocketIOServer(config);
		ChatEventListener listner = new ChatEventListener();
		listner.setServer(server);
		// chatevent为事件名称
		server.addEventListener("chatevent", ChatObject.class, listner);
			
		server.addConnectListener(new OnlineListener());
		// 启动服务
		server.start();

	}
}
