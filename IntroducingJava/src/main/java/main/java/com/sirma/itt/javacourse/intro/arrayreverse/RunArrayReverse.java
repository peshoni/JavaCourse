package main.java.com.sirma.itt.javacourse.intro.arrayreverse;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import main.java.com.sirma.itt.javacourse.intro.arrayprocessing.ArrayProcessing;
import main.java.com.sirma.itt.javacourse.intro.greatestcommondivisor.GreatestCommonDivisor;

/**
 * ITTE-1541 - Run array reverse.
 * 
 * @author Petar Ivanov
 */
public final class RunArrayReverse {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunArrayReverse.class);

	/**
	 * Utility classes should not have a public or default constructor.
	 */
	private RunArrayReverse() {
	}

	/**
	 * Run main method.
	 * 
	 * @param args
	 *            Arguments of the main method
	 */
	public static void main(final String[] args) {
		Scanner consoleInput = new Scanner(System.in,"UTF-8");
		int size = GreatestCommonDivisor.insertInteger("Insert size: ", consoleInput);

		int[] array = ArrayProcessing.insertsElements("Insert value: ", consoleInput, size);
		ArrayProcessing.checksArray(array);
		consoleInput.close();

		LOGGER.info("Completed array: " + ArrayProcessing.printsArray(array));
		ArrayReverse.reverseArray(array);
		LOGGER.info("Reversed array:  " + ArrayProcessing.printsArray(array));
	}
}
