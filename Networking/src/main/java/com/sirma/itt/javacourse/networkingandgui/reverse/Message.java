package com.sirma.itt.javacourse.networkingandgui.reverse;

/**
 * Memento design pattern.
 * 
 * @author Petar Ivanov
 */
public class Message {
	private String message;

	/**
	 * 
	 * @param message
	 */
	public void nextMessage(String message) {
		this.message = message;
	}

	/**
	 * 
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(message);
	}

	/**
	 * Return to previous level in memory.
	 * 
	 * @param memento
	 *            Memento for the previous message.
	 */
	public String undo(Memento memento) {
		return message = memento.getMessage();
	}

}
