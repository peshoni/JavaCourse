package com.sirma.itt.javacourse.exceptions.sumator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1728 RunSumator class.
 * 
 * @author Petar Ivanov
 */
public final class RunSumator {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunSumator.class);

	/**
	 * Private constructor for utility class.
	 */
	private RunSumator() {
	}

	/**
	 * RunSumator main method.
	 * 
	 * @param args
	 *            Arguments of the main method
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
		String firstString;
		String secondString;
		try {
			LOGGER.info("The first number: ");
			firstString = Sumator.insertString(reader);
			LOGGER.info("The second number: ");
			secondString = Sumator.insertString(reader);
			String result = Sumator.sum(firstString, secondString);
			LOGGER.info("Result is: " + result);
		} catch (IOException e) {
			LOGGER.info("Entered strings contain a character/s which is not a number!", e);
		}
	}
}
