package com.sirma.itt.javacourse.inputoutput.print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sirma.itt.javacourse.inputoutput.consolereader.ConsoleReader;

/**
 * ITTE-1808 Run class of the WriteText class.
 * 
 * @author Petar Ivanov
 */
public class RunWriteText {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunWriteText.class);

	/**
	 * Private constructor.
	 * 
	 */
	private RunWriteText() {
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
		/**
		 * Current directory.
		 */
		Path path = Paths.get(".");
		StringBuilder fileName = new StringBuilder();
		LOGGER.info("Insert the name of the file.");
		try {
			fileName.append(ConsoleReader.nextString(reader));
			fileName.append(".txt");
			WriteText.createFile(path, fileName.toString());
		} catch (IOException e) {
			LOGGER.info("I/O Exception occurs.");
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				LOGGER.info("Cant close stream.", e);
			}
		}
	}
}
