package com.sirma.itt.javacourse.networkingandgui.transmitter;

import java.util.ArrayList;

import javafx.scene.control.TextArea;

public class Server {
	private TextArea screen;
	private ArrayList<Group> groups;
	private String message;
	private Channels channels;

	/**
	 * Construct server with three channels.
	 * 
	 * @param screen
	 */
	public Server(TextArea screen) {
		this.screen = screen;
		groups = new ArrayList<Group>();
		groups.add(new Group(Channels.firstLevel.toString()));
		groups.add(new Group(Channels.secondLevel.toString()));
		groups.add(new Group(Channels.whisper.toString()));
	}

	public void sendMessage(String message, String channel) {
		this.message = message;
		multicast();
	}

	private void multicast() {

		switch (channels) {
		case firstLevel:
			System.out.println("First level");
			break;
		case secondLevel:
			System.out.println("second level");
			break;
		case whisper:
			System.out.println("whisper");
			break;

		default:
			break;
		}

	}
}
