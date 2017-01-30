package com.sirma.itt.javacourse.designpatterns.patterns.builder;

/**
 * ITTE-1900 Builder design pattern. Lower part Skirt and his properties.
 * 
 * @author Petar Ivanov
 */
public class Skirt extends LowerPart {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String name() {
		return "Skirt \"Dreams\"";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public float price() {
		return 63.90f;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String colour() {
		return "yellow";
	}
}
