package com.sirma.itt.javacourse.inputoutput.reverse;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

/**
 * ITTE-1809 Test ReverseText class.
 * 
 * @author Petar Ivanov
 */
public class TestReverseText {
	final String FILE = "testReverse.txt";

	/**
	 * Test read file method.
	 * 
	 * @throws IOException
	 */
	@Test
	public final void testReadingFile() throws IOException {
		String text = ReversText.readTextFile(FILE);
		String expected = "!txet si sihT";
		Assert.assertEquals(expected, text);
	}

	/**
	 * Test readFile method with nonexisting filename.
	 * 
	 * @throws IOException
	 */
	@Test(expected = FileNotFoundException.class)
	public final void testFileNotFound() throws IOException {
		try {
			ReversText.readTextFile("@@@@");
		} catch (Exception e) {
			throw new FileNotFoundException();
		}
	}

	/**
	 * Tests reverseText method.
	 */
	@Test
	public final void testReverseMethod() {
		String string = "123456789";
		String expected = "987654321";
		Assert.assertEquals(expected, ReversText.reversText(string));
	}

	/**
	 * Tests rewriting method. When it passes the test calls rewrite function to return to the starting position.
	 * 
	 * @throws IOException
	 */
	@Test
	public final void testReadingAfterReversFile() throws IOException {
		String text = ReversText.readTextFile(FILE);
		String reversed = ReversText.reversText(text);
		ReversText.rewriteTextfile(reversed, FILE);
		Assert.assertEquals(reversed, ReversText.readTextFile(FILE));
		ReversText.rewriteTextfile(text, FILE);
	}
}
