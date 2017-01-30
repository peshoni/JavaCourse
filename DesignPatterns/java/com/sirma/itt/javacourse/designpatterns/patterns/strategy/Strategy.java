package com.sirma.itt.javacourse.designpatterns.patterns.strategy;

/**
 * ITTE-1917 Strategy design pattern. The implementations of this interface give
 * different concrete actions for implementing the strategy.
 * 
 * @author Petar Ivanov
 */
public interface Strategy {
	/**
	 * Swapping the actions.
	 */
	public void goAhead();
}
