package test.java.com.sirma.itt.javacourse.intro.findingmedian;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.sirma.itt.javacourse.intro.findingmedian.FindingTheArraysMedian;

/**
 * ITTE-1546 Tests finding the array's median class.
 * 
 * @author Petar Ivanov
 */
public class TestFindingTheArraysMedian {

	/**
	 * Tests findMedian method.
	 */
	@Test
	public final void testFindMedian() {
		int index = 0;

		final int[] array = new int[] { 1, 2, 3, 4, 5 };
		index = FindingTheArraysMedian.findMedian(array);
		Assert.assertEquals(3, index);
	}

	@Test
	public final void testTwoFindMedian() {
		int index = 0;

		final int[] array = new int[] { 1 };
		index = FindingTheArraysMedian.findMedian(array);
		Assert.assertEquals(0, index);
	}

	@Test
	public final void testFindMedianWithNegativValues() {
		int index = 0;

		final int[] array = new int[] { -1, -2, -3, -2, -1 };
		index = FindingTheArraysMedian.findMedian(array);
		Assert.assertEquals(2, index);
	}
}
