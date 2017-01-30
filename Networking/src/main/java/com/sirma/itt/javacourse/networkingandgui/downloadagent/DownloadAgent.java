package com.sirma.itt.javacourse.networkingandgui.downloadagent;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sirma.itt.javacourse.inputoutput.transferobject.TransferObject;

public class DownloadAgent implements Runnable {
	private static final Logger LOGGER = LoggerFactory.getLogger(DownloadAgent.class);
	private int transferred;
	private int targetSize;
	private final int STEP = 16384;
	private TransferObject worker;
	private String url;
	private String fileName;
	private Path path;

	public DownloadAgent(String url, Path path) {
		this.url = url;
		this.path = path;
		transferred = 0;
	}

	@Override
	public void run() {
		download();
	}

	private void download() {
		URL downloadURL = null;
		URLConnection connection = null;
		try {
			downloadURL = new URL(url);
			connection = downloadURL.openConnection();
			targetSize = connection.getContentLength();
		} catch (MalformedURLException e1) {
			LOGGER.info("Invalid URL.");
			return;
		} catch (IOException e) {
			LOGGER.info("IOEx occurs" + e.getMessage());
			return;
		}

		String[] array = url.split("/");
		fileName = array[array.length - 1];
		Path pathFile = Paths.get(path.toString(), fileName);
		double start = System.currentTimeMillis();
		try {
			BufferedOutputStream out = new BufferedOutputStream(
					Files.newOutputStream(pathFile, StandardOpenOption.CREATE));
			InputStream input = downloadURL.openStream();
			BufferedInputStream in = new BufferedInputStream(input);
			worker = new TransferObject(in, out);
			while (transferred != targetSize) {
				transferred += worker.transfer(STEP, 0);
			}

			System.out.println("Transferred" + transferred);
			System.out.println("Time" + (System.currentTimeMillis() - start));
		} catch (IOException e) {
			LOGGER.info("IOEx occurs" + e.getMessage());
		}
	}

	public int getTargetSize() {
		return targetSize;
	}

	public int getTransferred() {
		return transferred;
	}

}
