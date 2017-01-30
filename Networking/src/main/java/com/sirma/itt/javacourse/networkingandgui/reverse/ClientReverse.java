package com.sirma.itt.javacourse.networkingandgui.reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import com.sirma.itt.javacourse.networkingandgui.utility.Sockets;

import javafx.scene.control.TextArea;

public class ClientReverse implements Runnable {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter print;
	private TextArea screen;
	private volatile boolean run;
	private CareTaker messageTaker;
	private String clientMessage;
	private static final String SEPARATOR = System.lineSeparator();

	public ClientReverse(TextArea screen) {
		this.screen = screen;
		messageTaker = new CareTaker();
		run = true;
	}

	public void connect() {
		try (Socket sockett = Sockets.getSocket()) {
			socket = sockett;
			BufferedReader in = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			screen.setText(
					"Connected on port:" + String.valueOf(socket.getPort()));
			screen.appendText(SEPARATOR);
			screen.appendText("Server:" + in.readLine() + SEPARATOR);
			while (run) {
				String message = in.readLine();
				if (message == null) {
					return;
				}
				screen.appendText(message + SEPARATOR);
			}
		} catch (Exception e) {
			screen.appendText("Client socket closed." + SEPARATOR);
		}

	}

	public void sendMessage(String message) {
		messageTaker.nextMessage(message);
		try {
			print = new PrintWriter(socket.getOutputStream(), true);
			print.println(message);
		} catch (Exception e) {
			screen.setText("No connection with server.");
		}
	}

	public String undo() {
		return messageTaker.back();
	}

	public String redo() {
		return messageTaker.forward();
	}

	@Override
	public void run() {
		connect();
	}

	/**
	 * Close the client socket.
	 */
	public void stopClient() {
		try {
			socket.close();
			// screen.appendText("Client socket closed." + SEPARATOR);
		} catch (IOException e) {
			screen.appendText("I/0 exception occurs.");
		}
	}
}
