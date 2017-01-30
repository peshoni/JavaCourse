package com.sirma.itt.javacourse.inputoutput.reverse;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1809 - Class, which reads the contents of a text file, reverse the contents and write it in the same file.
 * 
 * @author Petar Ivanov
 */
public class ReversText {
	private static final Logger LOGGER = LoggerFactory.getLogger(ReversText.class);

	/**
	 * Private constructor for utility class.
	 */
	private ReversText() {
	}

	/**
	 * Reads content of the text file.
	 * 
	 * @param path
	 *            Path to the file.
	 * @return String with content.
	 * @throws IOException
	 *             When the I/0 exception occurs.
	 */
	public static String readTextFile(String path) throws IOException {
		BufferedReader bufferedReader = null;
		StringBuilder builder = new StringBuilder();
		try {
			bufferedReader = new BufferedReader(new FileReader(path));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				builder.append(line);
			}
		} catch (FileNotFoundException e) {
			LOGGER.info("File not found!", e);
		} finally {
			bufferedReader.close();
		}
		return builder.toString();
	}

	/**
	 * Method that reverse string.
	 * 
	 * @param text
	 *            For reverse.
	 * @return Reversed text.
	 */
	public static String reversText(String text) {
		return new StringBuilder(text).reverse().toString();
	}

	/**
	 * Rewrite file with reversed text.
	 * 
	 * @param reversedFile
	 *            Reversed text.
	 * @param path
	 *            File path.
	 * @throws IOException
	 *             When the I/0 exception occurs.
	 */
	public static void rewriteTextfile(String reversedFile, String path) throws IOException {
		Path pathToFile = Paths.get(path);
		try (BufferedOutputStream output = new BufferedOutputStream(
				Files.newOutputStream(pathToFile, StandardOpenOption.TRUNCATE_EXISTING))) {
			output.write(reversedFile.getBytes(StandardCharsets.UTF_8));
		}
	}
}
