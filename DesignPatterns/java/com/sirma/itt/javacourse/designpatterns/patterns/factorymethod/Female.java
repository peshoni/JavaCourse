package com.sirma.itt.javacourse.designpatterns.patterns.factorymethod;

/**
 * ITTE-1906 Factory method.
 * 
 * @author Petar Ivanov
 */
public class Female implements HumanInterface {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void basicFunction() {
		System.out.println("Female created: I'm ready to talk a lot!");
	}
}