package com.sirma.itt.javacourse.designpatterns.patterns.state;

/**
 * ITTE-1916 State design pattern.
 * 
 * @author Petar Ivanov
 */
public interface State {
	/**
	 * Setter method for state of {@link Bit}
	 * 
	 * @param bit
	 *            Object that will tune.
	 * @return Internal state of the object.
	 */
	int getState(Bit bit);
}
