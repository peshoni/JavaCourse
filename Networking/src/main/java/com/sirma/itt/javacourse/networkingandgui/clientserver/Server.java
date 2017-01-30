package com.sirma.itt.javacourse.networkingandgui.clientserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Time;

import javafx.scene.control.TextArea;

/**
 * ITTE-1958 Client-server.
 * 
 * @author Petar Ivanov
 */
public class Server implements Runnable {
	private int port;
	private volatile boolean run;
	private TextArea screen;
	private ServerSocket serverSocket;
	private static final String SEPARATOR = System.lineSeparator();

	/**
	 * Creates server listening on the given port.
	 * 
	 * @param port
	 *            The port for listening.
	 * @param screen
	 *            Field coverage of events occurring
	 */
	public Server(TextArea screen) {
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
		try (ServerSocket servSocket = new ServerSocket(7000)) {
			serverSocket = servSocket;
			screen.appendText("Server started." + SEPARATOR
					+ "Waiting for connection on port:"
					+ servSocket.getLocalPort() + SEPARATOR);

			while (run) {
				try (Socket clientSocket = serverSocket.accept()) {
					screen.appendText(clientSocket.getInetAddress()
							+ " has succesfully connected on port "
							+ clientSocket.getLocalPort() + SEPARATOR);
					PrintWriter out = new PrintWriter(
							clientSocket.getOutputStream(), true);
					out.println(
							"Hello! " + new Time(System.currentTimeMillis()));
					if (clientSocket.isInputShutdown()) {
						screen.appendText("Client disconnected." + SEPARATOR);
					}
				} catch (IOException e) {
					screen.appendText(
							"The server has been stopped." + SEPARATOR);
				}
			}
		} catch (IOException e) {
			screen.appendText("Could not listen on port: " + port + SEPARATOR);
			return;
		}
	}

	@Override
	public void run() {
		runServer();
	}
}
