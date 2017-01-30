package main.java.com.sirma.itt.javacourse.intro.summinglargenumbers;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1558 Utility class that contains method for summing large numbers.
 * 
 * @author Petar Ivanov
 */
public final class SummingLargeNumbers {
	private static final Logger LOGGER = LoggerFactory.getLogger(SummingLargeNumbers.class);

	/**
	 * Utility classes should not have a public or default constructor.
	 */
	private SummingLargeNumbers() {
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
	public static String summingLargeNumbers(String firstString, String secondString) {
		int firstAdendIndex = firstString.length() - 1;
		int secondAddendIndex = secondString.length() - 1;
		int outputIndex = Math.max(firstString.length(), secondString.length());

		char[] charsFirstAddend = SummingLargeNumbers.fillArrayWithChars(firstString);
		char[] charsSecondAddend = SummingLargeNumbers.fillArrayWithChars(secondString);
		char[] charsOutput = new char[outputIndex + 1];
		charsOutput[outputIndex] = '0';
		int sumInteger = 0;

		while (firstAdendIndex >= 0 || secondAddendIndex >= 0) {
			if (firstAdendIndex >= 0 && secondAddendIndex >= 0) {
				sumInteger = charsFirstAddend[firstAdendIndex] - '0' + charsSecondAddend[secondAddendIndex] - '0'
						+ charsOutput[outputIndex] - '0';
			} else if (secondAddendIndex >= 0) {
				sumInteger = charsSecondAddend[secondAddendIndex] - '0' + charsOutput[outputIndex] - '0';
			} else if (firstAdendIndex >= 0) {
				sumInteger = charsFirstAddend[firstAdendIndex] - '0' + charsOutput[outputIndex] - '0';

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
	 * Method which reads array of chars and converts it into a string
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
	 * Method that puts elements of the string into an array of chars.
	 * 
	 * @param string
	 *            For processing
	 * @return Array with chars
	 */
	public static char[] fillArrayWithChars(final String string) {
		int size = string.length();
		char[] array = new char[size];

		for (int index = 0; index <= size - 1; index++) {
			array[index] = string.charAt(index);
		}
		return array;
	}

	/**
	 * Method for insert strings.
	 * 
	 * @param info
	 *            Text message to the user
	 * @param consoleInput
	 *            Input values from keyboard
	 * @return Entered string
	 */
	public static String insertString(final String info, final Scanner consoleInput) {
		String string = null;
		LOGGER.info(info);
		string = consoleInput.nextLine();
		return string;
	}
}