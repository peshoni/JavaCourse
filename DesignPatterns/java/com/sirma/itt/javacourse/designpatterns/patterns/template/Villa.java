package com.sirma.itt.javacourse.designpatterns.patterns.template;

/**
 * ITTE - 1918 Template design pattern. This class implements the abstract
 * method of {@link House}.
 * 
 * @author Petar Ivanov
 */
public class Villa extends House {
	/**
	 * {@inheritDoc}
	 */
	@Override
	void buildTheFundaments() {
		System.out.println("Fundamentals are done, there is still much work to do.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	void buildeTheWalls() {
		System.out.println("Oh, and the walls are finished. Not much remained.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	void buildTheRoof() {
		System.out.println("The house is ready. Welcome to your key.");
	}
}
