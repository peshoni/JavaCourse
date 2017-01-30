package com.sirma.itt.javacourse.designpatterns.patterns.decorator;

/**
 * ITTE-1904 Decorator design pattern. Class that implements {@link Calculate}}
 * interface.
 * 
 * @author Petar Ivanov
 */
public class Calculator implements Calculate {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int subtract(int a, int b) {
		return a - b;
	}
}
