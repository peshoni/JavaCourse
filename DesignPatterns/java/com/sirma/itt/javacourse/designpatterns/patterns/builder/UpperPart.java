package com.sirma.itt.javacourse.designpatterns.patterns.builder;

/**
 * ITTE-1900 Builder design pattern. Upper part of the suit.
 * 
 * @author Petar Ivanov
 */
public abstract class UpperPart implements Components {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Sew sew() {
		return new UpperPartBrigade();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public abstract float price();
}
