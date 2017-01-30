package com.sirma.itt.javacourse.networkingandgui.clientinfo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.sirma.itt.javacourse.networkingandgui.utility.Sockets;

import javafx.scene.control.TextArea;

/**
 * ITTE-1959 Clients info.
 * 
 * @author Petar Ivanov
 */
public class ServerOne implements Runnable {
	private volatile boolean run;
	private TextArea screen;
	private ServerSocket serverSocket;
	private ArrayList<ConnectionHandler> clients;
	private static final String SEPARATOR = System.lineSeparator();
	private int counter;

	/**
	 * Creates server that provides clients information.
	 * 
	 * @param screen
	 *            Field coverage of events occurring
	 */
	public ServerOne(TextArea screen) {
		clients = new ArrayList<ConnectionHandler>();
		this.screen = screen;
		setRun(false);
	}

	/**
	 * Runs the server until told otherwise by the client.
	 */
	private void runServer() {
		counter = 1;
		ServerSocket servSocket = Sockets.getServerSocket();
		screen.appendText("Server started on port:" + servSocket.getLocalPort()
				+ SEPARATOR);
		try {
			while (true) {
				Socket socket = servSocket.accept();
				try {
					ConnectionHandler handler = new ConnectionHandler(socket);

					for (ConnectionHandler connectionHandler : clients) {
						System.out.println(
								"Pratihme sabshtenie na vsichki v spisaka"
										+ clients.size());
						if (!connectionHandler.isRunning()) {
							clients.remove(this);
							counter--;
						} else {
							connectionHandler.sendMessage(
									"Client " + counter + " joined us");
						}
					}
					handler.sendMessage("Hello, client " + counter + SEPARATOR);
					screen.appendText(
							"Client " + counter + " is connected." + SEPARATOR);
					screen.appendText("Online clients: " + counter + SEPARATOR);
					counter++;
					clients.add(handler);
				} catch (Exception e) {
					socket.close();
				}
			}
		} catch (IOException e1) {
			screen.appendText("Failed to accepting.");
		} finally {
			try {
				servSocket.close();
			} catch (IOException e) {
				screen.appendText("I/O Exception occurs.");
			}
		}
	}

	@Override
	public void run() {
		runServer();
	}

	/**
	 * 
	 * @return
	 */
	public boolean isRun() {
		return run;
	}

	/**
	 * Setter method for run.
	 * 
	 * @param run
	 */
	public void setRun(boolean run) {
		this.run = run;
	}

	/**
	 * Stops the server.
	 */
	public void stop() {
		setRun(false);
		if (serverSocket != null) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				screen.appendText(
						"Couldn't close the server socket" + SEPARATOR);
			}
		}
	}
}
