package com.sirma.itt.javacourse.exceptions.list;

/**
 * ITTE-1730 Custom exception that is throwing at an full list.
 * 
 * @author Petar Ivanov
 */
public class FullListException extends RuntimeException {
	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = -6734417058307736285L;

	/**
	 * Constructor that preserves original stack trace.
	 * 
	 * @param exception
	 *            which will keep.
	 */
	public FullListException(Exception exception) {
		super(exception);
	}

	/**
	 * Constructor with exception message.
	 * 
	 * @param message
	 *            The message of the exception.
	 */
	public FullListException(String message) {
		super(message);
	}

	/**
	 * Constructor for chaining exceptions.
	 * 
	 * @param message
	 *            The message of the exception.
	 * @param cause
	 *            The exception that caused the exception.
	 */
	public FullListException(String message, Throwable cause) {
		super(message, cause);
	}
}
