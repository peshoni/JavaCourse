package com.sirma.itt.javacourse.designpatterns.patterns.state;

/**
 * ITTE-1916 State design pattern. Zero state of bit.
 * 
 * @author Petar Ivanov
 */
public class Zero implements State {
	private int state;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getState(Bit bit) {
		bit.setState(this);
		return state;
	}
}
