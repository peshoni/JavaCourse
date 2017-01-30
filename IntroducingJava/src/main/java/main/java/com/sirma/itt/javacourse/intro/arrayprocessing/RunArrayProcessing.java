package main.java.com.sirma.itt.javacourse.intro.arrayprocessing;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import main.java.com.sirma.itt.javacourse.intro.greatestcommondivisor.GreatestCommonDivisor;

/**
 * ITTE-1544 Run array processing.
 * 
 * @author Petar Ivanov
 */
public final class RunArrayProcessing {

	private static final Logger LOGGER = LoggerFactory.getLogger(RunArrayProcessing.class);

	/**
	 * Utility classes should not have a public or default constructor.
	 */

	private RunArrayProcessing() {
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
		int[] array = ArrayProcessing.insertsElements("Insert number: ", consoleInput, size);

		consoleInput.close();
		ArrayProcessing.checksArray(array);

		LOGGER.info("Elements which are entered: " + ArrayProcessing.printsArray(array));
		LOGGER.info("The index of the element with minimum value is: "
				+ Integer.toString(ArrayProcessing.getMinElementIndex(array)));

		LOGGER.info("The sum fo elements in array is: " + Integer.toString(ArrayProcessing.calculateSum(array)));
	}
}
