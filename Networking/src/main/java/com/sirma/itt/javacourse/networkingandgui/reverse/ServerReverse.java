package com.sirma.itt.javacourse.networkingandgui.reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Time;

import com.sirma.itt.javacourse.networkingandgui.utility.Sockets;

import javafx.scene.control.TextArea;

public class ServerReverse implements Runnable {
	private int port;
	private volatile boolean run;
	private TextArea screen;
	private ServerSocket serverSocket;
	private Socket socket;
	private static final String SEPARATOR = System.lineSeparator();

	/**
	 * Creates server listening on the given port.
	 * 
	 * @param port
	 *            The port for listening.
	 * @param screen
	 *            Field coverage of events occurring
	 */
	public ServerReverse(TextArea screen) {
		this.screen = screen;
		run = false;
	}

	/**
	 * Checks server state.
	 * 
	 * @return {@link Boolean}
	 */
	public boolean isRunning() {
		return run;
	}

	/**
	 * Setting start state.
	 */
	public void start() {
		run = true;
	}

	/**
	 * Stops the server.
	 */
	public void stop() {
		run = false;
		if (serverSocket != null) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				screen.appendText(
						"Couldn't close the server socket" + SEPARATOR);
			}
		}
	}

	/**
	 * Runs the server until told otherwise by the client.
	 */
	private void runServer() {
		PrintWriter out = null;
		try (ServerSocket servSocket = Sockets.getServerSocket();) {
			serverSocket = servSocket;
			screen.appendText(
					"Server started on port: " + serverSocket.getLocalPort());
			screen.appendText(SEPARATOR);
			while (run) {
				try {
					socket = serverSocket.accept();
					screen.appendText("Client connected." + SEPARATOR);
					out = new PrintWriter(socket.getOutputStream(), true);
					out.println(
							new Time(System.currentTimeMillis()) + ": Hello!");

					try (BufferedReader reader = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));) {
						while (run) {
							String message = readClientMessage(reader);
							if (message == null) {
								return;
							}
							screen.appendText("Client: " + message + SEPARATOR);
							String reversed = writeReversedMessage(message);
							screen.appendText("Reversed message: " + reversed
									+ SEPARATOR);
							out.println(reversed);
						}
					} catch (Exception e) {
						System.out.println("no input stream");
					}

				} catch (IOException e) {
					out.println("Server is shutdown." + SEPARATOR);
				}

			}

		} catch (IOException e) {
			screen.appendText("Could not listen on port: " + port + SEPARATOR);
			return;
		}

	}

	/**
	 * Read while client is connected. Destroy thread after client disconnect.
	 * 
	 * @param reader
	 * @return
	 */
	public String readClientMessage(BufferedReader reader) {
		StringBuilder builder = new StringBuilder();
		try {
			builder.append(reader.readLine());
		} catch (IOException e) {
			screen.setText("Clienta se razka4i");
			// stop();
		}
		return builder.toString();
	}

	public String writeReversedMessage(String message) {
		StringBuilder builder = new StringBuilder();
		builder.append(message);
		return builder.reverse().toString();
	}

	@Override
	public void run() {
		runServer();
	}

}
