package com.sirma.itt.javacourse.exceptions.readsnumbersfromconsole;

import java.io.BufferedReader;
import java.io.StringReader;

import org.junit.Assert;
import org.junit.Test;

/**
 * ITTE-1729 Tests Reader class.
 * 
 * @author Petar Ivanov
 */
public class TestReader {
	/**
	 * Tests inserting integer in range .
	 */
	@Test
	public final void testInRange() {
		final int expectedInteger = 50;
		String input = "50";
		BufferedReader reader = new BufferedReader(new StringReader(input));
		int number;
		number = Reader.insertInteger(reader);
		Assert.assertEquals(expectedInteger, number);
	}

	/**
	 * Tests inserting integer out of range.
	 */
	@Test(expected = ReaderException.class)
	public final void testOutOfRange() {
		String input = "150";
		BufferedReader reader = new BufferedReader(new StringReader(input));
		Reader.insertInteger(reader);
	}

	/**
	 * Tests insert integer method with char.
	 */
	@Test(expected = RuntimeException.class)
	public final void testWithNotNumber() {
		String input = "a";
		BufferedReader reader = new BufferedReader(new StringReader(input));
		Reader.insertInteger(reader);
	}
}