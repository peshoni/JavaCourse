package test.java.com.sirma.itt.javacourse.intro.summinglargenumbers;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.sirma.itt.javacourse.intro.summinglargenumbers.SummingLargeNumbers;

/**
 * ITTE-1558 TestSummingLargeNumbers class.
 * 
 * @author Petar Ivanov
 */
public class TestSummingLargeNumbers {

	/**
	 * Tests method summingLargeNumbers
	 */
	@Test
	public final void testSumLargeNumbers() {
		String firstAddend = "12345678955865523545";
		String secondAddend = "99865235445882214555";
		String expectedString = "112210914401747738100";
		Assert.assertEquals(expectedString, SummingLargeNumbers.summingLargeNumbers(firstAddend, secondAddend));
	}

	/**
	 * Tests method summingLargeNumbers
	 */
	@Test
	public final void testSumLargeNumbersTwo() {
		String firstAddend = "1";
		String secondAddend = "999";
		String expectedString = "1000";
		Assert.assertEquals(expectedString, SummingLargeNumbers.summingLargeNumbers(firstAddend, secondAddend));
	}

	/**
	 * Tests method summingLargeNumbers
	 */
	@Test
	public final void testSumLargeNumbersThree() {
		String firstAddend = "0";
		String secondAddend = "999";
		String expectedString = "999";
		Assert.assertEquals(expectedString, SummingLargeNumbers.summingLargeNumbers(firstAddend, secondAddend));
	}

	/**
	 * Tests method summingLargeNumbers
	 */
	@Test
	public final void testSumLargeNumbersFour() {
		String firstAddend = "";
		String secondAddend = "";
		String expectedString = "0";
		Assert.assertEquals(expectedString, SummingLargeNumbers.summingLargeNumbers(firstAddend, secondAddend));
	}
}
