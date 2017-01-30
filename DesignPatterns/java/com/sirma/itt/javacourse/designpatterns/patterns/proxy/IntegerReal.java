package com.sirma.itt.javacourse.designpatterns.patterns.proxy;

/**
 * ITTE-1913 Proxy design pattern. Real class.
 * 
 * @author Petar Ivanov
 */
public class IntegerReal {
	private int integer;

	/**
	 * Creates object.
	 * 
	 * @param integer
	 */
	public IntegerReal(int integer) {
		this.integer = integer;
	}

	/**
	 * Doing some calculations.
	 * 
	 * @return
	 */
	public double sqrt() {
		System.out.println("Actually " + this.getClass().getSimpleName() + ".class calculated.");
		return Math.sqrt(integer);
	}
}
