package com.sirma.itt.javacourse.designpatterns.patterns.observer;

/**
 * ITTE-1914 Observer design pattern. Abstract class Observer.
 * 
 * @author Petar Ivanov
 */
public abstract class Observer {
	/**
	 * Seller that make sales and notify other observers.
	 */
	protected Seller seller;

	/**
	 * Update notifying from Seller.
	 */
	public abstract void update();
}
