package com.sirma.itt.javacourse.exceptions.list;

/**
 * ITTE-1730 Custom exception that is throwing at an empty list.
 * 
 * @author Petar Ivanov
 */
public class EmptyListException extends RuntimeException {
	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = -2660944477181250461L;

	/**
	 * Constructor that preserves original stack trace.
	 * 
	 * @param exception
	 *            which will keep.
	 */
	public EmptyListException(Exception exception) {
		super(exception);
	}

	/**
	 * Constructor with exception message.
	 * 
	 * @param message
	 *            The message of the exception.
	 */
	public EmptyListException(String message) {
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
	public EmptyListException(String message, Throwable cause) {
		super(message, cause);
	}
}
