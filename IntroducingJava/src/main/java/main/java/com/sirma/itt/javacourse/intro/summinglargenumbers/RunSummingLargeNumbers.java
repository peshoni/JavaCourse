package main.java.com.sirma.itt.javacourse.intro.summinglargenumbers;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1558 RunSummingLargeNumbers class.
 * 
 * @author Petar Ivanov
 */
public final class RunSummingLargeNumbers {

	private static final Logger LOGGER = LoggerFactory.getLogger(RunSummingLargeNumbers.class);

	/**
	 * Utility classes should not have a public or default constructor.
	 */
	private RunSummingLargeNumbers() {
	}

	/**
	 * RunSummingLargeNumbers main method.
	 * 
	 * @param args
	 *            Arguments of the main method
	 */
	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in,"UTF-8");

		String firstString = SummingLargeNumbers.insertString("The first big number: ", consoleInput);
		String secondString = SummingLargeNumbers.insertString("The second big number: ", consoleInput);

		String result = SummingLargeNumbers.summingLargeNumbers(firstString, secondString);
		LOGGER.info("Result is:  " + result);
	}
}
