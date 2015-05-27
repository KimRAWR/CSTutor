package CSTutor.Model.Chat.Client;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import CSTutor.Model.Chat.ChatOverlay;
import CSTutor.Model.Chat.Server.ServerIF;


public class ChatClient extends UnicastRemoteObject implements ClientIF {
    	private static final long serialVersionUID = 1L;
    	
    	
    	private ChatOverlay chatOverlay;
    	/**
    	 * The server that the chat client is connecting to
    	 */
    	private ServerIF chatServer;
    	
    	/**
    	 * The name of the user
    	 */
    	private String name = null;

    	/**
    	 * The constructor for the chatClient class
    	 * 
    	 * @param name The name of the user
    	 * @param chatServer The server to connect to
    	 * @throws RemoteException
    	 */
    	public ChatClient(String name, ServerIF chatServer, ChatOverlay chatOverlay) throws RemoteException {
    		this.name = name;
    		this.chatServer = chatServer;
    		chatServer.registerChatClient(this);
    		this.chatOverlay = chatOverlay;
    	}
    	
    	/**
    	 * Takes messages that are broadcast from the server, and prints them to the screen.
    	 */
    	@Override
    	public void recieveMessage(String message) throws RemoteException {
    		chatOverlay.setLastString(name + ": " + message);
    		chatOverlay.chatBar.box.updateConsole();
    	}
    	
    	public void broadcastMessage(String message) {
    		try {
    			chatServer.broadcastMessage(message);
    		} catch (RemoteException e) {
    			e.printStackTrace();
    		}
    	}
    }
