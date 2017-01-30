package com.sirma.itt.javacourse.exceptions.readsnumbersfromconsole;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1729 Run Reader class.
 * 
 * @author Petar Ivanov
 */
public class RunReader {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunReader.class);

	/**
	 * Private constructor.
	 */
	private RunReader() {
	}

	/**
	 * Main method for the Reader class.
	 * 
	 * @param args
	 *            array of arguments.
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		BufferedReader reader = null;
		reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
		LOGGER.info("Enter integer ranging from 0 to 100: ");
		try {
			Reader.insertInteger(reader);
		} catch (Exception e) {
			LOGGER.info(e.getMessage(), e);
		}
	}
}
