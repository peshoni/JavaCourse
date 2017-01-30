package com.sirma.itt.javacourse.designpatterns.patterns.state;

/**
 * ITTE-1916 State design pattern. Class that allows his object to behave
 * different ways based upon his internal state.
 * 
 * @author Petar Ivanov
 */
public class Bit {
	private State state;

	/**
	 * Constructs object that may different internal state .
	 */
	public Bit() {
		state = null;
	}

	/**
	 * Setter method for state.
	 * 
	 * @param state
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * Getter state method.
	 * 
	 * @return state
	 */
	public State getState() {
		return state;
	}
}
