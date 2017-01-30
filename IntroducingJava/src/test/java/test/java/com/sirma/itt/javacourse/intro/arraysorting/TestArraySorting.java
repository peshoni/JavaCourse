package test.java.com.sirma.itt.javacourse.intro.arraysorting;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.sirma.itt.javacourse.intro.arrayprocessing.ArrayProcessing;
import main.java.com.sirma.itt.javacourse.intro.arraysorting.ArraySorting;

/**
 * ITTE-1547 Test array sorting class.
 * 
 * @author Petar Ivanov
 */
public class TestArraySorting {
	/**
	 * Test QuickSort method.
	 */
	@Test
	public final void testQuickSort() {
		Scanner consoleInput = new Scanner("2 1 -1 -100 29 -75");
		final int size = 6;

		int[] array = ArrayProcessing.insertsElements("Element:", consoleInput, size);
		final int[] expectedArray = new int[] { -100, -75, -1, 1, 2, 29 };

		int left = 0;
		int right = array.length - 1;
		array = ArraySorting.quickSort(array, left, right);
		Assert.assertArrayEquals(expectedArray, array);
	}

	/**
	 * Tests method for array with one element.
	 */
	@Test
	public final void testQuickSortOne() {
		Scanner consoleInput = new Scanner("100");
		final int size = 1;

		int[] array = ArrayProcessing.insertsElements("Element:", consoleInput, size);
		final int[] expectedArray = new int[] { 100 };

		int left = 0;
		int right = array.length - 1;
		array = ArraySorting.quickSort(array, left, right);
		Assert.assertArrayEquals(expectedArray, array);
	}

	/**
	 * Tests method for array with bell distribution of numbers because the choice of pivot.
	 */
	@Test
	public final void testQuicksortBell() {
		Scanner consoleInput = new Scanner("2 7 8 9 10 10 9 8 3 -1001");
		final int size = 10;

		int[] array = ArrayProcessing.insertsElements("Element:", consoleInput, size);
		final int[] expectedArray = new int[] { -1001, 2, 3, 7, 8, 8, 9, 9, 10, 10 };

		int left = 0;
		int right = array.length - 1;
		array = ArraySorting.quickSort(array, left, right);
		Assert.assertArrayEquals(expectedArray, array);
	}
}
