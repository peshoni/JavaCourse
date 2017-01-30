package com.sirma.itt.javacourse.networkingandgui.utility;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Class that finds available port in given range.
 * 
 * @author Petar Ivanov
 */
public class Sockets {
	private final static int START = 7000;
	private final static int END = 7020;

	/**
	 * Private constructor for utility class.
	 */
	private Sockets() {
	}

	/**
	 * Gives random ServerSocket in given range.
	 * 
	 * @return ServerSocket in range 7000 - 7020.
	 */
	public static ServerSocket getServerSocket() {
		ServerSocket serverSocket = null;
		for (int i = START; i <= END; i++) {
			try {
				serverSocket = new ServerSocket(i);
				break;
			} catch (IOException e) {
			}
		}

		return serverSocket;
	}

	/**
	 * Search port in given range.
	 * 
	 * @return Socket or null if in range wasn't available.
	 */
	public static Socket getSocket() {
		Socket socket = null;
		for (int i = START; i <= END; i++) {
			try {
				socket = new Socket("localhost", i);
				break;
			} catch (UnknownHostException e) {
			} catch (IOException e) {
			}
		}
		return socket;
	}
}