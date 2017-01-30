package main.java.com.sirma.itt.javacourse.intro.randomstring;

import java.util.Random;
import java.util.Scanner;

/**
 * ITTE-1545 Utility class that contains methods for generating random string with given length ahd random number
 * generator.
 * 
 * @author Petar Ivanov
 */
public final class RandomString {

	/**
	 * Utility classes should not have a public or default constructor.
	 */
	private RandomString() {
	}

	/**
	 * A method of generating random strings.
	 * 
	 * @param consoleInput
	 *            Input values from keyboard.
	 * @param size
	 *            Specifies the length of the string.
	 * @return Generates random string with given length.
	 */
	public static String generatesString(Scanner consoleInput, final int size) {
		final String source = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder builder = new StringBuilder();
		for (int index = 0; index < size; index++) {
			builder.append(source.charAt(generatesRandomNumber(source.length())));
		}
		return builder.toString();
	}

	/**
	 * Method of generating random number.
	 * 
	 * @param limit
	 *            From zero to where.
	 * @return Generated number.
	 */
	public static int generatesRandomNumber(final int limit) {
		int number = 0;
		Random generator = new Random();
		number = generator.nextInt(limit);
		return number;
	}

}
