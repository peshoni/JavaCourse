package main.java.com.sirma.itt.javacourse.intro.arrayreverse;

/**
 * ITTE 1541 - Array reverse.
 * 
 * @author Petar Ivanov
 */
public final class ArrayReverse {
	/**
	 * Utility classes should not have a public or default constructor.
	 */

	private ArrayReverse() {
	}

	/**
	 * Method for swapping two elements of array.
	 * 
	 * @param array
	 *            For processing
	 * @param i
	 *            Index of an element of the exchange
	 * @param j
	 *            Index of the other element of exchange
	 */
	public static void swapElements(final int[] array, final int i, final int j) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * A method of reversing the arrays.
	 * 
	 * @param array
	 *            for processing
	 * @return Reversed array
	 */
	public static int[] reverseArray(final int[] array) {
		int j = array.length - 1;
		int middle = array.length / 2;

		for (int i = 0; i < middle; i++) {
			swapElements(array, i, j);
			j--;
		}
		return array;
	}
}
