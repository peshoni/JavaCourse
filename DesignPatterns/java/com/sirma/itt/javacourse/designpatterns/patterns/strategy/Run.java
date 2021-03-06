package com.sirma.itt.javacourse.designpatterns.patterns.strategy;

/**
 * ITTE-1917 Strategy design pattern.
 * 
 * @author Petar Ivanov
 */
public class Run implements Strategy {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void goAhead() {
		System.out.print("Run...");
	}
}
