package com.sirma.itt.javacourse.designpatterns.patterns.chainofresponsibility;

/**
 * ITTE-1901 Chain of responsibility design pattern. Class that will catch tne
 * given request.
 * 
 * @author Petar Ivanov
 */
public class LastCatcher implements Handler {
	private Handler nextHandler;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void handleRequest(String request) {
		System.out.println("Last catcher..");
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
