package com.sirma.itt.javacourse.inputoutput.print;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;

import com.sirma.itt.javacourse.inputoutput.consolereader.ConsoleReader;

/**
 * ITTE-1808 - Class that reads text from console and write it in txt file.
 * 
 * @author Petar Ivanov
 */
public class WriteText {

	/**
	 * Private constructor for utility class.
	 */
	private WriteText() {
	}

	/**
	 * Creates text file.
	 * 
	 * @param path
	 *            File path.
	 * @param fileName
	 *            Filename.
	 * @throws IOException
	 *             When the I/0 exception occurs.
	 */
	public static void createFile(Path path, String fileName) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
		StringBuilder input = new StringBuilder();
		Path pathFile = Paths.get(path.toString(), fileName);
		Files.newOutputStream(pathFile, StandardOpenOption.CREATE);
		String text = null;
		while (!".".equals(text)) {
			text = ConsoleReader.nextString(reader);
			input.append(new Date());
			input.append(".");
			input.append(text);
			input.append(System.lineSeparator());
		}
		writeInFile(input.toString(), pathFile);
	}

	/**
	 * Method to add text in a text file.
	 * 
	 * @param string
	 *            String to add.
	 * @param pathFile
	 *            File path.
	 * @throws IOException
	 *             When the I/0 exception occurs.
	 */
	private static void writeInFile(String string, Path pathFile) throws IOException {
		try (BufferedOutputStream output = new BufferedOutputStream(
				Files.newOutputStream(pathFile, StandardOpenOption.APPEND))) {
			output.write(string.getBytes());
		}
	}
}