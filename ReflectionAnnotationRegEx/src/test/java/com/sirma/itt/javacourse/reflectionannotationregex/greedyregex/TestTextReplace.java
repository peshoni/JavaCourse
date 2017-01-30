package com.sirma.itt.javacourse.reflectionannotationregex.greedyregex;

import org.junit.Assert;
import org.junit.Test;

/**
 * ITTE-1742 Test the TextReplace class.
 * 
 * @author Petar Ivanov
 */
public class TestTextReplace {
	/**
	 * Test with a string that contains symbols fulfilling the condition for
	 * replacement.
	 */
	@Test
	public final void testReplaseTextMethod() {
		String text = "<x><b></b><x>Hello world</x><b>sdfsdf</b><x>Good morning</x><x>69</x><x>sdfsdfsdf</x></x>";
		String expected = "<x><b></b><x/><b>sdfsdf</b><x/><x/><x/></x>";
		Assert.assertEquals(expected, TextReplace.replaseText(text));
	}

	/**
	 * Test with a string that contains symbols fulfilling the condition for
	 * replacement.
	 */
	@Test
	public final void test() {
		String secondText = "<x><b></b></x>It works!<x><b>sdfsdf</b></x>";
		String secondExpected = "<x/>It works!<x/>";
		Assert.assertEquals(secondExpected, TextReplace.replaseText(secondText));
	}
}
