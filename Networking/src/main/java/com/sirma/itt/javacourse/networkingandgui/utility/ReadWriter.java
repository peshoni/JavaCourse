package com.sirma.itt.javacourse.networkingandgui.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ReadWriter {
	private Socket socket;
	private BufferedReader input;
	private PrintWriter output;

	public ReadWriter(Socket socket) {
		this.socket = socket;
		try {
			input = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			output = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {
			System.out.println("TRRRRRRRRRRRR");
		}

	}

	public void sendMessage(String message) {
		output.println(message);
	}

	public String readMessage() {
		String message = null;

		try {
			message = input.readLine();
		} catch (IOException e) {
			System.out.println("BRRRRRRRR");
		}
		return message;
	}
}
