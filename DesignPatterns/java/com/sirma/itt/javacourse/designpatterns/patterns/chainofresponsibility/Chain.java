package com.sirma.itt.javacourse.designpatterns.patterns.chainofresponsibility;

/**
 * ITTE-1901 Chain of responsibility design pattern.
 * 
 * @author Petar Ivanov
 */
public class Chain implements Handler {
	private Handler first;
	private Handler second;
	private Handler next;

	/**
	 * Construct chain with the given order of handlers.
	 * 
	 * @param first
	 *            {@link Handler}
	 * @param second
	 *            {@link Handler}
	 * @param third
	 *            {@link Handler}
	 */
	public Chain(Handler first, Handler second, Handler third) {
		this.first = first;
		this.second = second;
		this.first.setNextHandler(second);
		this.second.setNextHandler(third);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void handleRequest(String request) {
		first.handleRequest(request);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Handler setNextHandler(Handler handler) {
		this.next = handler;
		return next;
	}
}
