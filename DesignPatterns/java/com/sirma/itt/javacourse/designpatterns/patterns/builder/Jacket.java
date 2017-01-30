package com.sirma.itt.javacourse.designpatterns.patterns.builder;

/**
 * ITTE-1900 Builder design pattern. Upperpart Jacket. Properties methods.
 * 
 * @author Petar Ivanov
 */
public class Jacket extends UpperPart {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String name() {
		return "Jacket \"Mellor\"";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public float price() {
		return 239.99f;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String colour() {
		return "gray";
	}
}
