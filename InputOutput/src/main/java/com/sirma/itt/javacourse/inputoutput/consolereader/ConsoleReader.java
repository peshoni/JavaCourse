package com.sirma.itt.javacourse.inputoutput.consolereader;

import java.io.BufferedReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1807 - Console reader class
 * 
 * @author Petar Ivanov
 */
public class ConsoleReader {
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsoleReader.class);

	/**
	 * Private constructor for utility class.
	 */
	private ConsoleReader() {
	}

	/**
	 * Reads line from console.
	 * 
	 * @param reader
	 *            {@link BufferedReader}
	 * @return String with inserted text.
	 * @throws IOException
	 *             If I/O Exception occurs.
	 */

	public static String nextString(BufferedReader reader) throws IOException {
		String result = "";
		if (reader != null) {
			result = reader.readLine();
		}
		return result;
	}

	/**
	 * Reads integer from console.
	 * 
	 * @param reader
	 *            {@link BufferedReader}
	 * @return integer.
	 * @throws IOException
	 *             If I/O Exception occurs.
	 */
	public static int nextInt(BufferedReader reader) throws IOException {
		int integer = 0;
		String line = "";
		if (reader != null) {
			line = reader.readLine().split(" ")[0];
		}
		try {
			integer = Integer.parseInt(line);
		} catch (NumberFormatException e) {
			LOGGER.info("Expects integer!", e);
		}
		return integer;
	}

	/**
	 * Reads char from console.
	 * 
	 * @param reader
	 *            {@link BufferedReader}
	 * @return character from the input.
	 * @throws IOException
	 *             If I/O Exception occurs.
	 */

	public static char nextChar(BufferedReader reader) throws IOException {
		String result = "";
		if (reader != null) {
			result = reader.readLine();
		}
		return result.charAt(0);
	}

	/**
	 * Reads float number from console.
	 * 
	 * @param reader
	 *            {@link BufferedReader}
	 * @return {@link Float}
	 * @throws IOException
	 *             If an I/O exception occurs.
	 */
	public static float nextFloat(BufferedReader reader) throws IOException {
		float result = 0;
		String line = "";
		if (reader != null) {
			line = reader.readLine();
		}
		try {
			result = Float.parseFloat(line);
		} catch (NumberFormatException e) {
			LOGGER.info("Expects number!", e);
		}
		return result;
	}
}
