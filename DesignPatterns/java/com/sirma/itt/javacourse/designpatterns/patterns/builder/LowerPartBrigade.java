package com.sirma.itt.javacourse.designpatterns.patterns.builder;

/**
 * ITTE-1900 Builder design pattern. Implements Sew interface.
 * 
 * @author Petar Ivanov
 */
public class LowerPartBrigade implements Sew {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String sew() {
		return "Lower parts is ready.";
	}
}
