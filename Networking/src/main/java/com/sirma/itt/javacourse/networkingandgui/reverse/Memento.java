package com.sirma.itt.javacourse.networkingandgui.reverse;

/**
 * ITTE-1911 Memento design pattern. Class that stores visited floors.
 * 
 * @author Petar Ivanov
 */
public class Memento {
	private final String message;

	/**
	 * 
	 * @param message
	 */
	public Memento(String message) {
		this.message = message;
	}

	/**
	 * Getter method for message.
	 * 
	 * @return the floor
	 */
	public String getMessage() {
		return message;
	}
}
