package main.java.com.sirma.itt.javacourse.intro.greatestcommondivisor;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1540 Runs GreatestGommonDivisor class.
 * 
 * @author Petar Ivanov
 */
public final class RunGreatestCommonDivisor {

	private static final Logger LOGGER = LoggerFactory.getLogger(RunGreatestCommonDivisor.class);

	/**
	 * Utility classes should not have a public or default constructor.
	 */
	private RunGreatestCommonDivisor() {
	}

	/**
	 * Run main method
	 * 
	 * @param args
	 *            Arguments of the main method
	 */
	public static void main(String[] args) {
		int firstInteger = 0;
		int secondInteger = 0;
		int gcd = 0;
		int lcm = 0;
		Scanner consoleInput = new Scanner(System.in,"UTF-8");

		firstInteger = GreatestCommonDivisor.insertInteger("Enter first integer: ", consoleInput);
		secondInteger = GreatestCommonDivisor.insertInteger("Enter second integer: ", consoleInput);
		consoleInput.close();

		gcd = GreatestCommonDivisor.gcd(firstInteger, secondInteger);
		lcm = GreatestCommonDivisor.lcm(firstInteger, secondInteger);

		if (gcd > 0 && lcm > 0) {
			LOGGER.info("The Greatest common divisor of " + firstInteger + " and " + secondInteger + " is: " + gcd);
			LOGGER.info("The Least common multiple of " + firstInteger + " and " + secondInteger + " is: " + lcm);
		}
	}
}
