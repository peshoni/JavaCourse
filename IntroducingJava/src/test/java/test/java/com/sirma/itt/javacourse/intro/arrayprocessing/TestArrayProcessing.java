package test.java.com.sirma.itt.javacourse.intro.arrayprocessing;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.sirma.itt.javacourse.intro.arrayprocessing.ArrayProcessing;

/**
 * ITTE-1544 Test array processing.
 * 
 * @author Petar Ivanov
 */
public class TestArrayProcessing {
	/**
	 * Tests Insert elements method.
	 */
	@Test
	public void testInsertElements() {
		final int size = 3;
		final int[] expectedArray = { 2, 1, -1 };
		Scanner consoleInput = new Scanner("2 1 -1");
		int[] array = ArrayProcessing.insertsElements("Element:", consoleInput, size);
		Assert.assertArrayEquals(expectedArray, array);
	}

	/**
	 * Tests summator method.
	 */
	@Test
	public void testSumMethod() {
		int sum = 0;
		final int expectedSum = 2;
		final int size = 3;
		Scanner consoleInput = new Scanner("2 1 -1");

		int[] array = ArrayProcessing.insertsElements("Element:", consoleInput, size);
		sum = ArrayProcessing.calculateSum(array);
		Assert.assertTrue(sum == expectedSum);
	}

	/**
	 * Test getMinElementIndex.
	 */
	@Test
	public void testMinMethod() {
		int size = 0;
		int minElementIndex = 0;

		Scanner consoleInput = new Scanner("3 2 1 -1");
		size = consoleInput.nextInt();

		int[] array = ArrayProcessing.insertsElements("Element:", consoleInput, size);
		final int expectedIndex = 2;
		minElementIndex = ArrayProcessing.getMinElementIndex(array);
		Assert.assertTrue(expectedIndex == minElementIndex);
	}
}
