package com.sirma.itt.javacourse.designpatterns.patterns.decorator;

/**
 * ITTE-1904 Decorator design pattern. This interface describes basic
 * mathematical functions for calculator.
 * 
 * @author Petar Ivanov
 */
public interface Calculate {
	/**
	 * Sum of two integers.
	 * 
	 * @param a
	 *            For proccessing.
	 * @param b
	 *            For proccessing.
	 * @return Sum.
	 */
	public int sum(int a, int b);

	/**
	 * The difference of two numbers.
	 * 
	 * @param a
	 *            For proccessing.
	 * @param b
	 *            For proccessing.
	 * @return result of sustraction.
	 */
	public int subtract(int a, int b);
}
