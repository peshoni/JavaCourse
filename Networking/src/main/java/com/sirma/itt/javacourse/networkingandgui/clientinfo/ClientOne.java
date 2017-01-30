package com.sirma.itt.javacourse.networkingandgui.clientinfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import com.sirma.itt.javacourse.networkingandgui.utility.Sockets;

import javafx.scene.control.TextArea;

/**
 * ITTE-1959 Clients info. Class that connects to the server and starts to read
 * his messages.
 * 
 * @author Petar Ivanov
 */
public class ClientOne implements Runnable {
	private Socket socket;
	private TextArea screen;
	private static final String SEPARATOR = System.lineSeparator();

	/**
	 * Constructs client.
	 * 
	 * @param screen
	 */
	public ClientOne(TextArea screen) {
		this.screen = screen;
	}

	/**
	 * Connect to the server and try receiving messages.
	 */
	public void connect() {
		try (Socket sockett = Sockets.getSocket()) {
			socket = sockett;
			screen.appendText("Connected on port:"
					+ String.valueOf(socket.getPort()) + SEPARATOR);
			try (BufferedReader in = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));) {
				screen.appendText("Server:" + in.readLine() + SEPARATOR);
				screen.appendText(in.readLine() + SEPARATOR);
				while (true) {
					String string = in.readLine();
					if (!string.isEmpty()) {
						screen.appendText(string + SEPARATOR);
					}
				}
			} catch (Exception e) {
				screen.appendText(
						"Server is offline! The app will close after 2 seconds.");
				sockett.close();
				Thread.sleep(2000);
				System.exit(0);
			}
		} catch (Exception e) {
			screen.appendText("Client socket closed." + SEPARATOR);
		}
	}

	@Override
	public void run() {
		connect();
	}
}
