package com.sirma.itt.javacourse.designpatterns.patterns.strategy;

/**
 * ITTE-1917 Strategy design pattern.
 * 
 * @author Petar Ivanov
 */
public class Context {
	private Strategy runStrategy;

	/**
	 * Creates instance that execute given strategy.
	 * 
	 * @param strartegy
	 */
	public Context(Strategy strartegy) {
		this.runStrategy = strartegy;
	}

	/**
	 * Execute strategy.
	 */
	public void go() {
		runStrategy.goAhead();
	}
}
