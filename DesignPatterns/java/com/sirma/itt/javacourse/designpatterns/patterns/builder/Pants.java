package com.sirma.itt.javacourse.designpatterns.patterns.builder;

/**
 * ITTE-1900 Builder design pattern. Lower part Pants.
 * 
 * @author Petar Ivanov
 */
public class Pants extends LowerPart {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String name() {
		return "Pants classic";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public float price() {
		return 99.20f;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String colour() {
		return "dark gray";
	}
}
