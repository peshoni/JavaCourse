package com.sirma.trash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class AAARunServer implements Runnable {
	private static int port;
	private volatile boolean run;

	/**
	 * Constructor
	 * 
	 * @param port
	 */
	public AAARunServer(int port) {
		this.port = port;
	}

	@Override
	public void run() {
		try {
			start();
		} catch (IOException e) {
			System.out.println("exception from runn method");
		}

	}

	private void start() throws IOException {
		ServerSocket servSocket = findServer();//
		BufferedReader input = null;
		PrintWriter print;
		System.out.println(
				"Server listening on port:" + servSocket.getLocalPort());

		try {
			Socket socket = servSocket.accept();
			System.out.println("client accepted.");
			try {
				System.out.println("Client on port: " + socket.getLocalPort());
				/////////////// vhoden potok
				input = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				////// izhoden pototk

				System.out.println(input.readLine());
				print = new PrintWriter(
						new OutputStreamWriter(socket.getOutputStream()));
				String message = "Wellcome!";
				print.println(message);
				print.close();

			} finally {
				socket.close();
			}
		} finally {
			servSocket.close();
		}
	}

	public static ServerSocket findServer() {
		ServerSocket socket = null;
		for (int i = 7000; i < 7020; i++) {
			try {
				socket = new ServerSocket(i);
				port = socket.getLocalPort();
				break;
			} catch (UnknownHostException e) {
			} catch (IOException e) {
			}
		}
		return socket;
	}

	public static void main(String[] args) throws IOException {
		AAARunServer server = new AAARunServer(7000);
		Thread thr = new Thread(server);
		thr.start();

	}
}
