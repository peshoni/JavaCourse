package main.java.com.sirma.itt.javacourse.intro.findingmedian;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import main.java.com.sirma.itt.javacourse.intro.arrayprocessing.ArrayProcessing;
import main.java.com.sirma.itt.javacourse.intro.greatestcommondivisor.GreatestCommonDivisor;

/**
 * ITTE-1546 Run Finding the array's median class.
 * 
 * @author Petar Ivanov
 */
public final class RunFindingTheArraysMedian {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunFindingTheArraysMedian.class);

	/**
	 * Utility classes should not have a public or default constructor.
	 */

	private RunFindingTheArraysMedian() {
	}

	/**
	 * Runs FindingTheArraysMedian main method.
	 * 
	 * @param args
	 *            Arguments of the main method
	 */
	public static void main(final String[] args) {
		int index = 0;
		Scanner consoleInput = new Scanner(System.in,"UTF-8");
		int size = GreatestCommonDivisor.insertInteger("Insert size: ", consoleInput);
		int[] array = ArrayProcessing.insertsElements("Insert value: ", consoleInput, size);
		ArrayProcessing.checksArray(array);

		index = FindingTheArraysMedian.findMedian(array);
		LOGGER.info("The position of median is: " + Integer.toString(index + 1) + " with value: " + array[index] + ".");
	}
}
