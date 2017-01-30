package main.java.com.sirma.itt.javacourse.intro.greatestcommondivisor;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1540 Utility class that contains methods for finding greater common divisor and least common multiple.
 * 
 * @author Petar Ivanov
 */
public final class GreatestCommonDivisor {
	private static final Logger LOGGER = LoggerFactory.getLogger(GreatestCommonDivisor.class);

	/**
	 * Utility classes should not have a public or default constructor.
	 */
	private GreatestCommonDivisor() {
	}

	/**
	 * Calculates greatest common divisor of two integers.
	 * 
	 * @param firstInteger
	 *            to calculate it
	 * @param secondInteger
	 *            to calculate it
	 * @return Greatest common divisor of two integers
	 */
	public static int gcd(final int firstInteger, final int secondInteger) {
		if (firstInteger < 0 || secondInteger < 0) {
			throw new IllegalArgumentException("Enter a numbers greater than zero! ");
		}
		int integerOne = firstInteger;
		int integerTwo = secondInteger;

		if (integerOne == 0) {
			return integerTwo;
		}

		while (integerTwo != 0) {
			if (integerOne > integerTwo) {
				integerOne -= integerTwo;
			} else {
				integerTwo -= integerOne;
			}
		}
		return integerOne;
	}

	/**
	 * Calculates least common multiple of two integers.
	 * 
	 * @param firstInteger
	 *            to calculate it
	 * @param secondInteger
	 *            to calculate it
	 * @return Least common multiple of two integers
	 */
	public static int lcm(final int firstInteger, final int secondInteger) {
		if (firstInteger <= 0 || secondInteger <= 0) {
			throw new IllegalArgumentException("Enter a numbers greater than zero! ");
		}
		int integer1 = firstInteger;
		int integer2 = secondInteger;
		return (integer1 * integer2) / gcd(integer1, integer2);
	}

	/**
	 * Reads number from console.
	 * 
	 * @param info
	 *            Text message to the user
	 * @param consoleInput
	 *            Input values from keyboard
	 * @return Entered number
	 */

	public static int insertInteger(final String info, final Scanner consoleInput) {
		int integer = 0;
		do {
			LOGGER.info(info);
			integer = consoleInput.nextInt();
		} while (integer < 0);
		return integer;
	}
}
