package com.sirma.itt.javacourse.designpatterns.patterns.decorator;

/**
 * ITTE-1904 Decorator design pattern.
 * 
 * @author Petar Ivanov
 */
public class SuperCalculator extends Decorator {
	/**
	 * Creates a decorator using an object from a class implementing
	 * {@link Calculate}.
	 * 
	 * @param calculator
	 *            the object
	 */
	public SuperCalculator(Calculate calculator) {
		super(calculator);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int sum(int a, int b) {
		return super.sum(a, b);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int subtract(int a, int b) {
		return super.subtract(a, b);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public float division(int a, int b) {
		return (float) a / b;
	}
}
