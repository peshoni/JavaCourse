package com.sirma.itt.javacourse.designpatterns.patterns.factorymethod;

/**
 * ITTE-1906 Factory method.
 * 
 * @author Petar Ivanov
 */
public class Male implements HumanInterface {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void basicFunction() {
		System.out.println("Male created: I still have not added patience as a function!");
	}
}
