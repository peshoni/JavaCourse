package com.sirma.itt.javacourse.exceptions.sumator;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * ITTE-1728 Utility class which contains method for summing large numbers.
 * 
 * @author Petar Ivanov
 */
public final class Sumator {

	/**
	 * Private constructor for utility class.
	 */
	private Sumator() {
	}

	/**
	 * Process and adds two strings.
	 * 
	 * @param firstString
	 *            First string for processing.
	 * @param secondString
	 *            Second string for processing.
	 * @return Result of sum().
	 */
	public static final String sum(String firstString, String secondString) {
		return sumStrings(firstString, secondString);
	}

	/**
	 * Method, which processes and adds two strings.
	 * 
	 * @param firstString
	 *            First string for processing.
	 * @param secondString
	 *            Second string for processing.
	 * @return The sum in the form of a string.
	 */
	private static String sumStrings(String firstString, String secondString) {
		int firstAdendIndex = firstString.length() - 1;
		int secondAddendIndex = secondString.length() - 1;
		int outputIndex = Math.max(firstString.length(), secondString.length());
		char[] charsFirstAddend = firstString.toCharArray();
		char[] charsSecondAddend = secondString.toCharArray();
		char[] charsOutput = new char[outputIndex + 1];
		charsOutput[outputIndex] = '0';
		int sumInteger = 0;

		while (firstAdendIndex >= 0 || secondAddendIndex >= 0) {
			if (firstAdendIndex >= 0 && secondAddendIndex >= 0) {
				sumInteger = Integer.parseInt(String.valueOf(charsFirstAddend[firstAdendIndex]))
						+ Integer.parseInt(String.valueOf(charsSecondAddend[secondAddendIndex]))
						+ Integer.parseInt(String.valueOf(charsOutput[outputIndex]));
			} else if (secondAddendIndex >= 0) {
				sumInteger = Integer.parseInt(String.valueOf(charsSecondAddend[secondAddendIndex]))
						+ Integer.parseInt(String.valueOf(charsOutput[outputIndex]));
			} else if (firstAdendIndex >= 0) {
				sumInteger = Integer.parseInt(String.valueOf(charsFirstAddend[firstAdendIndex]))
						+ Integer.parseInt(String.valueOf(charsOutput[outputIndex]));
			}
			charsOutput[outputIndex] = (char) (sumInteger % 10 + '0');
			charsOutput[outputIndex - 1] = (char) (sumInteger / 10 + '0');

			firstAdendIndex--;
			secondAddendIndex--;
			outputIndex--;
		}
		return printResult(charsOutput);
	}

	/**
	 * Method which print result
	 * 
	 * @param charsOutput
	 *            Array for processing.
	 * @return String with result.
	 */
	private static String printResult(char[] charsOutput) {
		final String hideZero = "0+\\d+";
		StringBuilder builder = new StringBuilder();
		builder.append(charsOutput);
		String result = builder.toString();
		while (result.matches(hideZero)) {
			result = result.substring(1);
		}
		return result;
	}

	/**
	 * Method for insert strings.
	 * 
	 * @param reader
	 *            {@link BufferedReader}
	 * @return Entered string
	 * @throws IOException
	 *             When occurs.
	 */
	public static String insertString(BufferedReader reader) throws IOException {
		String string = null;
		string = reader.readLine();
		return string;
	}
}
