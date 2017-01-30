package com.sirma.itt.javacourse.designpatterns.patterns.state;

/**
 * ITTE-1916 State design pattern. One state of bit.
 * 
 * @author Petar Ivanov
 */
public class One implements State {
	private int state = 1;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getState(Bit bit) {
		bit.setState(this);
		return state;
	}
}
