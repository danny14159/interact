package com.socketio;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.DataListener;

public class ChatEventListener implements DataListener<ChatObject> {

	SocketIOServer server;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void setServer(SocketIOServer server) {
        this.server = server;
    }
	
	public void onData(SocketIOClient client, ChatObject data, AckRequest ackSender) throws Exception {

		// chatevent为 事件的名称， data为发送的内容
		data.setTime(sdf.format(new Date()));
        this.server.getBroadcastOperations().sendEvent("chatevent", data);
	}

}
