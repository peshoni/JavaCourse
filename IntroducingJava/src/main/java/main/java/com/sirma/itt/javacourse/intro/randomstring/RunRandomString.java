package main.java.com.sirma.itt.javacourse.intro.randomstring;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import main.java.com.sirma.itt.javacourse.intro.greatestcommondivisor.GreatestCommonDivisor;

/**
 * ITTE-1545 Run RandomString class.
 * 
 * @author Petar Ivanov
 */
public final class RunRandomString {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunRandomString.class);

	/**
	 * Utility classes should not have a public or default constructor.
	 */
	private RunRandomString() {
	}

	/**
	 * Run RandomString class main method.
	 * 
	 * @param args
	 *            Arguments of the main method
	 */
	public static void main(final String[] args) {
		String randomString = null;
		Scanner consoleInput = new Scanner(System.in,"UTF-8");

		int size = GreatestCommonDivisor.insertInteger("Insert size: ", consoleInput);
		randomString = RandomString.generatesString(consoleInput, size);

		LOGGER.info("Random string is: " + randomString);
	}
}
