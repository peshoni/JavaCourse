package com.sirma.itt.javacourse.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

import main.java.com.sirma.itt.javacourse.intro.summinglargenumbers.SummingLargeNumbers;

/**
 * ITTE-1594 Class sumator. Conteins metod for summing: integers,
 * floats,BigIntegers, BigDecimals and Strings.
 * 
 * @author Petar Ivanov
 */
public class Sumator {
	/**
	 * A method that calculates the sum of two integers.
	 * 
	 * @param a
	 *            First addend.
	 * @param b
	 *            Second addend.
	 * @return Integer sum of addends
	 */
	public int sum(int a, int b) {
		return a + b;
	}

	/**
	 * A method that calculates the sum of two floats.
	 * 
	 * @param a
	 *            First addend.
	 * @param b
	 *            Second addend.
	 * @return Float sum of addends.
	 */
	public float sum(float a, float b) {
		return a + b;
	}

	/**
	 * A method that calculates the sum of two Big integers.
	 * 
	 * @param a
	 *            First addend.
	 * @param b
	 *            Second addend.
	 * @return The sum of the two Big integers.
	 */
	public BigInteger sum(BigInteger a, BigInteger b) {
		return a.add(b);
	}

	/**
	 * A method that calculates the sum of two Big decimals.
	 * 
	 * @param a
	 *            First addend.
	 * @param b
	 *            Second addend.
	 * @return The sum of two Big decimals.
	 */
	public BigDecimal sum(BigDecimal a, BigDecimal b) {
		return a.add(b);
	}

	/**
	 * A method that calculates the sum of two strings.
	 * 
	 * @param a
	 *            First addend.
	 * @param b
	 *            Second addend.
	 * @return String with sum of two strings.
	 */
	public String sum(String a, String b) {
		return SummingLargeNumbers.summingLargeNumbers(a, b);
	}
}
