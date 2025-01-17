package CSTutor.Model.Chat.Server;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import org.junit.Test;

import CSTutor.Model.Chat.Server.ChatServer;

public class ChatServerTest {
	
	ChatServer cs;
	@Test
	public void testChatServer() {
		cs = new ChatServer();
		assertTrue("ChatServer contrsuctor works: ", cs != null);
	}

	@Test
	public void testBroadcastMessage() {
	}

	@Test
	public void testRegisterChatClient() {
		Socket s = new Socket();
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
			cs.registerChatClient(os);
			assertTrue("Register chat client works: ", cs.chatClients.contains(os));
			cs.chatClients.remove(os);
			
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

}
