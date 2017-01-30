package com.sirma.itt.javacourse.exceptions.sumator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.junit.Assert;
import org.junit.Test;

/**
 * ITTE-1728 Tests Summator class.
 * 
 * @author Petar Ivanov
 */
public class TestSumator {
	/**
	 * Test insert string method with correct data.
	 * 
	 * @throws IOException
	 */
	@Test
	public final void testInsert() throws IOException {
		String input = "123456789";
		String expected = "123456789";
		BufferedReader reader = new BufferedReader(new StringReader(input));
		String output = Sumator.insertString(reader);
		Assert.assertEquals(expected, output);
	}

	/**
	 * Tests sum method with correct input data.
	 */
	@Test
	public final void testSumString() {
		String firstAddend = "12345678955865523545";
		String secondAddend = "99865235445882214555";
		String expectedString = "112210914401747738100";
		Assert.assertEquals(expectedString, Sumator.sum(firstAddend, secondAddend));
	}

	/**
	 * Tests with correct input data.
	 */
	@Test
	public final void testSumStrings() {
		String firstAddend = "12345678955865523545";
		String secondAddend = "0";
		String expectedString = "12345678955865523545";
		Assert.assertEquals(expectedString, Sumator.sum(firstAddend, secondAddend));
	}

	/**
	 * Tests with incorrect input data.
	 */
	@Test(expected = NumberFormatException.class)
	public final void testStringsWithNotNumberChars() {
		String firstAddend = "a";
		String secondAddend = "";
		Sumator.sum(secondAddend, firstAddend);
	}
}
