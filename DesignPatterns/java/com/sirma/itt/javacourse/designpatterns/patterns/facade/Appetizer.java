package com.sirma.itt.javacourse.designpatterns.patterns.facade;

/**
 * ITTE-1905 Facade design pattern.
 * 
 * @author Petar Ivanov
 */
public class Appetizer implements Cook {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void shop() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void cleansingProducts() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void readRecipy() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void cook() {
		System.out.println("Appetizer is ready!");
	}
}
