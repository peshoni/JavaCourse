package test.java.com.sirma.itt.javacourse.intro.randomstring;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.sirma.itt.javacourse.intro.randomstring.RandomString;

/**
 * ITTE-1545 Test RandomString class.
 * 
 * @author Petar Ivanov
 */
public class TestRandomString {
	/**
	 * Test generation process. Test the size of the generated string with a set of inputs.
	 */
	@Test
	public final void testRandonStringGenerator() {
		String randomString = null;
		Scanner consoleInput = new Scanner("10");
		int size = Integer.parseInt(consoleInput.next());

		final int expectedSize = 10;
		randomString = RandomString.generatesString(consoleInput, size);

		Assert.assertEquals(expectedSize, randomString.length());
	}
}
