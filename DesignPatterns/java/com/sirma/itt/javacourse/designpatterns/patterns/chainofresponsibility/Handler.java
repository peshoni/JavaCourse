package com.sirma.itt.javacourse.designpatterns.patterns.chainofresponsibility;

/**
 * ITTE-1901 Chain of responsibility design pattern.
 * 
 * @author Petar Ivanov
 */
public interface Handler {
	/**
	 * Method that try catch the request.
	 * 
	 * @param String
	 *            with request.
	 */
	public void handleRequest(String request);

	/**
	 * Setter method to the next handler.
	 * 
	 * @param handler
	 *            Handler to be next.
	 * @return Next handler.
	 */
	public Handler setNextHandler(Handler handler);
}
