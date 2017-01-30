package com.sirma.itt.javacourse.networkingandgui.clientinfo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * ITTE-1959 Clients info.
 * 
 * @author Petar Ivanov
 */
public class ConnectionHandler extends Thread {
	private Socket socket;
	private BufferedReader reader;
	private PrintWriter writer;
	private volatile boolean isRunning;

	public ConnectionHandler(Socket soccket) throws IOException {
		isRunning = true;
		socket = soccket;
		reader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		writer = new PrintWriter(
				new BufferedWriter(
						new OutputStreamWriter(socket.getOutputStream())),
				true);
		start();
	}

	public void sendMessage(String message) {
		writer.println(message);
	}

	public boolean isRunning() {
		return isRunning;
	}

	/**
	 * Use stream for check. {@inheritDoc}
	 */
	public void run() {
		try {
			reader.readLine();
		} catch (Exception e) {
			isRunning = false;
		}
	}
}
