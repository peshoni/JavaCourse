package com.sirma.itt.javacourse.designpatterns.patterns.bridge;

/**
 * ITTE-1899 Bridge design pattern. Possititon of the player - forward.
 * 
 * @author Petar Ivanov
 */
public class Forward implements Playing {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void play(String name) {
		System.out.println("I, " + name + "  play as a forward.");
	}
}
