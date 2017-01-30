package main.java.com.sirma.itt.javacourse.intro.arraysorting;

import main.java.com.sirma.itt.javacourse.intro.arrayreverse.ArrayReverse;

/**
 * ITTE-1547 Array sorting class.
 * 
 * @author Petar Ivanov
 */
public final class ArraySorting {
	/**
	 * Utility classes should not have a public or default constructor.
	 */
	private ArraySorting() {

	}

	/**
	 * Implemented quickSort algorithm. In each iteration, we will identify a
	 * number from left side which is greater then the pivot value, and also we
	 * will identify a number from right side which is less then the pivot
	 * value. Once the search is done, then we exchange both numbers.
	 * 
	 * @param array
	 *            for processing.
	 * @param lowerIndex
	 *            Lower index of unsorted elements.
	 * @param higherIndex
	 *            Higher index of unsorted elements.
	 * @return sorted array
	 */
	public static int[] quickSort(int[] array, int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				ArrayReverse.swapElements(array, i, j);
				i++;
				j--;
			}
		}

		if (lowerIndex < j) {
			quickSort(array, lowerIndex, j);
		}

		if (i < higherIndex) {
			quickSort(array, i, higherIndex);
		}
		return array;
	}
}
