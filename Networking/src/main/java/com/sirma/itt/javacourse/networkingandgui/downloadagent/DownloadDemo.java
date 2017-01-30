package com.sirma.itt.javacourse.networkingandgui.downloadagent;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DownloadDemo {

	public static void main(String[] args) {
		String url = "http://mirror.internode.on.net/pub/test/5meg.test5";
		String local = "file:///i|/Calculator.jar";
		Path path = Paths.get(".");
		DownloadAgent agent = new DownloadAgent(local, path);
		Thread thread = new Thread(agent);
		thread.start();
	}
}
