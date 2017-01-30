package com.sirma.itt.javacourse.designpatterns.patterns.builder;

/**
 * ITTE-1900 Buidler design pattern. Upper part Shirt.
 * 
 * @author Petar Ivanov
 */
public class Shirt extends UpperPart {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String name() {
		return "Shirt \"Berola\"";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public float price() {
		return 129.55f;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String colour() {
		return "lite orange";
	}
}
