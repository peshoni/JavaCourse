package com.sirma.itt.javacourse.exceptions.readsnumbersfromconsole;

/**
 * ITTE-1729 Custom exception that occurs when input number is out of range.
 * 
 * @author Petar Ivanov
 */

public class ReaderException extends RuntimeException {
	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = 2340574901480340075L;

	/**
	 * Constructor for the exception using message.
	 * 
	 * @param message
	 *            The message of the exception.
	 */
	public ReaderException(String message) {
		super(message);
	}

	/**
	 * Constructor for the exception using a message and cause.
	 * 
	 * @param message
	 *            The message of the exception.
	 * @param cause
	 *            The cause of exception.
	 */
	public ReaderException(String message, Throwable cause) {
		super(message, cause);
	}
}
