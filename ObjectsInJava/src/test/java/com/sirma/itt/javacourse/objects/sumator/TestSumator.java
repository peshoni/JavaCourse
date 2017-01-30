package com.sirma.itt.javacourse.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

/**
 * * ITTE-1594 Tests class Sumator.
 * 
 * @author Petar Ivanov
 */
public class TestSumator {
	Sumator sumator = new Sumator();

	/**
	 * Tests suming of two integer.
	 */
	@Test
	public final void testInt() {
		int intOne = 5;
		int intTwo = 10;

		int sumInt = sumator.sum(intOne, intTwo);
		Assert.assertEquals(15, sumInt);
	}

	/**
	 * Test suming ot two float.
	 */
	@Test
	public final void testFloat() {
		float floatOne = 1.123456f;
		float floatTwo = 9.998563f;

		float sumFloat = sumator.sum(floatOne, floatTwo);
		Assert.assertEquals(11.122019f, sumFloat, 0);
	}

	/**
	 * Tests summing strings method.
	 */
	@Test
	public final void testString() {
		String stringOne = "123456789";
		String stringTwo = "999999999";
		String sumString = sumator.sum(stringOne, stringTwo);
		String expected = "1123456788";

		Assert.assertEquals(sumString, expected);
	}

	/**
	 * Tests summing two BigInteger objects.
	 */
	@Test
	public final void tetsBigInteger() {
		BigInteger bigIntOne = new BigInteger("2559966668686865621311246");
		BigInteger bigIntTwo = new BigInteger("9999999999999999999999999");
		BigInteger expected = bigIntOne.add(bigIntTwo);
		BigInteger result = sumator.sum(bigIntOne, bigIntTwo);

		Assert.assertEquals(expected, result);
	}

	/**
	 * Tests summing two BigDecimal objects.
	 */
	@Test
	public final void testBigDecimal() {
		BigDecimal bigDecimalOne = new BigDecimal("125639.95534566");
		BigDecimal bigDecimalTwo = new BigDecimal("13134968798313.654913134444");
		BigDecimal expected = bigDecimalOne.add(bigDecimalTwo);
		BigDecimal result = sumator.sum(bigDecimalOne, bigDecimalTwo);

		Assert.assertEquals(expected, result);

	}

}
