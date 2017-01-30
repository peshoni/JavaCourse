package com.sirma.itt.javacourse.designpatterns.patterns.chainofresponsibility;

/**
 * ITTE-1901 Chain of responsibility design pattern. Class that will catch tne
 * given request.
 * 
 * @author Petar Ivanov
 */
public class SecondCatcher implements Handler {
	private Handler nextHandler;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void handleRequest(String request) {
		if (request.toLowerCase().contains("second")) {
			System.out.println("Second catcher..");
		} else {
			nextHandler.handleRequest(request);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Handler setNextHandler(Handler handler) {
		this.nextHandler = handler;
		return nextHandler;
	}
}
