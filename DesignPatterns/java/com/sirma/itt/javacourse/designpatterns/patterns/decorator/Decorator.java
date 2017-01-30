package com.sirma.itt.javacourse.designpatterns.patterns.decorator;

/**
 * ITTE-1904 Decorator design pattern. Decorator class for the {@link Calculate}
 * objects. Adds multimplication and division options.
 * 
 * @author Petar Ivanov
 */
public abstract class Decorator implements Calculate {
	protected Calculate calculator;

	/**
	 * Creates Decorator for {@link Calculate} object.
	 * 
	 * @param calculator
	 */
	public Decorator(Calculate calculator) {
		this.calculator = calculator;
	}

	/**
	 * {@inheritDoc}
	 */
	public int sum(int a, int b) {
		return calculator.sum(a, b);
	}

	/**
	 * {@inheritDoc}
	 */
	public int subtract(int a, int b) {
		return calculator.subtract(a, b);
	}

	/**
	 * Adds multiplication.
	 * 
	 * @param a
	 *            First integer.
	 * @param b
	 *            Second integer.
	 * @return Result of calculation.
	 */
	public abstract int multiplication(int a, int b);

	/**
	 * Adds division.
	 * 
	 * @param a
	 *            First integer.
	 * @param b
	 *            Second integer.
	 * @return Result of calculation.
	 */
	public abstract float division(int a, int b);
}
