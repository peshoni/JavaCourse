package com.sirma.itt.javacourse.networkingandgui.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Talker {
	private Socket socket;
	private PrintWriter output;
	private BufferedReader reader;

	public Talker(Socket socket) {
		this.socket = socket;
	}

	public void sendMessage(String message) throws IOException {
		output = new PrintWriter(socket.getOutputStream(), true);
		output.println(message);
	}

	public String receiveMessage() throws IOException {
		reader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		return reader.readLine();
	}
}
