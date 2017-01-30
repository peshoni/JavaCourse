package com.sirma.itt.javacourse.designpatterns.patterns.proxy;

/**
 * ITTE-1913 Proxy design pattern.
 * 
 * @author Petar Ivanov
 */
public class IntegerFactory {
	/**
	 * Private constructor
	 */
	private IntegerFactory() {
	}

	/**
	 * Creates instance of the IntegerReal class.
	 * 
	 * @return Instance of IntegerReal class.
	 */
	public static IntegerReal createInstance(int integer) {
		return new IntegerReal(integer);
	}
}
