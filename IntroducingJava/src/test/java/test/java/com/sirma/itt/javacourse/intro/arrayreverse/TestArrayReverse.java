package test.java.com.sirma.itt.javacourse.intro.arrayreverse;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.sirma.itt.javacourse.intro.arrayreverse.ArrayReverse;

/**
 * ITTE-1541 - Test array reverse class.
 * 
 * @author Petar Ivanov
 */
public final class TestArrayReverse {
	/**
	 * Tests swap elements.
	 */
	@Test
	public final void testSwap() {
		int[] array = new int[] { 2, 1000 };
		int i = 0;
		int j = array.length - 1;
		int[] expectedArray = new int[] { 1000, 2 };
		ArrayReverse.swapElements(array, i, j);
		Assert.assertArrayEquals(expectedArray, array);
	}

	/**
	 * Tests Reverse method.
	 * 
	 * @throws Exception
	 *             Expected numbers
	 */
	@Test
	public final void testReverse() throws Exception {
		final int[] expectedArray = new int[] { 3, 2, -1 };
		int[] array = new int[] { -1, 2, 3 };
		ArrayReverse.reverseArray(array);
		Assert.assertArrayEquals(expectedArray, array);
	}
}
