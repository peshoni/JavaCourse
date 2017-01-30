package com.sirma.itt.javacourse.exceptions.readsnumbersfromconsole;

import java.io.BufferedReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1729 Reading numbers from console class.
 * 
 * @author Petar Ivanov
 */
public final class Reader {
	private static final Logger LOGGER = LoggerFactory.getLogger(Reader.class);

	/**
	 * Private constructor for a utility class.
	 */
	private Reader() {
	}

	/**
	 * Read integers from the console. Verify whether they are in the range of 0-100 and handles exceptions occurred.
	 * 
	 * @param reader
	 *            {@link BufferedReader}
	 * @return integer
	 */
	public static int insertInteger(BufferedReader reader) {
		int integer = 0;
		try {
			integer = Integer.parseInt(reader.readLine());
			if (integer > 100 || integer < 0) {
				throw new ReaderException("The number is out of range.");
			}
			LOGGER.info(String.valueOf(integer));
		} catch (NumberFormatException e) {
			throw new ReaderException("Input is not a number.", e);
		} catch (IOException e) {
			LOGGER.info("I/O exception occurs.", e);
		}
		return integer;
	}
}
