package com.sirma.trash;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketEx {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(2002);
		Socket socket = serverSocket.accept();
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // true
																			// =>
																			// automatic
																			// flushing
																			// 
																			// 
																			// 
		out.println("Hello Client"); // + "\n" atomatic flushing e izkq4eno
		out.close();
		socket.close();
	}
}
