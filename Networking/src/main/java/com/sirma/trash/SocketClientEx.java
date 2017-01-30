package com.sirma.trash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketClientEx {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost", 2002);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));

		System.out.println("Messgae from server is: " + in.readLine());
		socket.close();
	}
}