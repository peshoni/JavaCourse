package main.java.com.sirma.itt.javacourse.intro.findingmedian;

import main.java.com.sirma.itt.javacourse.intro.arrayprocessing.ArrayProcessing;

/**
 * ITTE-1546 Utility class that contains method for finding the array's median.
 * 
 * @author Petar Ivanov
 */
public final class FindingTheArraysMedian {

	/**
	 * Utility classes should not have a public or default constructor.
	 */
	private FindingTheArraysMedian() {
	}

	/**
	 * Method for finding a median array by the smallest difference amounts
	 * around it.
	 * 
	 * @param array
	 *            for processing
	 * @return index The position of median.
	 */
	public static int findMedian(final int[] array) {
		int index = 0;
		int sum = array[0];
		int sumOfArray = ((Math.abs(ArrayProcessing.calculateSum(array))) - (Math.abs(array[0])));
		for (int i = 1; i <= array.length - 1; i++) {
			sumOfArray -= (Math.abs(array[i]));
			sum += (Math.abs(array[i]));

			if (Math.abs(sum) >= Math.abs(sumOfArray)) {
				index = i;
				break;
			} else {
				sum += Math.abs(array[i]);
			}
		}
		return index;
	}
}
