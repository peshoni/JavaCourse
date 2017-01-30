package main.java.com.sirma.itt.javacourse.intro.arraysorting;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import main.java.com.sirma.itt.javacourse.intro.arrayprocessing.ArrayProcessing;
import main.java.com.sirma.itt.javacourse.intro.greatestcommondivisor.GreatestCommonDivisor;

/**
 * ITTE-1547 Run array sorting class.
 * 
 * @author Petar Ivanov
 */
public final class RunArraySorting {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunArraySorting.class);

	/**
	 * Utility classes should not have a public or default constructor.
	 */
	private RunArraySorting() {

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

		int lowerIndex = 0;
		int higherIndex = array.length - 1;

		LOGGER.info("Entered array: " + ArrayProcessing.printsArray(array));

		array = ArraySorting.quickSort(array, lowerIndex, higherIndex);
		LOGGER.info("The sorted array: " + ArrayProcessing.printsArray(array));
	}
}
