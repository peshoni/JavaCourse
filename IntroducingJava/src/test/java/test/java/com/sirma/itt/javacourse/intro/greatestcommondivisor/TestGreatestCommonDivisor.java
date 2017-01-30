package test.java.com.sirma.itt.javacourse.intro.greatestcommondivisor;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import main.java.com.sirma.itt.javacourse.intro.greatestcommondivisor.GreatestCommonDivisor;

/**
 * ITTE-1540 Tests GreatestCommonDivisor class.
 * 
 * @author Petar Ivanov
 */
public class TestGreatestCommonDivisor {

	/**
	 * Tests the GCD method
	 * 
	 * @throws Exception
	 *             Expects only natural numbers
	 */
	@Test
	public final void testGCD() throws Exception {
		assertEquals(5, GreatestCommonDivisor.gcd(10, 25));
	}

	/**
	 * Tests the Least common multiple method.
	 * 
	 * @throws Exception
	 *             Expected natural numbers
	 */
	@Test
	public final void testLCM() throws Exception {
		assertEquals(50, GreatestCommonDivisor.lcm(10, 25));
	}

	/**
	 * Tests for inserting integers.
	 */
	@Test
	public final void testInsertInteger() {
		Scanner consoleInput = new Scanner("5");
		assertEquals(5, GreatestCommonDivisor.insertInteger("OK", consoleInput));
		try {
			consoleInput = new Scanner("f");
			GreatestCommonDivisor.insertInteger("Expects integer...", consoleInput);
		} catch (Exception e) {
			e.equals("java.util.InputMismatchException");
		}
	}
}
