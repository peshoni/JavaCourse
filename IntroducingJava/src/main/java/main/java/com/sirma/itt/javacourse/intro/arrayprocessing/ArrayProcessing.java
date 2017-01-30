package main.java.com.sirma.itt.javacourse.intro.arrayprocessing;

import java.util.Scanner;

/**
 * ITTE-1544 Array processing. Utility class that contains methods for array processing.
 * 
 * @author Petar Ivanov
 */
public final class ArrayProcessing {
	/**
	 * Utility classes should not have a public or default constructor.
	 */
	private ArrayProcessing() {
	}

	/**
	 * Finds index of the element with minimum value.
	 * 
	 * @param array
	 *            for processing
	 * @return minElementIndex contains index of element with minimum value
	 */
	public static int getMinElementIndex(final int[] array) {
		int minElementIndex = 0;
		int minElement = array[0];

		for (int index = 1; index < array.length; index++) {
			if (array[index] < minElement) {
				minElement = array[index];
				minElementIndex = index;
			}
		}
		return minElementIndex;
	}

	/**
	 * Sum elements of array.
	 * 
	 * @param array
	 *            for processing
	 * @return Amount of items
	 */
	public static int calculateSum(final int[] array) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum += array[index];
		}
		return sum;
	}

	/**
	 * Print array.
	 * 
	 * @param array
	 *            for processing
	 * @return String with values of array
	 */
	public static String printsArray(final int[] array) {
		StringBuilder builder = new StringBuilder();
		for (int index = 0; index < array.length; index++) {
			builder.append(array[index]).append(" ");
		}
		return builder.toString();
	}

	/**
	 * Fills array with values.
	 * 
	 * @param userInfo
	 *            Text message to the user
	 * @param consoleInput
	 *            Input values from keyboard
	 * @param size
	 *            Length of array
	 * @return array with values
	 */
	public static int[] insertsElements(String userInfo, final Scanner consoleInput, int size) {
		int[] array = new int[size];
		for (int index = 0; index < size; index++) {
			array[index] = consoleInput.nextInt();
		}
		return array;
	}

	/**
	 * Method verify that the array is not empty.
	 * 
	 * @param array
	 *            For processing
	 */
	public static void checksArray(final int[] array) {
		if (array == null) {
			throw new IllegalArgumentException("The Array must not be null");
		} else if (array.length == 0) {
			throw new IllegalArgumentException("Array cannot be empty.");
		}
	}
}