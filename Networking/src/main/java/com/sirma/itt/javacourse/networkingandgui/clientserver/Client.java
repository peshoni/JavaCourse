package com.sirma.itt.javacourse.networkingandgui.clientserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import javafx.scene.control.TextArea;

/**
 * ITTE-1958 Client-server. Client class that have connect and disconnect
 * methods.
 * 
 * @author Petar Ivanov
 */
public class Client {
	private TextArea screen;
	private Socket socket;
	private final static int PORT = 7000;

	/**
	 * Constructor.
	 * 
	 * @param screen
	 *            Which will describe the occurred events.
	 */
	public Client(TextArea screen) {
		this.screen = screen;
	}

	/**
	 * Trying to connect in given port and read message from server. If the
	 * message has been read is displayed on the screen.
	 * 
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public void connect() throws UnknownHostException, IOException {
		socket = new Socket("localhost", PORT);
		screen.appendText("Connected on port" + socket.getPort());
		screen.appendText(System.lineSeparator());
		BufferedReader in = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		screen.appendText("Server:" + in.readLine() + System.lineSeparator());
	}

	/**
	 * Close the client socket.
	 */
	public void disconnect() {
		try {
			socket.close();
			screen.appendText("Client socket closed." + System.lineSeparator());
		} catch (IOException e) {
			screen.appendText("I/0 exception occurs.");
		}
	}
}
