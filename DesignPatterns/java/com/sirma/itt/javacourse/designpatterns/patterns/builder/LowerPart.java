package com.sirma.itt.javacourse.designpatterns.patterns.builder;

/**
 * ITTE-1900 Builder design pattern. Lower part of the suit.
 * 
 * @author Petar Ivanov
 */
public abstract class LowerPart implements Components {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Sew sew() {
		return new LowerPartBrigade();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public abstract float price();
}
